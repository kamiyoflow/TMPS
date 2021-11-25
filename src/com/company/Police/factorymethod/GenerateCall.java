package com.company.Police.factorymethod;

import com.company.Police.CrimeSceneUnit;
import com.company.Police.HandlerTeam;
import com.company.Police.PatrolDivision;
import com.company.Police.SWAT_Team;
import com.company.Police.Dispatch911;

public class GenerateCall {

    public Dispatch911 getOurCall(String incomingCall) {
        if (incomingCall == null)
            return null;


        if (incomingCall.equalsIgnoreCase("Terrorism")) {
            return new SWAT_Team();
        } else if (incomingCall.equalsIgnoreCase("Drugs")) {
            return new HandlerTeam();
        } else if (incomingCall.equalsIgnoreCase("Robbery")) {
            return new PatrolDivision();
        } else if (incomingCall.equalsIgnoreCase("Crime")) {
            return new CrimeSceneUnit();
        }
        return null;
    }
}
