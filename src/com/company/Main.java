package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(letsGo(56, -15));
        System.out.println(letsGo(13, 0));
        System.out.println(letsGo(23, 34));
        System.out.println(letsGo(45, 87));
        System.out.println(letsGo(23, 22));

        generateRandomAge();
    }

    public static String letsGo(int age, int temperature) {
        if (age > 20 && age > 45 && temperature > -20 && temperature < 30) {
            return " Можно идти гулять";
        }
        if (age > 20 && temperature > -20 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 20) {
            return " Можно идти гулять ";
        } else {
            return " Оставайся дома";
        }

    }


    public static int generateRandomAge() {
        Random apple = new Random();
        int randomNumber = apple.nextInt(56);
        return randomNumber;



    }

    }
