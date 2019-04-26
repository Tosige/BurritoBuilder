package com.company;

import java.util.Random;
import java.util.*;
import java.util.List;
import java.text.DecimalFormat;

public class BurritoBuilder {

    //Creates a number pattern that prints total cost in dollars
    public static final DecimalFormat df = new DecimalFormat("$#.00");

    //Method randomly picks an item from a list
    static String picker(List<String> arrayx) {
        Random rand = new Random();
        int picknumber = rand.nextInt(arrayx.size());
        String picked = arrayx.get(picknumber);
        return arrayx.get(picknumber);
    }

    //Method randomly selects a boolean result from extra ingredients list
    static String picker2(List<Boolean> arrayz) {
        Random rand = new Random();
        Boolean bpicker = rand.nextBoolean();
        if (bpicker == true) {
            return "Yes";
        } else {
            return "No";
        }
    }

    //Price calculator for regular ingredients
    static double price1(List<String> arrayx){
        Boolean No = picker(arrayx).contains("no");
        if (!No) {
            return 0.50;
        } else {
            return 0.00;
        }
    }

    //Price calculator for extra ingredients
    static double price2(List<Boolean> arrayz){
        Boolean No = (picker2(arrayz) == "No");
        if (!No) {
            return 0.50;
        } else {
            return 0.00;

        }
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



        //For loop assembles a list of 25 Burritos with randomly selected ingredients and calculates a total cost based on selections
        for (int i=0; i<25; i++) {

            System.out.print("Burrito " + (i + 1) + ": " + picker(rice) + ", ");
            System.out.println(picker(meat) + ", " + picker(beans) + " ," + picker(salsa) + ", " + picker(veggies));
            System.out.println("Extras: " + "Cheese-" + picker2(Cheese) + " | Guac-" + picker2(Guac) + " | Queso-" + picker2(Queso) + " | Sour Cream-" + picker2(sCream));
            double totalcost = 3.00 + price1(rice) + price1(beans) + price1(salsa) + price1(veggies) + price2(Cheese) + price2(Guac) + price2(Queso) + price2(sCream);
            System.out.println("Price: " + df.format(totalcost));
            System.out.println();

        }
    }


}



