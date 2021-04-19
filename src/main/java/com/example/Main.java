package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("working");

        Point point = new Point(5.0, -0.3);
        System.out.println(point);

        System.out.println(args[0]);

         System.out.println(MyConfig.APP_SECRET);
    }
}
