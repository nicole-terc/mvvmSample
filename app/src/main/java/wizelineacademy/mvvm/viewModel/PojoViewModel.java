package wizelineacademy.mvvm.viewModel;

import android.view.View;

import wizelineacademy.mvvm.model.Pojo;
import wizelineacademy.mvvm.model.DataBase;

/**
 * Created by Nicole Terc on 7/20/17.
 */

public class PojoViewModel extends ViewModel {
    private Pojo item;
    private DataBase dataBase;

    private String message;

    public PojoViewModel(DataBase dataBase) {
        this.dataBase = dataBase;
        setItem(dataBase.getSavedPojo());
    }

    public void setItem(Pojo item) {
        this.item = item;
        this.message = item.getMessage();
    }

    public String getMessage() {
        return capitalizeFirstLetters(item.getMessage());
    }

    public void setMessage(String message) {
        item.setMessage(message);
    }

    public void updateMessage(View view) {
        if (!capitalizeFirstLetters(message).equals(item.getMessage())) {
            dataBase.updatePojo(item);
        }
    }

    private String capitalizeFirstLetters(String text) {
        if (text.isEmpty()) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        String[] words = text.split(" ");
        for (String word : words) {
            char[] letters = word.trim().toCharArray();
            letters[0] = Character.toUpperCase(letters[0]);
            word = new String(letters);

            stringBuilder.append(word).append(" ");
        }

        return stringBuilder.toString().trim();
    }
}
