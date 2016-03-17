package com.work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mas = InputMas();
        OutMas(mas);
        Invert invert = new Invert();
        invert.invert(mas);
        OutMas(mas);
    }

    public static void OutMas(int mas[]) {
        int  n=mas.length;
        for(int i=0;i<n;i++){
            System.out.println("Mas["+i+"]="+mas[i]);
        }
    }


    public static int[] InputMas() {
        int[] mas;
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N");
            if(sc.hasNextInt()) {
                n = sc.nextInt(); }
        mas=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Input Mas["+i+"]");
            if(sc.hasNextInt()) {
                mas[i] = sc.nextInt();  }
        }
    return mas;
    }

}
