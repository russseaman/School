//Author:Russ Seaman
//Date:10/4/2018
//Assignment: CSCI 321 Midterm | Question 3

import java.util.*;
import java.util.Scanner;

class quest3 {
    // Java program to demonstrate working of priority queue in Java

    public static void main(String args[]){

        // Creating empty priority queue
        PriorityQueue<String> pQueue =
                new PriorityQueue<String>();

        // Adding items to the pQueue using add()
        pQueue.add("C++");
        pQueue.add("C");
        pQueue.add("Java");
        pQueue.add("Python");

        // Printing the most priority element
        System.out.println("Priority queue lead value: " + pQueue.peek());

        // Printing all elements
        System.out.println("The queue elements:");
        Iterator itrQue = pQueue.iterator();
        while (itrQue.hasNext())
            System.out.println(itrQue.next());

        // Removing the top priority element (or head) and
        // printing the modified pQueue
        System.out.println("Please input the queue object you would like to remove: ");
        Scanner scanner = new Scanner(System.in);
        String remQueue = scanner.nextLine();
        pQueue.remove(remQueue);
        System.out.println("The new priority queue after removing " + remQueue);
        Iterator<String> itr3 = pQueue.iterator();
        while (itr3.hasNext())
            System.out.println(itr3.next());

        // Check if “C” is present
        boolean b = pQueue.contains("C");
        System.out.println ( "Does the priority queue contains C ? " + b);


    }
}


