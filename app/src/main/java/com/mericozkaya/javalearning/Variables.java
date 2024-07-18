package com.mericozkaya.javalearning;

public class Variables {

    public static void main(String[] args) { //psvm yazıp tab basarsak bunu otomatik yazıyor

        System.out.println("hello java"); //sout yazıp tab basarsak bunu otomatik yazıyor
        System.out.println(5*2);
        System.out.println();

        //Variables

        //Integer - Long

        int age = 20;

        System.out.println(10*age);

        System.out.println(age/5);

        int x = 5;
        int y = 11;

        System.out.println(y/x);


        long myLong = 10;
        System.out.println(myLong/5);
        System.out.println();

        //Double - Float

        double z = 5.0;
        double a = 11.0;

        System.out.println(a/z);

        float myFloat = 10.0f;

        double pi = 3.14;

        int r = 5;

        System.out.println(2*r*pi);

        //String

        String name = "James";
        String surname = "Hetfield";

        //name = 40;

        String fullname = name + " " + surname;

        System.out.println(name);
        System.out.println(surname);

        System.out.println(fullname);
        System.out.println();

        //Boolean

        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);
        System.out.println();


        //Final

        final int myInteger = 5;

        System.out.println("myInteger: " + myInteger);

        //myInteger = 4;

        System.out.println("myInteger: " + myInteger);


    }
}
