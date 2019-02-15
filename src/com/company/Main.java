package com.company;

public class Main {

    public static double func(double x, double y){
        return Math.pow(x,2)+Math.pow(y + Math.sqrt(x*x),2)-1;
    }

    public static void main(String[] args) {
// write your code here

        for(double x=-50; x<=50; x+=0.5){
            for(double y=-50; y<=50; y+=0.5){
                for(double i=-50; i<=50; i+=0.5){
                    for(double j=-50; j<=50; j+=0.5) {
                        if(i==func(x,y) && j==x){
                            System.out.print(".");
                        }

                    }
                }
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}