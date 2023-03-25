package com.ds.gfg.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Planets {
    public static ArrayList<Planets> planetsData = new ArrayList<>();

    private String name;
    private ArrayList<String> surfaceGases;
    private Integer noOfMoons;
    private boolean has_ring;

    Planets(String name, ArrayList<String> surfaceGases, Integer noOfMoons, boolean has_ring){
        this.name = name;
        this.surfaceGases = surfaceGases;
        this.noOfMoons = noOfMoons;
        this.has_ring = has_ring;
    }

    public static Integer MoonCountHasRings(){
        int count = 0;
        for(Planets plant : planetsData){
            if(plant.has_ring){
                count+=plant.noOfMoons;
            }
        }
        return count;
    }

    public static String gasFound() {
        HashMap<String, Integer> gasesMap = new HashMap<>();
        for(Planets planet : planetsData) {
            for(String gas : planet.surfaceGases){
                if(gasesMap.containsKey(gas)){
                    gasesMap.put(gas,gasesMap.get(gas)+1);
                } else {
                    gasesMap.put(gas,1);
                }
            }
        }
        Set<String> gasKeys = gasesMap.keySet();
        String resultGas="";
        int max = 0;
        for(String gas : gasKeys){
            if(gasesMap.get(gas)>max){
                resultGas = gas;
            }
        }

        return resultGas;
    }

    public static void main(String[] args) {
        planetsData.add(new Planets("Mercury", new ArrayList<>(), 0, false));

        ArrayList<String> gases = new ArrayList<>();
        gases.add("Carbon Dioxide");
        gases.add("Nitrogen");
        planetsData.add(new Planets("Venus",gases , 0, false));

        gases.clear();
        gases.add("Nitrogen");
        gases.add("Oxygen");
        planetsData.add(new Planets("Earth",gases , 1, false));

        gases.clear();
        gases.add("Hydrogen");
        gases.add("Helium");
        planetsData.add(new Planets("Jupitor",gases , 79, true));

        gases.clear();
        gases.add("Hydrogen");
        gases.add("Helium");
        planetsData.add(new Planets("Saturn",gases , 83, true));


        gases.clear();
        gases.add("Hydrogen");
        gases.add("Helium");
        gases.add("Methane");
        planetsData.add(new Planets("Uranus",gases , 27, true));

        System.out.println("Count of Moon of all Planes having rings : "+MoonCountHasRings());
        System.out.println("Gas that found on maximum planets : "+gasFound());

    }

}
