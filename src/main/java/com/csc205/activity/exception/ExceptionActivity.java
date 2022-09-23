package com.csc205.activity.exception;

import java.util.Scanner;

public class ExceptionActivity {

    public static void main(String[] args) {



        // try-catch
        try {
            int a[] = new int[21];
            System.out.println("Access magazine twenty-two :" + a[22]);
        } catch (Exception e) {
            System.out.println("Something is wrong, check below: ");
            e.printStackTrace();
        }

        // try-catch-catch
        String abc = null;
        try {
            System.out.println(abc.length());
            System.out.println(abc);
        } catch (NullPointerException e) {
            System.out.println("Something is null, check below: ");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something is wrong, check below: ");
            e.printStackTrace();
        }

        // try-catch-finally
        int b[] = new int[2];

        try {
            System.out.println("Access magazine three :" + b[3]);
        } catch (Exception e) {
            System.out.println("This is what's wrong: ");
            e.printStackTrace();
        }finally {
            b[0] = 22;
            System.out.println("First magazine value: " + b[0]);
        }

        // try-finally
        int c[] = new int[10];

        try {
            System.out.println("Access magazine nine :" + c[9]);
        }finally {
            System.out.println("Haha it think it could fail");
        }

        // multi-try-catch
        String def = null;

        try {
            int x = 6/0;
            System.out.println(def.length());
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Something is incredibly wrong, please check below: ");
            e.printStackTrace();
        }

        // try-with-resources
        try(Scanner scanner1 = new Scanner(System.in)){
            System.out.println(scanner1.nextLine());
        }
    }
}
