package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Main {

//    static String picker(ArrayList arrayx) {
//        //ArrayList<String> arrayx = new ArrayList<>();
//        Random rand = new Random();
//        int picknumber = rand.nextInt(arrayx.size());
//        System.out.print(arrayx.get(picknumber));
//        return arrayx.get(picknumber);
//    }

    public static void main(String[] args) {
	//This program allows a robot to assemble 25 burritos. A random
    //generator customizes the combination of ingredients in each burrito

        ArrayList<String> burritos = new ArrayList<>();
        ArrayList<String> rice = new ArrayList<>();
        ArrayList<String> meat = new ArrayList<>();
        ArrayList<String> beans = new ArrayList<>();
        ArrayList<String> salsa = new ArrayList<>();
        ArrayList<String> veggies = new ArrayList<>();

       //List<String> rice = Arrays.asList( "white rice", "brown rice", "no rice");
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggies");
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("no beans");
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("no salsa");
        salsa.add("all salsa");
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("no veggie");
        veggies.add("all veggies");

        for (int i=0; i<25; i++) {
            Random rand = new Random();
            int ricepick = rand.nextInt(rice.size());
            String ricex = rice.get(ricepick);
            int meatpick = rand.nextInt(meat.size());
            String meatx = meat.get(meatpick);
            int salsapick = rand.nextInt(salsa.size());
            String salsax = salsa.get(salsapick);
            int vegpick = rand.nextInt(veggies.size());
            String vegx = veggies.get(vegpick);
            int beanspick = rand.nextInt(beans.size());
            String beansx = beans.get(beanspick);
            System.out.print("Burrito " + (i+1) + ": " + ricex + ", ");
            System.out.println(meatx + ", " + beansx + " ," + salsax + ", " + vegx );
        }

    }
}
