package com.example.myflagment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCar_click(View view){
        Fragment fragment ;
        fragment = new Fragment_car();
        FragmentManager fmg = getSupportFragmentManager();
        FragmentTransaction fmt = fmg.beginTransaction();
        fmt.replace(R.id.container1,fragment);
        fmt.commit();


    }
    public void btnStation_click(View view){
        Fragment fragment ;
        fragment = new fragment_station();
        FragmentManager fmg = getSupportFragmentManager();
        FragmentTransaction fmt = fmg.beginTransaction();
        fmt.replace(R.id.container1,fragment);
        fmt.commit();

    }
}