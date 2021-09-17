package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder("Sydney", placesToVisit );
        addInOrder("Melbourne", placesToVisit );
        addInOrder("Brisbane", placesToVisit );
        addInOrder("Perth", placesToVisit );
        addInOrder("Adelaide", placesToVisit );
        addInOrder("Canberra", placesToVisit );

        printList(placesToVisit);

        addInOrder("Canberra", placesToVisit );
        addInOrder("Alice Springs", placesToVisit );

        printList(placesToVisit);
        visit(placesToVisit);

        /*placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        placesToVisit.add("Canberra");
        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);*/
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("========================");
    }

    private static boolean addInOrder(String newCity, LinkedList<String> linkedList){

        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){

            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + "is already included as a destination");
                return false;
            } else if ( comparison > 0){
                // new City should appear before this one
                // Brisbane  -> Adelaide

                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0){
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if ( cities.isEmpty()){
            System.out.println("No Cities in the itenerary");
            return;
        }else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            if (action != 0 && action != 1 && action != 2 && action != 3){
                System.out.println("Provide a proper number from the menu");
            }
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;

                case  1:
                    if(!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case  2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are the start of the list");
                        goingForward = true;
                    }
                    break;

                case  3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n"+
                "2 - go to previous city\n"+
                "3 - print menu options");
    }

}
