package com.company.Police.decorator;


public class maniac extends BoardDecorator {

    public maniac(criminalBoard board) {
        super(board);
    }

    public String attach() {
        return super.attach() + attachManiac();
    }

    private String attachManiac() {
        return " maniac";
    }
}