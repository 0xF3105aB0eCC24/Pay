package com.company;

public class Main {

        public static Integer balance = Integer.MAX_VALUE;

        public static void main(String[] args) {
            String bill = "1234567890";

            System.out.println("Current balance : " + balance);
            processPayment(bill);
            System.out.println("Current balance : " + balance);
        }
        public static void processPayment(String bill) {
            //напишите тут ваш код
            int b = Integer.parseInt(bill);
            balance = balance - b;
        }

    }

