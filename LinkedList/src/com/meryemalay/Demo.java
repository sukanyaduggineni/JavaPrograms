package com.meryemalay;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");

        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        System.out.println("... " +placesToVisit.get(3));


    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }

    public static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = (ListIterator<String>) linkedList.iterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0 ){
                //equal, do not add
                System.out.println(newCity+" is already included as a destinition");
                return false;
            }else if(comparison > 0){
                //new city should appear before this one
                //Brisbane -> Adeleida
                stringListIterator.previous();
                stringListIterator.add(newCity);
            }else if(comparison < 0){
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return false;
    }
}
