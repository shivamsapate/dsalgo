package com.ds.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.get(c)==null){
                map.put(c, 0);
            }
            map.put(c, map.get(c)+1);
        }
        String res = "";
        Set<Character> keySet = map.keySet();
        Character temp = null;
        for(Character c : keySet){
            if(Character.isUpperCase(c)==true){
                temp = Character.toLowerCase(c);
            } else {
                temp = Character.toUpperCase(c);
            }
            if(map.get(temp) != null){
                res = c.toString();
            }
        }

        if(res.length()==0)
            System.out.println(0);
        else 
            System.out.println(res.toLowerCase());
    }
}
