import java.util.Scanner;
public class JavaExercise1 {
    
    static Scanner obj1=new Scanner(System.in);
    
    double number1;
    double number2;
    
    static String getname(){
        System.out.println("Enter the name of the Student");
        String username=obj1.nextLine();
        return username;
    }
    static int age(){
        System.out.println("Enter the age of the user");
        int age=obj1.nextInt();
        return age;

    }
    public static void main(String[] args){
        
        String username=getname();
        int age=age();
        System.out.println("The name of the user is "+username+"And the age is "+age);
        
    }
}
