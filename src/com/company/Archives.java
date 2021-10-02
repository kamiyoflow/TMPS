package com.company;

public class Archives implements Prototype {
    String name, typeOfCrime, crimeAdress;
    int id, criminalAge;

    public Archives(int id, String name, int criminalAge, String typeOfCrime, String crimeAdress) {
        this.name = name;
        this.typeOfCrime = typeOfCrime;
        this.crimeAdress = crimeAdress;
        this.criminalAge = criminalAge;
        this.id = id;
    }

    public void showCrime(){
        System.out.println("Criminal's id: " + id+ "\t" + "Criminal's name: " + name + "\t" + "Criminal's age: " + criminalAge + "\t" + "Type of Crime: " + typeOfCrime + "\t" + "Criminal's Address: " + crimeAdress);
    }

    @Override
    public Prototype getClone(){

        return new Archives(id, name, criminalAge, typeOfCrime, crimeAdress);
    }
}
