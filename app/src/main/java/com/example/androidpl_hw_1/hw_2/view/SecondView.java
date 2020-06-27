package com.example.androidpl_hw_1.hw_2.view;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface SecondView extends MvpView {

    @StateStrategyType(value = AddToEndStrategy.class)
    void setEditText(String text);
}
