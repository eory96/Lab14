package edu.handong.csee.java.exeptionhadle.example.prob6;//this is package name

public class CustomID {//this is CustomID class
	private String name;//this variable will save name
	private int age;//this variable will save age
	private String race;//this variable will save race
	private int state;//this variable will save state
	private String[] races = new String[] {"Vulcans","Romulan","Klingons"};//declare new array and fill element
	
	public void nameSetting(String name)throws Exception {//this method is get name and error will processed by Exception
		this.name = name;//this class name receive main class name
		if(name.length()<5) {//if name length is shorter than 5 
			throw new Exception("Your name is short! Try again!");//throw new error message "Your name is short! Try again!"
		}
		else {//if name length is longer than 5
			System.out.println("Name is valid");//printout "Name is valid"
			System.out.println("Name : "+ name);//printout "Name : "+ name
			state++;//increase state value
		}
	}
	
	public void ageSetting(int age) throws Exception{//this method for get age and error will processed by Exception
		this.age=age;//this class age variable get main class age value
		if(this.age<18) {//if age value is less than 18
			state = 1;//set a state value to 1
			throw new Exception("You are too young!, Try again!");//throw new error message "You are too young!, Try again!"
		}
		else {//if age value is more than 18
			System.out.println("Age is valid");//printout "Age is valid"
			System.out.println("Age : "+ age);//printout "Age : " +age
			state++;//increase state value
		}
	}
	
	public void raceSetting(String race) throws Exception{//this method for compare race and error will processed by Exception
		this.race=race;//this class race variable get main class race value
		for(int i=0;i<3;i++) {//loop for compare race 
			if(races[i].equals(this.race)) {//if race array has a race value 
				System.out.println("Race is valid");//printout "Race is valid"
				System.out.println("Race : "+this.race);//printout "Race : "+this.race
				state=0;//set state 0 and begin from the first
				return ;//escaping this method
			}
		}
		state=2;//set state 2 and repeat get race
		throw new Exception("Human! Try again.");//throw new error message "Human! Try again."
	}
	
	public int getState() {//this method is return int type and determine to use method
		return state;//return state value
	}

	
}
