package codeAlongGithub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collections {

	public static void main(String[] args) {
		
		
// why to use a StringBuilder instead of a string?
System.out.println("Strings are immutable and StringBuilder shrink or expand dinamically. "
		+ "When we concatenate strings, we are creating a new string in memory; a stringbuilder adds to the string intead of create more strings.");
//instantiate a new StringBuilder and append numbers 0 to 9 to it separated by dashes

StringBuilder numbers = new StringBuilder();

for (int i  = 0; i <10 ; i++) { 
	if(i != 9) {
	numbers.append(i + "-");  
    }else{
	numbers.append(i);   //append 9 on its own

System.out.println(numbers);

    }
		} 

// create a list of strings and append 5 strings to it, each with different length
//first method: individually
List <String> fiveStrings = new ArrayList <String>();
fiveStrings.add("first string ");
fiveStrings.add("second string");
fiveStrings.add("third string ");
fiveStrings.add("fourth string ");
fiveStrings.add("fifth string ");

System.out.println(fiveStrings);

//second method: using Arrays.aslist

List <String> colors = Arrays.asList("red", "blue","yellow", "white", "purple");

System.out.println(colors);

// create a set of strings and add  2 values

Set<String> set = new HashSet<String>();
set.add("moon");
set.add("sun");
System.out.println(set);

//create a map of string and string and add 3 items to it where the key of each is a word and the value is the 
//definition of the word

Map<String, String> dictionary = new HashMap<String, String>();

dictionary.put("apple", "fruit that grows in trees.");
dictionary.put("dog", "a domestic animal");
dictionary.put("car", "object people commonly use tp get to places");


// I tested all methods here (See all methods below the main method)
System.out.println(shortestString(colors));

// testing switcharoo method
List<String> swapped = switcharoo(colors);
for(String str : swapped ){
}
System.out.println("swapped string result: "+ swapped);

// testing combineString
String combined = combineString(colors);
System.out.println("combineString result: " + combined);

//testing search
List<String> searchResults = search(colors, "e"); //created a variable with the method and assigned it to a list
for (String result : searchResults) {
	System.out.println("these elements contain the letter `e`: " + result);
}

//testing sortDivisibleNumbers
List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,12,13,14,15,16,17,18,19,20,99);
System.out.println(sortDivisibleNumbers(numberList));  //this is the list of lists

List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numberList);

	for (List<Integer> list : sortedNumbers) { //for each list inside the list of lists
		for(Integer number: list) {     // for each number inside each list
		System.out.println(number);     //print each list
	}
	System.out.println("next list------"); //separating the lists

	}
	
// testing calculateStringLength
List<Integer> stringsLenghts = calculateStringLength(colors);

	for (Integer i : stringsLenghts) {
		System.out.println(i);
		
	}
	
// testing findAllThatStartsWith
	System.out.println("starts with m: ");
Set<String>	startsWithM = findAllThatStartsWith(set, 'm');
for(String word: startsWithM) {
	System.out.println(word);
}

// testing convertSetToList
List<String> resultList = convertSetToList(set);

for (String listString : resultList) {
	System.out.println(listString);
}

// testing extractEvens	
Set<Integer> integerSet = new HashSet<Integer>();  // i had to create a set of integers
integerSet.add(1);
integerSet.add(2);
integerSet.add(3);
integerSet.add(4);

Set<Integer> extractedEvens = extractEvens(integerSet);

for(Integer number: extractedEvens) {
	System.out.println(number);
}

// testing lookupValue

String value = lookupValue(dictionary,"apple");
System.out.println(value);

// testing countStringStartingWith
Map<Character, Integer> counts = countStringStartingWith(resultList);

for(Character character : counts.keySet()) {  //for each character in the keyset
	System.out.println(character + "-" + counts.get(character));
	}


} //end of main method


	
//write a test method (remember to write out of the main method) that takes a list of strings and returns the shortest string, then test the methods ABOVE  inside the main class
	
	public static String shortestString(List<String> list) {
	String shortest = list.get(0);  //first, set up a variable for the shortest string
	for(String string : list) {
		if (string.length() < shortest.length()) {
			shortest = string;
		}
	}
	return shortest;
	} 
	
