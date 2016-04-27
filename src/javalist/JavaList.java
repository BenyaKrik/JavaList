/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalist;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author pavel
 */
public class JavaList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        long startM = System.currentTimeMillis();
        long startN = System.nanoTime();
        System.out.println("1 time start ArrayList " + startM);
        System.out.println("2 time start ArrayList " + startN);

        while (list.size() < 10000) {
            list.add("0");
        }

        long speedM = System.currentTimeMillis() - startM;
        long speedNA = System.nanoTime() - startN;
        System.out.println("1 time edd ArrayList " + speedM);
        System.out.println("2 time edd ArrayList " + speedNA);

        LinkedList<String> linkedList = new LinkedList<>();
        startM = System.currentTimeMillis();
        startN = System.nanoTime();
        System.out.println("1 time start linkedList " + startM);
        System.out.println("2 time start linkedList " + startN);
        while (linkedList.size() < 10000) {
            linkedList.add("0");
        }
        speedM = System.currentTimeMillis() - startM;
        long speedNL = System.nanoTime() - startN;
        System.out.println("1 time edd linkedList " + speedM);
        System.out.println("2 time edd linkedList " + speedNL);
        long number = speedNA / speedNL;
        System.out.println("LinkedList faster in " + number);
    }

}
