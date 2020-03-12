package com.example.datastructure;

import java.util.ArrayList;

public class MyClass {

    public static void main(String[] args) {
         int[] myArray ={21,31,91,89,73,34};
         for(int i=0; i< myArray.length; i++){
             System.out.println("Number at Index "+i+" is: "+myArray[i]);
         }

         //Array List
//        ArrayList<String> stringArrayList = new ArrayList<>();

        ArrayList  arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("Hello");
        arrayList.add(0.0562);

        System.out.println(arrayList);

        //looping arrays
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Wiz");
        arrayList1.add("Khalifa");
        arrayList1.add(29);
        arrayList1.add(457842138.1215);

        for(int i=0; i<arrayList1.size();i++){
            System.out.println("Item at index "+i+" is:"+ arrayList1.get(i));
        }

        //clever looping
        for (Object details : arrayList1){
            System.out.println("Details : " + details );
        }
    }
}
