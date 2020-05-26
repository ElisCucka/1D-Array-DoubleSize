/*****************************************
* New York Institute of Technology 
* CSCI 125: Computer Programming 1  
* Fall 2017 M04                     
* Lab 9: 1-D Array  
* Part 2: Double the size of a 1-D Array                
* Elis Cucka                       
* Purpose: Learn how to duplicate the size
* of an array.    
* November 21, 2017     Version 0.1
*****************************************/

public class Array_Double_Size 
{
	/***************************************************************
	* main - Creating and printing double capacity array
	* Inputs: args - String array
	* Outputs: void - none
	***************************************************************/
	public static void main(String[] args)
	{
		int[] array1 = new int[5];
		
		//Getting user input.
		@SuppressWarnings("resource")
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter " + array1.length + " numbers: ");
		for(int i = 0; i < array1.length; i++)
		{
			array1[i] = input.nextInt();
		}
		
		
		//Printing the content of the first array.
		System.out.print("The content of the first array is: ");
		for (int i = 0; i < array1.length; i++) 
		{
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		
		int[] array2 = new int[array1.length * 2];
		//Printing the content of the new and larger array.
		System.out.print("The content of the new and larger array is: ");
		
		//Calling the method.
		array2 = doubleCapacity (array1);
		
		for(int i = 0; i < array2.length; i++)
		{
			System.out.print(array2[i] + " ");
		}
	}
    
	
	/***************************************************************
	* doubleCapacity - returns an array variable referencing to a 
	* new array that doubles the size of the input array referenced 
	* by the parameter list
	* Inputs: list - array entered before
	* Outputs: number1 - doubled sized array 
	***************************************************************/
	public static int[] doubleCapacity (int[] list)
	{
		int[] double_size_array = new int[list.length * 2];
		
		for(int i = 0; i < double_size_array.length; i++)
		{
			if (i < list.length) 
			{
		        double_size_array[i] = list[i];
			}
			else
			{
				double_size_array[i] = 0;
			}
		}
		return double_size_array;
	}
}
