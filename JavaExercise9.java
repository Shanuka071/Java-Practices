import java.util.Scanner;
//check the entered number is an even number or an odd number.
public class JavaExercise9 {
    static Scanner obj1=new Scanner(System.in);
public static void main(String[] args){
System.out.println("Enter the number :");
int number=obj1.nextInt();

if(number%2==0){
    System.out.println("The entered number is an even number.");
}else{
    System.out.println("The enterd number is an odd number.");
}
}    
}
