package com.example.bibek.tensorflowlitedemo.Models;

public interface Classifier {
    String name();

    Classification recognize(final float[] pixels);
}

