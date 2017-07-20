package wizelineacademy.mvvm.viewModel;

import wizelineacademy.mvvm.model.Pojo;
import wizelineacademy.mvvm.model.DataBase;

/**
 * Created by Nicole Terc on 7/20/17.
 */

public class PojoViewModel extends ViewModel {
    private Pojo item;
    private DataBase dataBase;

    public PojoViewModel(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void setItem(Pojo item) {
        this.item = item;
    }

    public String getCapitalizedMessage(){
        String message = capitalizeFirstLetters(item.getMessage());
        return message;
    }

    public void updateMessage(String message){
        item.setMessage(message);
        dataBase.updatePojo(item);
    }

    private String capitalizeFirstLetters(String text){
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
