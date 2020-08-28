package com.poly.java;



public class Polymorphism_Mainclass {

	public void talk(Parents_talk styleOftalking) {

		System.out.println("Always with Love");
	}

	public void talk(Manager_talk styleOftalking) {
		System.out.println("Nothing personal");
	}

	public void talk(Enemy_talk styleOftalking) {
		System.out.println("doesnt talk");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_Mainclass mainclass= new Polymorphism_Mainclass();
		Parents_talk parents= new Parents_talk();
		System.out.println(parents.value);
		mainclass.talk(parents);
		Manager_talk manager= new Manager_talk();
		mainclass.talk(manager);
		Enemy_talk enemy= new Enemy_talk();
		mainclass.talk(enemy);
	}

}
