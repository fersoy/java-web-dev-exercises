package org.launchcode.java.studios.areaofacircle;
import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");


//        double pi = 3.14;
//        double r = input.nextDouble();
//        double A = pi * r * r;

        Double radius = input.nextDouble();
        Double area = Circle.getArea( radius);
        System.out.println(area);



    }
}
