package com.company.Police.decorator;


public class drugDealer extends BoardDecorator {

    public drugDealer(criminalBoard board) {
        super(board);
    }

    public String attach() {
        return super.attach() + attachDealer();
    }

    private String attachDealer() {
        return " drugDealer";
    }
}