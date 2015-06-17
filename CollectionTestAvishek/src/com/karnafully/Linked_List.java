package com.karnafully;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	LinkedList list = new LinkedList();

	void process() {
		addition();
		display_list();
		display_list_while();
		display_list_for();
		display_checkIfContains(); // list.contains("Four")
		display_findIndexNo(); // list.indexOf("One")
		display_findIndexValue(); // list.get(2)
		remove();
		display_list();
	}

	void addition() {
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
	}

	void display_list() {

		System.out.println("Linked list: ");
		System.out.println(list); // list display in a line
		System.out.println("\n\n");

	}

	void display_list_while() {

		Iterator iterator = list.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		System.out.println("\n\n");

	}

	void display_list_for() {
		for (Object str : list) {
			System.out.println(str);
		}
		System.out.println("\n\n");
	}

	void display_checkIfContains() {

		System.out.println("Check if list contains the element Four: "
				+ list.contains("Four"));
		System.out.println("\n\n");
	}

	void display_findIndexNo() {
		System.out.println("The position of the element \"One\" is: "
				+ list.indexOf("One"));
		System.out.println("\n\n");
	}

	void display_findIndexValue() {
		System.out.println("Get the element in third position of the list: "
				+ list.get(2));
		System.out.println("\n\n");
	}

	void remove() {

		list.remove("Three");
		list.removeFirst();
		list.removeLast();

	}
}
