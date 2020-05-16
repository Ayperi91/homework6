package com.company;

public class Main {

    private static Object getInfo;

    public static <Weapon> void main(String[] args, Weapon Weapon) {

        Boss b = new Boss();
        Weapon w= Weapon;
        b.Weapon("Pistol");
        w.type ("gunshot");
        w.name ("Orujie");
        


        System.out.println("Boss"+ "" + getInfo);
    }
}