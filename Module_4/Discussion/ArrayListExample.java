package Module_4.Discussion;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> wordsArrayList = new ArrayList<String>();
        wordsArrayList.add("Hello");
        wordsArrayList.add("CIS");
        wordsArrayList.add("505");
        System.out.println(wordsArrayList.get(1)); // prints "CIS"

        LinkedList<String> wordsLinkedList = new LinkedList<String>();
        wordsLinkedList.add("Hello");
        wordsLinkedList.add("CIS");
        wordsLinkedList.add("505");
        System.out.println(wordsLinkedList.get(1)); // prints "CIS"
    }
}