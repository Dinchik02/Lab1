package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static Integer getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static void getTimeArrayList() {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10000; i++) {
            arrayList.add(getRandomInt(0, 100));
        }
        long timeout = System.nanoTime();
        arrayList.add(5000, 1234567);
        timeout = System.nanoTime() - timeout;
        System.out.println("ArrayList timeout:  " + timeout + "ns");
    }

    public static void getTimeLinkedList() {
        List<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i <= 10000; i++) {
            linkedList.add(getRandomInt(0, 100));
        }
        long timeout = System.nanoTime();
        linkedList.add(5000, 1234567);
        timeout = System.nanoTime() - timeout;
        System.out.println("LinkedList timeout: " + timeout + "ns");
    }

    public static void main(String[] args) {
//        List<Integer> linkedList = new LinkedList<Integer>();
//        for (int i = 0; i<=10000; i++){
//            linkedList.add(getRandomInt(0,100));
//        }
        getTimeArrayList();
        getTimeLinkedList();
    }
}
