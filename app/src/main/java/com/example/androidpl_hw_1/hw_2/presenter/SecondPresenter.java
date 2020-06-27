package com.example.androidpl_hw_1.hw_2.presenter;


import com.example.androidpl_hw_1.hw_2.model.SecondModel;
import com.example.androidpl_hw_1.hw_2.view.SecondView;

import moxy.InjectViewState;
import moxy.MvpPresenter;


@InjectViewState
public class SecondPresenter extends MvpPresenter<SecondView> {

    private SecondModel secondModel;

    public SecondPresenter() {
        secondModel = new SecondModel();
    }

    public void onButtonSecondClick(String text) {
        if (text.isEmpty()) return;
        getViewState().setEditText(secondModel.getResultText(text));
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }
}
