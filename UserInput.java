import java.util.Scanner;
public class UserInput{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
//Taking integer as input
System.out.println("Enter Integer:");
int number=sc.nextInt();
//Taking String as input
System.out.println("Enter Name:");
sc.nextLine();
String name = sc.nextLine();
//Displaying input's and Corresponding output's
System.out.println("You have entered:" +number);
System.out.println("Your entered Name:" +name);
sc.close();
}
}
