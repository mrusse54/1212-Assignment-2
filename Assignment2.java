
/*
 * Description :This program has menu that gives the user the ability to pick one of 10 options listed by entering a letter from A to J
 * A Enter a new Main Sentence, B  Search for a String, C Search for all incidents of a string, D Search for and capitalize a String if necessary,
 *  E Replace all incidents of a string to another one, F Count the number of words , G Count the number of occurrences of a letter, H Count the total number of letters, I Delete all occurrences of a word,
 *  and J simply quit the program. All these functions are looped until the user enters "J" to end the program completely.
 * 
 * @author Mitchell Russell
 *
 * @version 1.0.10
 *
 * @Date: 3/30/20
 * 
 * Pseudocode : 

display welcome message and prompt user to input sentece
Begin loop allowing user to run the program until they want to quit
display the 10 menu options
User inputs a letter that matches the menu option
if letter for an option is picked run the option 

if A is inputed, option A is executed
Prompt user to enter a new main sentence
user inputs sentence
update the main sentence with entered sentence, this is the new main sentence
return to menu

if B is inputed, option B is executed
prompt user to search for first occurence of a word within the main sentence
user inputs a word
if the word is contained in main sentence, skip line under
if not contained, tell user their entered word is not contained in the main sentence and return to menu
display the word and first index of it in the main sentence
return to menu

if C is inputed, option C is executed
prompt user to search for all occurences of a word within the main sentence
user inputs a word
if the word is contained in the main sentence and skip line under
if not contained, tell user their entered word is not contained in the main sentence and return to menu
split main sentence into an array
use the formual of length of the indexed variable plus 1 to get its length needed for my index formula and to begin calculating the index, these lengths will be refered to as length+1
add each of these lengths+1 for every indexed variable
if the value of the indexed variable in the array equals the word entered stop counting, but include this word in the accumulative length+1 value
use accumulative lenght+1 value and subract 1 from it
the resulting value will also be subtracted the length of the matching word, only the length no plus 1 added to it
The final result will be the index, if there are more occurences of the word continue counting and repeat the formula
display the word and the index or indexes
return to menu

if D is inputed, option D is executed
Prompt user to enter a word
user inputs a word
if the word is contained in main sentence, skip line under
if not contained, tell user their entered word is not contained in the main sentence and return to menu
prompt asking them if they want to capitalize they first occurence of the word yes=Y no=N
if "Y"
split main sentence into an array
if the value of the indexed variable in the array equals the word entered
capitalize the word they entered by spliting the word and capitalizing the first letter
replace the word in the indexed variable in the array with the now capitalized word, reminder this is only for the first occurence of the word
print line with updated main sentence
reset to menu
if "N"
leave the main sentence untouched
return to menu

if E is inputed, option E is executed
Prompt user to enter a word to be replaced in main sentence
user inputs a word
if the word is contained in the main sentence, skip line under
if not contained, tell user their entered word is not contained in the main sentence and return to menu
Prompt user to enter a word to be implemented into the main sentence
user inputs a word
split main sentence into an array
if indexed variable in array equals the the word to be replaced
replace the word and implement new word into the main string
continue the proccess until all indexed variables are tested
display updated main sentence
return to menu

if F is inputed, option F is executed
split main sentence into an array
count number of indexed variables in the array
print counted amount
return to menu

if G is inputed, option G is executed
prompt the user to input a letter to count the occurence of
user inputs a letter
if the letter is contained in the main sentence, skip line under
if not contained, tell user their entered letter is not contained in the main sentence and return to menu
if the letter in the main sentence matches the letter the user entered
add 1 to a counter everytime it matches
print result of the counter
return to menu

if H is inputed, option H is executed
split main sentence into an array
trim the spaces from the words
count length of each variable in array to get number of characters
add lengths together
subract accumulated lenghts from the main string to get the number of spaces
display sum of added lengths and result of lengths being subtracted from main string
return to menu

if I is inputed, option I is executed
Prompt user to enter a word to be erased in the main string
user enter word
if the word is contained in main sentence, skip line under
if not contained, tell user their entered word is not contained in the main sentence and return to menu
split main sentence into an array
if indexed variable in the array equals the word to be replaced
erase the word and update the string
return to return

if J is inputed, option J is executed
"J" is the kill switch so the loop is exited 
display goodbye message

if user enters an invalid input tell them they need to enter a valid option
return to menu
*/

