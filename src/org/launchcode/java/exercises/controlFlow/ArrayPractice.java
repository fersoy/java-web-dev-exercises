package org.launchcode.java.exercises.controlFlow;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] arr = {1,1,2,3,5,8};
        for (int i = 0; i < arr.length; i++){
            System.out.println(i);
        }
        System.out.println("--------------");
        for (int i = 0; i < arr.length; i++){
            if(!(i % 2 == 0)){
                System.out.println(i);
            }
        }
        String firstSentence = "I would not, could not, in a box." +
                " I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] s = firstSentence.split(" ");
        String[] dot = firstSentence.split("\\.");
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(dot));
    }
}
