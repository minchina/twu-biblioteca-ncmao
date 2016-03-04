package com.tw.biblioteca.domain;

import com.tw.biblioteca.enumeration.Status;

import static com.tw.biblioteca.enumeration.Status.AVAILABLE;

public class Item {

    private Status status = AVAILABLE;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
