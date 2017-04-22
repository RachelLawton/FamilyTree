package controllers;

import java.util.ArrayList;

import models.FamilyTree;
import models.Person;

public class Main {

	public static void main(String[] args) {
		Person colby = new Person("Colby",false, 1869);
		

		Person desmond = new Person("Desmond",false ,1897);
		Person reese = new Person("Reese" ,false, 1907 );
		Person Celeste = new Person("Celeste" ,true, 1869 );
		
		desmond.setParentF(colby);
		desmond.setParentM(Celeste);
		reese.setParentF(colby);
		reese.setParentM(Celeste);
		System.out.println(desmond);
		System.out.println(reese);
		System.out.println(colby); 
	}
}