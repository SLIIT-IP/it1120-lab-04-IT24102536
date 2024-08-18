import java.util.Scanner;

public class IT24102536Lab4Q3{
 public static void main(String[] args){
	 
	 Scanner input = new Scanner(System.in);
	 int  num;
	 String num1;
	 
	 System.out.print("Enter a number: ");
	 num = input.nextInt();
	 
	 num1 = (num > 0) ? "The number is: Positive" : (num < 0) ? "The number is: negative"  : "The number is: zero" ;
	 
	 System.out.println(num1);
	
 
 
 
  }
 }