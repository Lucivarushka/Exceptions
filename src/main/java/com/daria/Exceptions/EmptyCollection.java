package com.daria.Exception;

public class EmptyCollection extends Exception {
    private int size;

    public int getSize() {
        return size;
    }

    public EmptyCollection(String message, int size) {
        super(message);
        this.size = size;
    }
}
