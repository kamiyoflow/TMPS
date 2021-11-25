package com.company.Police.decorator;

public class thief extends BoardDecorator {

    public thief(criminalBoard board) {
        super(board);
    }

    public String attach() {
        return super.attach() + attachThief();
    }

    private String attachThief() {
        return " thief";
    }
}