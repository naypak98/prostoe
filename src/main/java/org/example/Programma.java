package org.example;

import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.Scanner;

public class Programma {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        Felix felix = new Felix(50);
        felix.sleep();
        while (felix.getSytost() < 200) {
            System.out.println( "Уровень сытости: " + felix.getSytost() + "%");
            System.out.println("Несите еду....");
            String feed = scanner.nextLine();
            String[] parts = feed.split(" ");
            felix.eat(parts[0], Integer.parseInt(parts[1]));


            Random random = new Random();
            int randomHunger = random.nextInt(5)+1;
            for (int i = 0; i < randomHunger; i++) {
                felix.hunger();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
