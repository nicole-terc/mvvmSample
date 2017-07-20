package wizelineacademy.mvvm.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import wizelineacademy.mvvm.R;
import wizelineacademy.mvvm.databinding.ActivityMainBinding;
import wizelineacademy.mvvm.model.DataBase;
import wizelineacademy.mvvm.model.Pojo;
import wizelineacademy.mvvm.viewModel.PojoViewModel;

public class MainActivity extends AppCompatActivity {

    private static final String DATA_BASE_PREFERENCES = "dataBasePreferences";

    private PojoViewModel viewModel;
    private DataBase dataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBase();
        bindView();
    }

    public void initDataBase(){
        dataBase = new DataBase(getSharedPreferences(DATA_BASE_PREFERENCES, MODE_PRIVATE));
    }

    public void bindView() {
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(getViewModel());
    }

    public PojoViewModel getViewModel() {
        viewModel = new PojoViewModel(dataBase);
        return viewModel;
    }
}
