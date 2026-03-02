package com.java.collections_framework.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class School {


    public static void main(String[] args){
        //int adminationID; -> only store single value
        // int arr[20];
        Vector<Integer> adminationID = new Vector<>();

        adminationID.add(1);
        adminationID.add(2);
        adminationID.add(3);
        adminationID.add(4);
        adminationID.add(5);
        adminationID.add(6);
        adminationID.add(7);
        adminationID.add(8);
        adminationID.add(9);
        adminationID.add(10);
        adminationID.add(11);

        System.out.println(adminationID.capacity()); //Default or capacity of the vector
        System.out.println(adminationID.size()); //Number of element stored in Vector


        System.out.println(adminationID.get(0)); //return the value
        adminationID.remove(0);
        adminationID.add(2,13); //override
        System.out.println(adminationID);
        adminationID.addElement(66);
        System.out.println(adminationID);

        //ArrayList<String> arrayList =new ArrayList<>(); //class
        List<String> list = new ArrayList<>(); //upcasting

        list.add("A");
        System.out.println(list.size());




        //System.out.println(adminationID);

    }


}
