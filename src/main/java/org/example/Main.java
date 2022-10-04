package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println(test(generateRandomAge(),15));
    }

    public static String test(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return"Можно идти гулять";}
        else if (age < 20 && temperature>0 && temperature<28){return"Можно идти гулять";}
        else if (age>45 && temperature>-20 && temperature<25 ){return "Можно идти гулять";}
        else {return "Сидите дома";}}

    public static int generateRandomAge(){
        int ageRandom=0+(int)(Math.random()*100);
        return ageRandom;
    }



}
