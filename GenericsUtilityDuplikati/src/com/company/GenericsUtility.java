package com.company;

import java.util.ArrayList;
import java.util.Random;

public class GenericsUtility {



    // uklanja duplikate iz ArrayList-e
    public static <E>ArrayList<E> removeDuplicates(ArrayList<E> list){
        for (int i =0;i<list.size();i++){
            for(int j =0;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
        return list;
    }
    // pronalazi maksimalni element matrice
    public static <E extends Comparable<E>>E max(E[][] matrix ){
        E max = matrix[0][0];
        for (int i =0;i<matrix.length;i++){
            for (int j =0;j<matrix.length;j++){
                if(matrix[i][j].compareTo(max)>0){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
    // pravi nasumican raspored elemenata u listi
    public static <E> void shuffle(ArrayList<E> list){
        Random rand = new Random();
        for (int i =0; i<list.size();i++){
            int randIndex = rand.nextInt(list.size());
            E pom = list.get(i);
            list.set(i, list.get(randIndex));
            list.set(randIndex,pom);
        }
    }
    // pretrazuje element niza i vraca vrednost indeksa ukoliko postoji i -1 ukoliko element ne postoji
    public static <E extends Comparable<E>> int indexSearch(E[] arr, E val){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(val)){
                index = i;
            }
        }
        return index;
    }
}
