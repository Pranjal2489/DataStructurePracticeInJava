package assignment7.hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMApPractice {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        TreeMap<String,Integer> tm1=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of (k,v) pairs.." );
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            i++;

            String key=sc.next();
            int value=sc.nextInt();
            tm1.put(key,value);
        }
        System.out.println(tm1);

    }}