// write a method that takes a list of strings and returns the list with the first and last element switched
	
	public static List<String> switcharoo(List<String> list) {
		String temp = list.get(0);  //this is the placeholder for the first value
		list.set(0, list.get(list.size() -1)); // overwrite temp element with the last element
		list.set(list.size()- 1, temp); //swapping last with first
		return list;
		}
// 	write and test a method that takes a list of strings and returns a string with all the list elements concatenated to each other
//separated by a comma	
	public static String combineString(List<String> strings){
		StringBuilder result  = new StringBuilder();  //create a placebuilder
		for (String string: strings) {
			result.append(string + ", ");
		}
	return result.toString();  //end of method, scroll up to see the test
	}
	
//write and test a method that takes a list of strings and a string and returns a new list with all strings from the original list concatenating the second parameter
	public static List<String> search(List<String> list, String query){
		List<String> results = new ArrayList<String>();
		for(String element : list) {
			if( element.contains(query)) {
				results.add(element);
				
			}
		}
	return results;
	}	
// write and test a method that takes a list of integers and returns List<List<Integer>> where the first list in the
//returned value contains any number from the input list that is divisible by 2, the second list contains values from
//the input list that are divisible by 3, the third divisible by 5, and the fourth all numbers from the input list not
//divisible by 2,3,or 5.
	
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list){
		List<List<Integer>> results = new ArrayList <List<Integer>>();
		results.add(new ArrayList <Integer>());  //created 4 empty lists to add the results
		results.add(new ArrayList <Integer>());
		results.add(new ArrayList <Integer>());
		results.add(new ArrayList <Integer>());
		
			for(Integer number : list) {
				if(number % 2 ==0) {
					results.get(0).add(number);  //add number to list index 0
				}
				
				if(number % 3 == 0) {
					results.get(1).add(number);  //add number to list index 1
				}
				
				if(number % 5 == 0) {
					results.get(2).add(number);  //add number to list index 2
				}
				
				if (number % 2 !=0 && number % 3 != 0 && number % 5 != 0) {
					results.get(3).add(number);
				}
			}
			return results;
		}
	
// write and test a method that takes a list of strings and returns a list of integers that contains the length of each string
	public static List<Integer> calculateStringLength (List<String> list) { //taking a list of integers
	List<Integer> lenghts = new ArrayList <Integer>();  //first, create a new list of integers
	for(String string : list) {  //iterate through each string in the list
		lenghts.add(string.length());  //add the length of the string
	}
		return lenghts;
}
	
// write and test a method that takes a set of strings and a character and returns a set of strings consisting of all
//the strings in the input set that start with the character parameter
	
	public static Set<String> findAllThatStartsWith(Set <String> set, char c){
		Set<String> results = new HashSet<String>();
		
		for(String string: set) {
			if(string.charAt(0) == c) {
				results.add(string);
			}
		}
		
		return results;	
	}

//write and test a method that takes a set of strings and returns a list of the same strings
	
	public static List<String> convertSetToList(Set<String> set){
		List<String> results = new ArrayList<String>();
		
		for(String string :set) {
			results.add(string);
		}
		return results;
	}
	
//write and test a method that takes a set of integers and returns a new set of integers containing only even numbers 
//from the original set
	
	public static Set<Integer> extractEvens(Set<Integer> set){
		Set<Integer> results = new HashSet<Integer>();  //this new set will contain only the even numbers we need
		
		for(Integer number : set) {
			if (number % 2 ==0) {
				results.add(number);
			}
		}
		
		return results;
	}
	
//	write and test a method that takes a Map<String, String> and a string and returns the value for a key in the map
// that matches the string parameter (i.e. like a language dictionary lookup)
	
	public static String lookupValue(Map<String, String> map, String string){
		
		for (String key : map.keySet()) {
			if(key.equals(string)) {
				return map.get(key);
			}
		}
		return "";   //if nothing matches will return an empty string
	}
	
// write and test a method that takes a List<String> and returns Map<Character, Integer> containing a count of all the
//strings that start with that given character
	 
	public static  Map<Character, Integer> countStringStartingWith(List<String> list){
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		
		for(String string: list) {
			char c = string.charAt(0);
			if(results.get(c) == null) {
				results.put(c, 1);
			}else {  //if it does not equal null
				results.put(c, results.get(c) + 1);
					
				}
			}
		return results;
		}
		
	
	
	
	
	
}// end of class
