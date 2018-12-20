

import java.util.*;

public class Input {
	static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
		
	    String userInput; 
	    
	    System.out.println("If hosting a casual event for 1, then sandwiches should be prepared in the microwave");
	    userInput=input.nextLine();
	    
	    //Print out by clicking enter
	    System.out.println("If hosting a semi-formal event for 2-12 people, then fried chicken should be prepared in your kitchen");
	    userInput=input.nextLine();
	    
	    //Print out by clicking enter
	    System.out.println("If hosting a formal event for 13 or more, then chicken parmesan should be prepared by a caterer");
	    userInput=input.nextLine();
	
	    
	}
	

}