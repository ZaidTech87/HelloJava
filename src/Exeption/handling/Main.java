package Exeption.handling;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        A k = new A();
        try {
            k.func1();
        } catch (TzaidExeption e) {
            throw new RuntimeException(e);
        }
//        try {
//            int res = 10 / a;
//            int[] arr = new int[3];
//            for (int i = 0; i <= 3; i++) {
//                System.out.println(arr[i] + " ");
//            }
       // }
        catch (ArithmeticException e) {
            System.out.println("divided by zero is not allowed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("handle out of bounds");

        } catch (NullPointerException e) {
            System.out.println("this is null poiter exeption");
        } finally {
            System.out.println("this statement will always execute even try catch do anything");
        }
        System.out.println("exeption handle successfully");

    }
}

     class A {
        public void func1() throws TzaidExeption{
            Scanner sc = new Scanner(System.in);
            int wl = sc.nextInt();
            if(wl>100){
                throw new TzaidExeption("this is zaid exeption ");
            }


            //
        }
    }
     class TzaidExeption extends Exception{
    public TzaidExeption(String msg){
        super(msg);
    }
    }
