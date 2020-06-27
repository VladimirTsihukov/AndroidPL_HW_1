package com.example.androidpl_hw_1.hw_2.model;

public class SecondModel {
    private String resultText = "";

    public String getResultText(String text) {
        resultText = String.format("%s %s", resultText, text);
        return resultText;
    }
}
