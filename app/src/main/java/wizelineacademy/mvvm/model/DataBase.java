package wizelineacademy.mvvm.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicole Terc on 7/20/17.
 */

public class DataBase {
    public List<Pojo> getSavedPojos(){
        List<Pojo> list = new ArrayList<>();
        // retrieve pojo list from local storage
        return list;
    }

    public void savePojo(Pojo pojo){
        // Save Pojo in database
    }

    public void updatePojo(Pojo pojo){
        // Update Pojo in database
    }
}
