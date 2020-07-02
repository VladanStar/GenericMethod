package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] arr = new Integer[]{1, 3, 5, 0, 3, 5, 6, 10};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        String[][] niz2D = new String[][]{{"Vladan", "Vojvodic"}, {"Milan", "Jankovic"}, {"Stefan", "Boicanin"},
                {"Dejan", "Ciric"}, {"Marko", "Vuckovic"}};



            System.out.println("ArrayList: ");
            for(Integer tmp : list){
                System.out.println(tmp);
            }
            GenericsUtility.shuffle(list);
            System.out.println("Shuffled ArrayList: ");
            for(Integer tmp : list){
                System.out.print(tmp + "  ");
            }
            System.out.println("\nArrayList with duplicates removed: ");
            list = GenericsUtility.removeDuplicates(list);
            for(Integer tmp : list){
                System.out.println(tmp);
            }
            System.out.println("Max element of 2dArray: ");
            System.out.println(GenericsUtility.max(niz2D));
            System.out.println("");
            System.out.println(GenericsUtility.indexSearch(arr, 10));

        }
    }

