package wizelineacademy.mvvm.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import wizelineacademy.mvvm.R;
import wizelineacademy.mvvm.model.DataBase;
import wizelineacademy.mvvm.model.Pojo;
import wizelineacademy.mvvm.viewModel.PojoViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
