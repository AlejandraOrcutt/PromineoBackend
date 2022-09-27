package week3CodingAsignment;

import java.util.Arrays;

public class ArraysandMethods {

	public static void main(String[] args) {
		
			
// Create an array of integers called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
				
	    System.out.println("Value of the first element: " + ages[0]);
		System.out.println("Value of the last element: " +ages[7]);
 //Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		int agesLength = ages.length;
		int lastMinusfirst = Math.abs(ages[agesLength - agesLength] - ages[agesLength - 1]);
		
		System.out.println("Subtraction of last value(93) from first value(3):  " + lastMinusfirst);

//Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
		ages[ages.length -1] = 679;
		int lastMinusfirst1 = Math.abs(ages[agesLength - agesLength] - ages[agesLength - 1]);
		System.out.println(lastMinusfirst1);
				
		
//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
   	   int result = 0; // initialize sum
	   int a;
	  // I Iterated through all elements and add them to sum
	   for (a = 0; a < ages.length; a++)
	   result += ages[a];
	  // Conversion of int to double data type using valueOf() method 
	   double agesAverage = Double.valueOf(result) / Double.valueOf(agesLength);

	   System.out.println("Average age rounded = " + agesAverage);
		

	   
	System.out.println(result/ages.length);
	   
	// add a number to the sum
	
		double sum = 0;
	
		for(double x : ages) {
		sum += x;
	}
	
// replacing a value to the last index
	   
	   int Index_position = 7;
	   int newValue    = 44;

	   System.out.println("Original Array : "+Arrays.toString(ages));     
	   
	   for(int i1=ages.length-1; i1 > Index_position; i1--){
		   ages[i1] = ages[i1-1];
	   		}
	   ages[Index_position] = newValue;
	   System.out.println("REPLACE VALUE IN AN ARRAY: "+Arrays.toString(ages));

//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
// Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.

String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

int sum5 = 0;
for (int n = 0; n < names.length; n++) {
	sum5 += names[n].length();
}
int average = sum5 / names.length;
System.out.println("Average number of letters per name in names: " + average );

//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
String oneStringNames = ""; //<--initialize empty string
for (int i = 0; i < names.length; i++) {
	oneStringNames += names[i] + " ";
}
System.out.println(oneStringNames);
//How do you access the  first/ last element of any array?
//find first element
System.out.println("first element in list: int first = list.get(0);");

// find last element
System.out.println("first element in list: int last = list.get(list.size() - 1)");

//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

int [] nameLengths = new int[names.length];
    for (int i = 0; i < names.length; i++) {
	nameLengths[i] = names[i].length(); 
}
    
    for (int element : nameLengths) {
// count the letters in each name
    	System.out.println("Letters in each name: " + (element + " "));
}// end of enhanced for

// Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
sum = 0;
for (int i = 0; i < nameLengths.length; i++) {
	sum += nameLengths[i];
}
System.out.println("Sum of all lengths in nameLengths[] = " + sum);

//concatenation of an array string, method 2

String z = concatination(names);

System.out.println(z);

boolean isHotOutside = true;
double moneyInPocket = 3;
System.out.println(willBuyDrink(isHotOutside, moneyInPocket));

System.out.println( true + "I can play nintendo");
System.out.println(false + ": you better finish chores and homework first.");
	}// end of main method
	
public static String concatination(String[] array) {
String concat = "";
for(int j = 0; j<array.length; j++) {
    concat += array[j]+" ";
}
return concat;
}
		
//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

public static String fullName(String firstName, String LastName) {
	return firstName + " " + LastName;
}

// Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

// Provide inline hints or outlines for your students
public static String repeatWord(String userWord, int numTimes) { //<--- start of method
	String newString = "";
	for (int i = 0; i < numTimes; i++) {
		newString += userWord;
	}
	return newString;
	
	} //<-- end of method


String userWord = "Hi";
int numTimes = userWord.length();  

	
// Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

public static boolean sumGreaterThan100(int[] arr) {
	int sum = 0;
	
	for (int i: arr) {
		sum += i;
	}
		if(sum > 100) {
			return true;
		}else {
			return false;
		}
	
}

//Write a method that takes an array of double and returns the average of all the elements in the array.

public static double averageValue(double[] arr) {
	
	double sumIs = 0;
	double value = 0;
	for(double i : arr) {
		sumIs += i;
		value = sumIs/arr.length;
	}
	return value;
}
	
//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
public static boolean twoArrays(double[] arr1, double[] arr2) {
	double sum1 = 0;
	double sum2 = 0;
	
	for(double i :arr1) {
		sum1 += i;
	}
	for(double i :arr2) {
		sum2 += i;
	}
	if((sum1 / arr1.length) > (sum2 / arr2.length)){
		return true;
	}else {
		return false;
	}
}


//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.


public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	if (isHotOutside == true && moneyInPocket > 10.50) {
		return true;
		}
		return false;
		} 

//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	

public static boolean canPlayNintendo(boolean didChores, boolean didHomework) {
	if (didChores == true && didHomework == true) {
		return true;
	    }
	
		return false;
	    }
}
		
		
		
		
		
		
		

	


