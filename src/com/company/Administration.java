package com.company;

public class Administration {

    private static Administration OrderforArrest = new Administration();

    private Administration() {
    }

    public static Administration getOrder(){
        return OrderforArrest;
    }

    public void showConfirmation(){
        System.out.println("Request for order was sent! You will be contacted soon for confirmation!");
    }
}
