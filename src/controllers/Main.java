package controllers;

import java.util.ArrayList;

import models.Node;
import models.Person;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		Node people = new Node(null, null, 0, null, null);

		people.addMember("rachel", "f", 1996, "Nila", "Jon");
		people.addMember("rac", "f", 1993, "Niola", "Joh");
		people.addMember("rahel", "f", 1994, "Nia", "ohn");
		people.addMember("rhel", "f", 1995, "Nicola", "hn");
		people.addMember("rache", "f", 1997, "Nicola", "?");
		System.out.println(people.findNode(1996));
	}

}
