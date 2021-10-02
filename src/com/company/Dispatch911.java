package com.company;

public abstract class Dispatch911 {

protected String call;
public void getCall(){

}
}

class GenerateCall {

    public Dispatch911 getOurCall(String incomingCall) {
        if (incomingCall == null)
            return null;


        if (incomingCall.equalsIgnoreCase("Terrorism")) {
            return new SWAT_Team();
        } else if (incomingCall.equalsIgnoreCase("Drugs")) {
            return new HandlerTeam();
        } else if (incomingCall.equalsIgnoreCase("Robbery")) {
            return new PatrolDivision();
        }
        else if (incomingCall.equalsIgnoreCase("Crime")){
            return new CrimeSceneUnit();
        }
        return null;
    }
}
