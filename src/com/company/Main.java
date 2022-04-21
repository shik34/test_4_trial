package com.company;

import java.util.*;

class User {
    String name;
    int age;

    User(String n, int a) {
        name = n;
        age = a;
    }
}

class Main {
    public static void main(String[] args) {
/*
        TreeSet<User>tree=new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User s1, User s2) {
                return s1.name.compareTo(s2.name);
            }
        });*/
//9
/*
        LinkedList<String> a = new LinkedList<>();
        a.add("spring");
        a.add("a");
        a.add("a");
        a.add("a");
        a.add("a");
        System.out.println(Collections.binarySearch(a, "spring"));
*/
/*        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(10);
        al.add(20);
        // 10 is present at index 3.
        int index = Collections.binarySearch(al, 10);
        System.out.println(index);*/
//11
/*        TreeSet collection = new TreeSet();
        collection.add(3);
        collection.add(21);
        collection.add(1);
        collection.add(25);
        for (Object obj: collection){
            System.out.print(obj + " ");
        }*/
//12
        TreeMap<String, String> pets = new TreeMap<>();
        TreeMap <String, String> mondayPets = new TreeMap<>(pets.subMap("A","H"));

    }
}