package org.example;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.example.Functions.*;

public class Main {
    public static int i=4;
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String stroka = "moloko";
        String stroka2 ;
        stroka2 = "nemoloko";
        stroka = stroka + stroka2;
        char znak = '#'; //помои
        System.out.println(stroka + znak + i);


        byte bitochek = 2; //помои
        short korotkoe = 200; //помои
        long dlinnoe = 200000000000L; //помои

        dlinnoe = dlinnoe + korotkoe;
        korotkoe = (short) (korotkoe + dlinnoe);


        float plavunia = 17.458901f;
        double plavunia2 = 34783.3432943243f;
        int cifra = (int) 133.2;
        cifra=cifra * 999;

        boolean logichnaia = true;

        Integer obertka = 85;
        int neobertka = 86;
        int summa;
        //summa = Integer.parseInt(stroka2);
        String logicka = "true";
        boolean logicka2 = Boolean.parseBoolean(logicka);
        System.out.println(logicka2);



        System.out.println("Hello, World!" + "\n" + cifra);

   String hash1 = MD5.calculateMD5(stroka);
   System.out.println(hash1);

   String hash2 = MD5.calculateMD5(stroka2);
   System.out.println(hash2);

   if (logicka2) {
       logicka2=!logicka2;}

   if (!logicka2) {
       logicka2=!logicka2;}  //true

   if (cifra!=132867) {
       logicka2=!logicka2;}
   else if (isOdd(cifra)){
       logicka2=!logicka2;
   } else {
       logicka2=!logicka2;
   }





   switch (cifra) {
       case 1 -> {logicka2=!logicka2;}
       case 2 -> {logicka2=!logicka2;}
       case 132867 -> {logicka2=!logicka2;} //true
       default -> {logicka2=!logicka2;}
   }
        System.out.println(logicka2);

   int[] massivckik0;
   massivckik0 = new int[]{1, 2, 3};
   int[] massivchik = new int[3];
   int[] massivchik2 = new int[] {1,2};

   massivchik[0] = 1;
   massivchik[1] = 2;
   massivchik[2] = massivchik[0] + massivchik[1];
   System.out.println(Arrays.toString(massivchik));

   int firstFibanacha = 0;
   int secondFibanacha = 1;
   int[] spisokFibanach = new int[52];
   spisokFibanach[0] = firstFibanacha;
   spisokFibanach[1] = secondFibanacha;
   for (int i = 0; i < 50; i++) {
       int currentFibanacha = firstFibanacha + secondFibanacha;
       firstFibanacha = secondFibanacha;
       secondFibanacha = currentFibanacha;
       spisokFibanach[i+2] = currentFibanacha;
   }
   System.out.println(Arrays.toString(spisokFibanach));

   //spiski
        ArrayList<String> spisochek = new ArrayList<>();
        spisochek.add("Felix");
        spisochek.add("LOTOK");
        spisochek.add("lapki");
        spisochek.add(1, "hvost");
        System.out.println(spisochek);
        //spisochek.contains("lotok");
        String checking = "lotok";
        System.out.println(spisochek.contains(checking.toUpperCase()));



   int j=0;
   while (j < 20) {
       System.out.println(System.currentTimeMillis()+ "----" + j);
       j++;
   }

        System.out.println( "------------------------------------");

  j=0;
   do {
       System.out.println(System.currentTimeMillis()+ "----" + j);
       j++;
   } while (j<20);


    }

    public static boolean isOdd (int number) {
        int ostatok=number % 2;
        boolean otvet = ostatok==1;
        return otvet;

       // return number % 2 != 0; //2variant

    }

    public static boolean isOdd (int number, int secondNumber) {
        int ostatok=(number + secondNumber)% 2;
        boolean otvet = ostatok==1;
        return otvet;

        // return number % 2 != 0; //2variant

    }





}

