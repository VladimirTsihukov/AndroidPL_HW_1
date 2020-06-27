package com.example.androidpl_hw_1.hw_1.presenter;

import com.example.androidpl_hw_1.hw_1.model.Model;
import com.example.androidpl_hw_1.hw_1.view.MainView;

public class MainPresenter {

    private Model model;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        model = new Model();
    }

    public void onButtonClick(String text) {
        if(text.isEmpty()) return;
        mainView.setEditText(model.getResultText(text));
    }
}
