package com.company.Police.decorator;

public abstract class BoardDecorator implements criminalBoard{
    private criminalBoard board;

    public BoardDecorator(criminalBoard board) {
        this.board = board;
    }

    @Override
    public String attach(){
        return board.attach();
    }

}
