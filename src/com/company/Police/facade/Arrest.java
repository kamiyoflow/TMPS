package com.company.Police.facade;

import com.company.Police.facade.arrestSystem.*;

public class Arrest {
    sendingPatrol SendPatrol = new sendingPatrol();
    checkingForAmmo checkAmmo = new checkingForAmmo();
    chopperAssist chopAssist = new chopperAssist();
    roadBlocking roadBlock = new roadBlocking();
    activePatrolling activPatrol = new activePatrolling();
    criminalIdentification crimIdent = new criminalIdentification();
    criminalArrest crimArr = new criminalArrest();
    criminalTransportation crimTr = new criminalTransportation();

    public void Arresting() {
        SendPatrol.sent();
        checkAmmo.checked();
        chopAssist.assist();
        roadBlock.blocked();
        activPatrol.patrolling();
        crimIdent.identify();
        crimArr.arrest();
        crimTr.transport();
    }

        public void Patrolling(){
            SendPatrol.sent();
            checkAmmo.checked();
            chopAssist.assist();
            System.out.println("Patrol is done");

    }


}
