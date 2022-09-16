package Week2Assignments;

public class week2questions {

	public static void main(String[] args) {
		
		//create a variable age and give it the value of 14
		int age =14;
		//print the boolean expression age>=16 to the console
		//change the value to 18 an run again
		if (age>=16);
		System.out.println(age);
		
		age = 18;
		System.out.println(age);
		
		//using a conditional print "You can drive" if age is greater or equal to 16
		// and "You can't drive" otherwise
		//change the value of age an re-run
		if(age>=16) {
			System.out.println("You can drive");
		}
		
		else {System.out.println("You can't drive");	
		}
		
		age =7;
		//using a conditional print "You can drive" if age is greater or equal to 16
		// and "You cannot drive" otherwise
		//add a new variable called hasLicense before the conditional
		//change the boolean expression in the conditional to additionally includes the need to have a license to be true
		
		boolean hasLicense =true;
		
		if(age>=16 && hasLicense) {
					System.out.println("You can drive");
				}
				
				else {System.out.println("You cannot drive");	
				}
		
        //create two new variables costOfMilk and thirstLevel
		//create a conditional that prints "Milk please" if costOfMilk is less than 2.50
		//or if thirst level is greater than 6 print "No thanks" otherwise
		//change the values to see different results
		
		double costOfMilk = 10;
		int thirstLevel = 1;
		
		if (costOfMilk< 2.50 || thirstLevel > 6) {
			System.out.println("Milk please");
		} else {
			System.out.println("No thanks");
		}
			
		//create a new variable called numberOfCookies and numberOfChildren
		//distribute the cookies evenly to the kids
		//keep the rest for yourself
		//use a conditional to print the following based on the conditions
		// if there are zero cookies remaining, print "Sad face"
		// if there are less than two cookies remaining, print "Yes!"
		// if there are less than five cookies remaining, print "Wooohooo!"
		// if there are more than five cookies remaining, print "Jackpot!"
		
		int numberOfCookies = 7971;
		int numberOfChildren =25;
		
		int remainingCookies = numberOfCookies%numberOfChildren;
		
		if (remainingCookies ==0 ) {
			System.out.println("Sad face");
		} else if (remainingCookies <2) {
			System.out.println("Yes!");
		} else if (remainingCookies <5) {
			System.out.println("Wooohooo!");
		} else if (remainingCookies >=5) {
			System.out.println("Jackpot!");	
		}
		
		//create a variable called loyaltyMemberStatus and assign the value to "Silver"
		//create a variable called loyaltyMemberDiscount and assign the value to "0.0"
		//using a switch, set the value of loyaltyMemberDiscount based on the following loyaltyMemberStatus scale
		// "SILVER" is 0.1, "GOLD" is 0.15, and "PLATINUM" is 0.25
		
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount  = 0.0;
		
		switch(loyaltyMemberStatus) {
		
			case "SILVER":
			loyaltyMemberDiscount  = 0.1;
			break;
			
			case "GOLD":
			loyaltyMemberDiscount = 0.15;
			break;
			
			case "PLATINUM":
			loyaltyMemberDiscount  = 0.25;
			break;
		}
		/// to test the switch statement
		System.out.println(loyaltyMemberDiscount);
		
		
		//create a variable called billTotal and assign a value
		//create a variable called adjustedTotal and assign it the billTotal minus the loyaltyMemberDiscount percent of the billTotal
		// if adjustedBillTotal is greater than $500, update the loyaltyMemberStatus from SILVER to GOLD or GOLD to PLATINUM
		
		double billTotal = 2399;
		double adjustedBillTotal = billTotal - billTotal*loyaltyMemberDiscount;
		
		if(adjustedBillTotal > 500) {             //this is a nested conditional
			if(loyaltyMemberStatus== "SILVER") {  // here we are changing the status
				loyaltyMemberStatus = "GOLD";
			} else if(loyaltyMemberStatus== "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
			}
		}
		/// to test the switch statement
		System.out.println(loyaltyMemberStatus);		
		
				
		//create two variables, username and password
		//create a conditional that prints "login successful" if the username is "Tommy123"	and the password is "12345"
		//otherwise print "access denied"	
				
		String username = "Ana123";
		String password = "12345";
		
		if(username.equals("Tommy123") && password.equals("12345")) {
			System.out.println("login successful" );
		}else {
			System.out.println("access denied");
		}
		
		//write a for loop that prints each number from 0 to 9
		
		for (int i = 0; i < 10; i++) {
			  System.out.println(i);
			}
		
		//write a for loop that prints each number from 10 to 0 backwards
	
		for (int x= 10; x>-1; x--) {
			System.out.println(x);
		}
		
		//write a for loop that prints every other number from 0 to 100
		
		for (int x = 0; x<101; x+=2) {
			System.out.println(x);
		}
		
		// write a for loop that iterates from 0 to 100 and prints if the number is "EVEN" or "ODD"
		
		for(int x =0; x<101;x++) {
			if(x%2 ==0) {System.out.println( x +"  is EVEN");
		}else {
			System.out.println(x + " is ODD");
		}

		}
		
		//write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//divide each number by 3 and print the remainder in the console
		int i = 100;
		do {
		  System.out.println(i % 3);
		  i--;
		}
		while (i >-1);
		
		
		

	}

}
