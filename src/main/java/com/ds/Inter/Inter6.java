package com.ds.Inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//list contains only odd number
public class Inter6 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();  
      list.add(15);
      list.add(13);
      boolean val = list.stream().anyMatch(e->e%2!=0);
      Integer[] arr = list.toArray(new Integer[list.size()]);
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));

    }
}
