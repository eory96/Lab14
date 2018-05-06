package edu.handong.csee.java.exeptionhadle.example.prob6;

public class CustomID {
	private String name;
	private int age;
	private String race;
	private int state;
	private String[] races = new String[] {"Vulcans","Romulan","Klingons"};
	
	public void nameSetting(String name)throws Exception {
		this.name = name;
		if(name.length()<5) {
			throw new Exception("Your name is short! Try again!");
		}
		else {
			System.out.println("Name is valid");
			System.out.println("Name : "+ name);
			state++;
		}
	}
	
	public void ageSetting(int age) throws Exception{
		this.age=age;
		if(this.age<18) {
			state = 1;
			throw new Exception("You are too young!, Try again!");
		}
		else {
			System.out.println("Age is valid");
			System.out.println("Age : "+ age);
			state++;
		}
	}
	
	public void raceSetting(String race) throws Exception{
		this.race=race;
		for(int i=0;i<3;i++) {
			if(races[i].equals(this.race)) {
				System.out.println("Race is valid");
				System.out.println("Race : "+this.race);
				state=0;
				return ;
			}
		}
		state=2;
		throw new Exception("Human! Try again.");
	}
	
	public int getState() {
		return state;
	}

	
}
