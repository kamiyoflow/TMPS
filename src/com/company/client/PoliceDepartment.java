package com.company.client;
import com.company.Police.Dispatch911;
import com.company.Police.singleton.Administration;
import com.company.Police.factorymethod.GenerateCall;
import com.company.data.prototype.Archives;
import com.company.Police.facade.Arrest;
import com.company.Police.decorator.*;
import com.company.Police.adapter.*;


import java.io.*;

public class PoliceDepartment {

    public static void main(String[] args) throws IOException {
        String yourType;
        GenerateCall getGeneratedCall = new GenerateCall();
        System.out.println("This is the Police Department of Texas!");
        System.out.println("===============================================");
        System.out.println("Make a call, press 1;\nIntroduce crime info, press 2;\nRequest an order for arrest, press 3;\nRequest for an arrest, press 4;\nRequest for patrol, press 5;\nCheck criminal board, press 6;\nGo to shooting range, press 7!");
        BufferedReader check = new BufferedReader(new InputStreamReader(System.in));
        yourType = check.readLine();
        if (yourType.equalsIgnoreCase("1")) {
            System.out.println("911 Dispatch, what is your emergency?: ");
            BufferedReader Disp = new BufferedReader(new InputStreamReader(System.in));

            String incomingCall = Disp.readLine();

            Dispatch911 D = getGeneratedCall.getOurCall(incomingCall);

            System.out.println("Hold on! We got you");
            D.getCall();
        }
        else if(yourType.equalsIgnoreCase("2")) {
            BufferedReader Crime =new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Criminal Id: ");
        int cid = Integer.parseInt(Crime.readLine());
        System.out.print("\n");

        System.out.print("Enter Criminal Name: ");
        String cname = Crime.readLine();
        System.out.print("\n");

        System.out.print("Enter Criminal Age: ");
        int cage = Integer.parseInt(Crime.readLine());
        System.out.print("\n");

        System.out.print("Enter Criminal Address: ");
        String caddress = Crime.readLine();
        System.out.print("\n");

        System.out.print("Enter Type of Crime: ");
        String tOfCrime = Crime.readLine();
        System.out.print("\n");

        Archives criminalInfo = new Archives(cid,cname,cage,tOfCrime,caddress);

        criminalInfo.showCrime();
        System.out.println("\n");
        Archives archivedCriminalInfo = (Archives) criminalInfo.getClone();
        System.out.println("Archived info which will be transferred to FBI");
        archivedCriminalInfo.showCrime();
    }
        else if(yourType.equalsIgnoreCase("3")) {
            Administration order = Administration.getOrder();
            order.showConfirmation();
        }
        else if(yourType.equalsIgnoreCase("4")) {
            Arrest Arr = new Arrest();
            Arr.Arresting();
        }
        else if(yourType.equalsIgnoreCase("5")) {
            Arrest Arr = new Arrest();
            Arr.Patrolling();
        }
        else if(yourType.equalsIgnoreCase("6")) {
            criminalBoard crimB1 = new thief(new thief(new thief(new criminalBoardImpl())));
            criminalBoard crimB2 = new maniac(new thief(new thief(new maniac(new drugDealer(new drugDealer(new criminalBoardImpl()))))));
            System.out.println(crimB1.attach());
            System.out.println(crimB2.attach());
        }
        else if(yourType.equalsIgnoreCase("7")) {
            System.out.println("Your gun, cowboy! Take your time!");
            Weapon glock = new Glock();
            WeaponAdapter glockAdpt = new WeaponAdapterImpl(glock);
            System.out.println(glockAdpt.getWeapon());
            Weapon m4 = new M4A1();
            WeaponAdapter m4Adpt = new WeaponAdapterImpl(m4);
            System.out.println(m4Adpt.getWeapon());
        }
    }



}
