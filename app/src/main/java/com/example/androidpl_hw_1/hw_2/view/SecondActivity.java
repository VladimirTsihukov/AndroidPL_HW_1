package com.example.androidpl_hw_1.hw_2.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.androidpl_hw_1.R;
import com.example.androidpl_hw_1.hw_2.presenter.SecondPresenter;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;

public class SecondActivity extends MvpAppCompatActivity implements SecondView {

    protected EditText editText;
    private TextView textView;

    @InjectPresenter
    SecondPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    void initView() {
        editText = findViewById(R.id.edit_text_2);
        textView = findViewById(R.id.text_view_2);
    }

    @Override
    public void setEditText(String text) {
        textView.setText(text);
    }

    public void onClickSecond(View view) {
        presenter.onButtonSecondClick(editText.getText().toString());
    }
}
