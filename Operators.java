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
}
}



