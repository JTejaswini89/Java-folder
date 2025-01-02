import java.util.Scanner;
public class Operators{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your first number:");
int num1=sc.nextInt();
System.out.println("Enter your second number:");
int num2=sc.nextInt();

//Arithmetic Operators
System.out.println("Sum:" +(num1+num2));
System.out.println("Difference:" +(num1-num2));
System.out.println("Multiplication:" +(num1*num2));
System.out.println("Division:" +(num1/num2));
System.out.println("Modulus:" +(num1%num2));
System.out.println("Increment:" +(num1++));
System.out.println("Decrement:" +(num1--));
System.out.println("Increment:" +(num2++));
System.out.println("Decrement:" +(num2--));

//Assignment Operators
System.out.println("Assign:" +(num1=num2));
System.out.println("Add and Assign:" +(num1+=num2)); 
System.out.println("Subtract and Assign:" +(num1-=num2)); 
System.out.println("Multiply and Assign:" +(num1*=num2)); 
System.out.println("Divide and Assign:" +(num1/=num2)); 
System.out.println("Modulus and Assign:" +(num1%=num2)); 

//Comparison Operator
System.out.println("Is Equal To:" +(num1==num2));
System.out.println("Is Not Equal To:" +(num1!=num2)); 
System.out.println("Is Greaterthan To:" +(num1>num2)); 
System.out.println("Is Lessthan To:" +(num1<num2)); 
System.out.println("Is Greaterthan or Lessthan To:" +(num1>=num2)); 
System.out.println("Is Lessthan or equal To:" +(num1<=num2)); 
 
sc.close();
}
}