// import Scanner
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

		// creates Scanner
		Scanner input = new Scanner(System.in);

		// creates Scanner
		Scanner input1 = new Scanner(System.in);

		// creates a string variable MenuOption with the place holder value of z
		String MenuOption = "z";

		// prompts user input
		System.out.println("Welcome, please enter a main sententce.");

		// creates a string variable called mainString that stores users input
		String mainString = input.nextLine();

		// while loop the loops until user enters J
		while (!MenuOption.contentEquals("J")) {

			// class menuPromt method
			menuPrompt();

			// takes user input and stores value in MenuOption variable
			MenuOption = input.next();

			// if MenuOption value is A
			if (MenuOption.contains("A")) {

				// invokes newMainString and assigns return value to mainString
				mainString = newMainString(mainString);

				// if MenuOption value is B
			} else if (MenuOption.contains("B")) {

				// prompts user
				System.out.println("Enter a word to see if it is in the main string entered. ");

				// creates String variable firstOccurenceSearch that stores users input
				String firstOccurenceSearch = input1.nextLine();

				// invokes method searchString with arugument mainString, firstOccurenceSearch
				// to see if firstOccurenceSearch is contained in mainString returns boolean
				if (searchString(mainString, firstOccurenceSearch)) {

					// prints line
					System.out.println(" the first occurence of " + firstOccurenceSearch + " is "
							+ searchStringIndex(mainString, firstOccurenceSearch) + ".");

					// if not contained print line
				} else
					System.out.println("The word " + firstOccurenceSearch + " is not found.");

				// if MenuOption value is C
			} else if (MenuOption.contains("C")) {

				// prompts user
				System.out.println("Enter a word you want to find all incidents for. ");

				// creates String variable allOccurenceSearch that stores users input
				String allOccurenceSearch = input1.next();

				// invokes method searchString to see if allOccurenceSearch is contained in
				// mainString returns boolean
				if (searchString(mainString, allOccurenceSearch)) {

					// invokes method searchAllString with the arguments mainString ,
					// allOccurenceSearch and returns string value
					String occurences = searchAllString(mainString, allOccurenceSearch);

					// prints line
					System.out.println(occurences);

					// prints line
					System.out.println("");

					// if not contained print line
				} else
					System.out.println("The word " + allOccurenceSearch + " is not contained in the string. ");

				// if MenuOption value is D
			} else if (MenuOption.contains("D")) {

				// prints prompt
				System.out.println(" Enter a word  ");

				// creates String variable that stores users input
				String capitalWord = input1.next();

				// invokes method searchString with arugument mainString, capitalWord to see if
				// capitalWord is contained in mainString returns boolean
				if (searchString(mainString, capitalWord)) {

					// prompts user
					System.out.println(" Do yo want to capitalize the first occurence of " + capitalWord
							+ " ? Enter Y/y for yes or N/n for no.");

					// creates String variable that stores users input
					String capitalYesOrNo = input1.next();

					// if capitalYesOrNo value eqauls y/Y no matter the case
					if (capitalYesOrNo.equalsIgnoreCase("Y")) {

						// invokes method CapitalizeString with the arguments mainString , capitalWord
						// and returns string value
						mainString = capitalizeString(mainString, capitalWord);

						// prints line
						System.out.println(mainString);

						// if capitalYesOrNo value eqauls N/n no matter the case the string will left
						// alone
					} else if (capitalYesOrNo.equalsIgnoreCase("N")) {
						// prints line
						System.out.println("The senentce will not be changed. ");
					}

					// if not contained print line
				} else
					System.out.println("The word " + capitalWord + " is not contained in the string. ");

				// if MenuOption value is E
			} else if (MenuOption.contains("E")) {

				// prompts user
				System.out.println(" Enter a word from the main string entered prior to be replaced. ");

				// creates String variable that stores users input
				String wordBeingReplaced = input1.next();

				// invokes method searchString with argument mainString,wordBeingReplaced to see
				// if wordBeingReplaced is contained in mainString returns boolean
				if (searchString(mainString, wordBeingReplaced)) {

					// prints prompt
					System.out.println(" Enter a word to replace word inputed above. ");

					// creates String variable that stores users input
					String replacingWord = input1.next();

					// invokes method replaceString with the arguments mainString,
					// wordBeingReplaced, replacingWord and returns string value
					mainString = replaceString(mainString, wordBeingReplaced, replacingWord);

					// prints line
					System.out.println(mainString);

					// if not contained print line
				} else
					System.out.println("The word " + wordBeingReplaced + " is not contained in the string. ");

				// if MenuOption value is F
			} else if (MenuOption.contains("F")) {

				// prints line and invokes method countWords with argument mainString that
				// returns an int value
				System.out.println(" There are " + countWords(mainString) + " words. ");

				// if MenuOption value is G
			} else if (MenuOption.contains("G")) {

				// prints prompt
				System.out.println(" Enter a letter to count the number of occurrences of said letter. ");

				// creates String variable that stores users input
				String letter = input1.next();

				// assigns only the first character in the string entered to letter
				letter = letter.substring(0, 1);

				// invokes method countOccurrencesLetter with the arguments mainString, letter
				// and returns int value
				int letterOccurrencesCount = countOccurrencesLetter(mainString, letter);

				// prints line
				System.out.println(" There is a total of: " + letterOccurrencesCount + " occurences of the letter "
						+ letter + ".");

				// if menuOption value is H
			} else if (MenuOption.contains("H")) {

				// prints line and invokes method countLetters with argument mainString that
				// returns an int value
				System.out.println("There are " + countLetters(mainString) + " letters in the main string. ");
			}

			// if MenuOption value is I
			else if (MenuOption.contains("I")) {

				// prints prompt
				System.out.println(" Enter a word from the main string to delete all the occurences of it. ");

				// creates String variable that stores users input
				String wordToBeDeleted = input1.next();

				// invokes method searchString with argument mainString, wordToBeDeleted to see
				// if wordToBeDeleted is contained in mainString returns boolean
				if (searchString(mainString, wordToBeDeleted)) {

					// invokes method deleteWord with the arguments mainString, wordToBeDeleted and
					// returns String value
					mainString = deleteWord(mainString, wordToBeDeleted);

					// prints line
					System.out.println(mainString);

					// if not contained print line
				} else
					System.out.println("The word " + wordToBeDeleted + " is not contained in the string. ");

				// if MenuOption value is J
			} else if (MenuOption.contains("J")) {

				// prints line and invokes exit method that returns a string
				System.out.println(exit());

				// if user does not iput A-J prints line
			} else
				System.out.println(" Enter a valid menu option please. ");
		}
	}

	// void method
	public static void menuPrompt() {

		// prints line
		System.out.println(
				" pick a menu option. Enter a letter that coincides with the options that you want to modify you string with\n "
						+ " Menu:\n A. Enter a new sentence\n B. Search for a String\n C. Search for all incidents of a String\n "
						+ "D. Search for and capitalize a String if necessary\n E. Replace all the incidents of a String\n F. Count the number of words\n"
						+ " G. Count the number of occurrences of a letter\n H. Count the total number of letters\n I. Delete all occurrences of a word\n"
						+ " J .Exit");
	}

	// return method that returns a String value and has a parameter of a String
	// variable
	public static String newMainString(String mainSentence) {

		// creates Scanner
		Scanner input = new Scanner(System.in);

		// prompts user
		System.out.println("Enter a new main sentence please.");

		// Stores users input in mainSentence variable
		mainSentence = input.nextLine();

		// returns mainSentence
		return mainSentence;

	}

	// return method that returns a int value and has a parameter of two String
	// variables
	public static int searchStringIndex(String mainSentence, String word) {

		// returns the index of the first occurence of the String variable word in the
		// String mainSentence
		return mainSentence.indexOf(word);
	}

	// return method that returns a String value and has a parameter of two String
	// variables
	public static String searchAllString(String mainSentence, String word) {

		// create String variable with the value ""
		String occurenceList = "";

		// creates three int variable with the value of 0
		int count = 0;

		int sum = 0;

		int index = 0;

		// creates array with the value of mainString a word for each indexed variable
		String[] sentence = mainSentence.split(" ");

		// prints line
		System.out.print("The word " + word + " can be found at an index of: ");

		// standard for loop that loops the length of the array sentence
		for (int i = 0; i < sentence.length; i++) {

			// assigns the value of the length of the indexed variable at i
			count = sentence[i].length();

			// adds 1 to account for spaces in string
			sum += count + 1;

			// if sentence[i] indexed variable contains String value
			if (sentence[i].equals(word)) {
				// calculates the index of the mathching word
				index = ((sum - 1) - sentence[i].length());
				// assings the index value to occurenceList and converts its value to a
				// character sequence
				occurenceList += index + " ";
			}

		}

		// returns occurenceList
		return occurenceList;
	}

	// return method that returns a Boolean and has a parameter of two String
	// variables
	public static Boolean searchString(String mainSentence, String word) {

		// if mainSentence contains word return true
		if (mainSentence.contains(word))
			return true;

		// if not contained return false
		return false;
	}

	// return method that returns a String value and has a parameter of two String
	// variables
	public static String capitalizeString(String mainSentence, String word) {

		// creates array with the value of mainString a word for each indexed variable
		String[] sentence = mainSentence.split(" ");

		// standard for loop that loops the length of the array sentence
		for (int i = 0; i < sentence.length; i++) {

			// if sentence[i] indexed variable contains String value
			if (sentence[i].contentEquals(word)) {

				// takes first character in a substring to captitalize then puts the rest of the
				// word into another substring concat them back together
				word = word.substring(0, 1).toUpperCase() + word.substring(1);

				// replaces the first occournce of the sentence[i] the original word value with the
				// newly capitalized word in the word variable
				mainSentence = mainSentence.replaceFirst(sentence[i], word);
			}
		}
		// returns mainSentence
		return mainSentence;
	}

	// return method that returns a String value and has a parameter of 3 String
	// variables
	public static String replaceString(String mainSentence, String searchWord, String replaceWord) {

		// creates array with the value of mainString a word for each indexed variable
		String[] sentence = mainSentence.split(" ");

		// standard for loop that loops the length of the array sentence
		for (int i = 0; i < sentence.length; i++) {

			// if sentence[i] indexed variable contains String value
			if (sentence[i].contains(searchWord))
				// replace first occurences of the sentence[i] indexed variable value with
				// capitalWord
				// in the string mainString
				mainSentence = mainSentence.replace(searchWord, replaceWord);
		}

		// returns mainSentence
		return mainSentence;
	}

	// return method that returns an int value and has a parameter of a String
	// variable
	public static int countWords(String mainSentence) {

		// creates int variable with the value 0
		int countWords = 0;

		// creates array with the value of mainString a word for each indexed variable
		String[] sentence = mainSentence.split(" ");

		// standard for loop that loops the length of the array sentence
		for (int i = 0; i < sentence.length; i++) {
			// increments countWords
			countWords++;
		}

		// returns countWords
		return countWords;

	}

	// return method that returns an int value and has a parameter of two String
	// variables
	public static int countOccurrencesLetter(String mainSentence, String word) {

		// creates char variable with the value of the character at the index of 0 in the variable word
		char letter = word.charAt(0);

		// creates int variable with the value 0
		int count = 0;

		// standard for loop that loops the length of the array sentence
		for (int i = 0; i < mainSentence.length(); i++) {
			// if mainSentence char at i is equal to letter
			if (mainSentence.charAt(i) == letter)
				// increments countWords
				++count;

		}
		
		// returns count
		return count;
	}

	// return method that returns an int value and has a parameter of a String
	// variable
	public static int countLetters(String mainSentence) {

		// creates int variable with the value 0
		int count = 0;

		// creates int variable with the value 0
		int sum = 0;

		// creates array with the value of mainString a word for each indexed variable
		String[] sentence = mainSentence.split(" ");

		// standard for loop that loops the length of the array sentence
		for (int i = 0; i < sentence.length; i++) {

			// assigns the value of the length of the indexed variable at i
			count = sentence[i].length();

			// assigns the value of count to sum the value increases eachtime the loop runs
			sum += count;

		}

		// returns sum
		return sum;

	}

	// return method that returns a String value and has a parameter of two String
	// variables
	public static String deleteWord(String mainSentence, String word) {

		// create String variable with the value ""
		String delete = "";

		// creates array with the value of mainString a word for each indexed variable
		String[] sentence = mainSentence.split(" ");

		// standard for loop that loops the length of the array sentence
		for (int i = 0; i < sentence.length; i++) {
			// if mainSentence indexed variable at i contains word
			if (sentence[i].contains(word))
				
				// replace all occurences of wordToBeDeleted with delete in the string mainSentence
				mainSentence = mainSentence.replace(word, delete);

		}

		// returns mainSentence
		return mainSentence;
	}

	// void method
	public static String exit() {

		// creates String variable with sequences of characters
		String byeMessage = "Bye";

		// returns byeMessage
		return byeMessage;
	}

}
