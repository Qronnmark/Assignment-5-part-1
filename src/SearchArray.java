import java.util.Scanner;

/**
 * 
 */

/**
 * @author q.ronnmark
 * Name: Quenton Ronnmark
 * Teacher: Mr.Hardman
 * Assignment 5 part 1
 * Nov 23rd 2016
 */
public class SearchArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double searchValue;
		int[] myArray = {13, 17, 20, 2, 6, 8, -3, 10};
		int index = -1;
		
		for(int i = 0; i < myArray.length; i++){
			System.out.print(myArray[i] + "  ");
			
		}
		 
		System.out.println("\nWhat value do you want the index of?");
		searchValue = userInput.nextDouble();
		
		
		for(int i = 0; i < myArray.length; i++){
			
			if(searchValue == myArray[i]){
				index = i;
			}
			
		}
		
	    if(index == -1){
	    	System.out.println("This is not in the array!");
	    } else {
	    	System.out.println("This was found at " + index);
	    }
		
		userInput.close();
		 
	}

}
