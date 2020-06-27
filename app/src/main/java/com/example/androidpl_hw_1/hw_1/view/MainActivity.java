package com.example.androidpl_hw_1.hw_1.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidpl_hw_1.R;
import com.example.androidpl_hw_1.hw_1.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView{

    protected EditText editText;
    private TextView textView;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    void initView() {
        editText = findViewById(R.id.edit_text);
        textView = findViewById(R.id.text_view);
        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void setEditText(String text) {
        textView.setText(text);
    }

    public void onClick(View view) {
        mainPresenter.onButtonClick(editText.getText().toString());
    }
}
