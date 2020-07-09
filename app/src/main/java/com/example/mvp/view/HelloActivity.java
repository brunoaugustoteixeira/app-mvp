package com.example.mvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mvp.R;
import com.example.mvp.presenter.HelloPresenter;

public class HelloActivity extends AppCompatActivity implements HelloView{

    private TextView label;
    private HelloPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        label = (TextView) findViewById(R.id.hello_label);
        presenter = new HelloPresenter(this);
        presenter.onCreate();
    }

    @Override
    public void updateHelloLabel(String labelText) {
        label.setText(labelText);
    }
}