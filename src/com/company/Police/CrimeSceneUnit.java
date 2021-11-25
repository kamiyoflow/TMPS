package com.company.Police;

public class CrimeSceneUnit extends Dispatch911 {
    @Override
    public void getCall() {
        call = "To police department! Call Crime Scene Unit, now!";
        System.out.println(call);
    }
}
