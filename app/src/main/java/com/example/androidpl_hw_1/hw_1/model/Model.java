package com.example.androidpl_hw_1.hw_1.model;

public class Model {
    private String resultText = "";

    public String getResultText(String text) {
        resultText = String.format("%s %s", resultText, text);
        return resultText;
    }
}
