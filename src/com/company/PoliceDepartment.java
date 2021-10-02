package com.company;
import java.io.*;

public class PoliceDepartment {

    public static void main(String[] args) throws IOException {
        String yourType;
        GenerateCall getGeneratedCall = new GenerateCall();
        System.out.println("This is the Police Department of Texas!");
        System.out.println("===============================================");
        System.out.println("Make a call, press 1;\nIntroduce crime info, press 2;\nRequest an order for arrest, press 3!");
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
    }

}
