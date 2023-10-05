
package ru.shpakova;

public class Main {
    public static void main(String[] args)
    //Арифметические операторы (+ - * / %)
    {
        byte aByte1 = 52;
        short aShort1 = 1579;
        short aShort2 = 32547;
        int aInt2 = 150789;
        long aLong = 2115678;
        double double1 = 1.2;
        float float1 = 1.1f;

        System.out.println(aByte1 + aShort1);

        System.out.println(aShort2 - aInt2);

        System.out.println(aShort1*aShort2/aByte1);

        System.out.println(aLong*aShort2/aByte1);

        System.out.println(154%3);

        System.out.println(aInt2 - float1);//рез-т становится типом данных float

        System.out.println(aInt2*double1);


        //результат при переполнении вычисления некорректный
        byte vByte1 = 125;
        byte vByte2 = 127;
        System.out.println("сумма 125 + 127 = " + (byte)(vByte1+vByte2));

        //Логические операторы  < > <= >= == !=


        byte age = 36;

        if (age <= 35) {
            System.out.println("Доступна льготная ипотека");
        } else {
            System.out.println("Льготная ипотека не доступна");
        }

        short salary = 29000;
        if (age < 40 && salary >= 30000) {
            System.out.println("Кредит одобрен");
        } else {
            System.out.println("В кредите отказано");
        }

        int salary2 = 100000;
        if (age < 40 && salary2 >= 30000) {
            System.out.println("Кредит одобрен");
        } else {
            System.out.println("В кредите отказано");
        }

    }
}
