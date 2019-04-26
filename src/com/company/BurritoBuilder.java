package com.company;

import java.util.Random;
import java.util.*;
import java.util.List;

public class BurritoBuilder {

    //Method randomly picks an item from an arraylist
    static String picker(List<String> arrayx) {
        Random rand = new Random();
        int picknumber = rand.nextInt(arrayx.size());
        //System.out.print(arrayx.get(picknumber));
        String picked = arrayx.get(picknumber);
        Boolean No = picked.contains("no");
        if (!No)
        return arrayx.get(picknumber);
    }
    //Method randomly select a boolean result for extra ingredients list
    static String picker2(List<Boolean> arrayz) {
        Random rand = new Random();
        Boolean bpicker = rand.nextBoolean();
        //System.out.print(bpicker);
        if (bpicker == true) {
            return "Yes";
        } else {
            return "No";
        }
        //Boolean picked2 = arrayz.get(bpicker);
        //return arrayz.get(picknumber);
        //return bpicker;
    }

    static int pricer(){
        if (picker( ) )
    }

    public static void main(String[] args) {
	//This program allows a robot to assemble 25 burritos. A random
    //generator customizes the combination of ingredients in each burrito

        //Creating Lists of category options
       List<String> rice = Arrays.asList("white rice", "brown rice", "no rice");
       List<String> meat = Arrays.asList( "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies");
       List<String> beans = Arrays.asList( "pinto beans", "black beans", "no beans", "all beans");
       List<String> salsa = Arrays.asList( "hot salsa", "medium salsa", "mild salsa", "no salsa", "all salsa");
       List<String> veggies = Arrays.asList( "lettuce", "fajita veggies", "no veggies", "all veggies");
       List<Boolean> Cheese = Arrays.asList(true, false);
       List<Boolean> Guac = Arrays.asList(true, false);
       List<Boolean> Queso = Arrays.asList(true, false);
       List<Boolean> sCream = Arrays.asList(true, false);

        //For
                for (int i=0; i<25; i++) {
            System.out.print("Burrito " + (i+1) + ": " + picker(rice) + ", ");
            System.out.println(picker(meat) + ", " + picker(beans) + " ," + picker(salsa) + ", " + picker(veggies));
            System.out.println("Extras: " + "Cheese-" + picker2(Cheese) + " | Guac-" + picker2(Guac) + " | Queso-" + picker2(Queso) + " | Sour Cream-" + picker2(sCream));
            System.out.println("Price: ");
            System.out.println();

        }

    }
}
