//JFM1T3_Assignment4:
/*
1.Write a program to store your best friend's mobile number in a variable and print the last 4 digits. Consider the following sample for reference.
  Mobile number should accept only 10 digits. Not less than 10 digits or greater than 10 digits. 
  Allow user to input the phone number from the terminal

  Sample Input:
        mobileNum=9393927890

  Expected Output:
        Your friend's mobile number ends with ******7890

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class MobileNumber {
   public static void main(String[] args){
     String number;
//Define the main method
Scanner sc=new Scanner(System.in);
     System.out.println("enter a mobile number");
//Declare the variable
      number=sc.nextLine();
//Use the scanner class to provide mobileNum at execution time
if(number.length()==10)
{
  String phonenumber=number.substring(6);
System.out.println("number ends with ******"+phonenumber);
}
else{
  System.out.println("error");
     }
}
}
/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter phone number (10 digits)");
mobileNum = scanner.nextLine();
*/

//Verify if the mobile number is equal to 10 digits or not

//If the mobile number is equal to 10 digits then extract the last 4 digits else print error message

//Print the result
//System.out.println("Mobile number ends with ******"+variablename);

