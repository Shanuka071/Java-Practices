import java.util.Scanner;

public class JavaExercise8 {
    static Scanner obj1=new Scanner(System.in);

public static void main(String[] args){
    System.out.println("Enter the number of times:");
    int number=obj1.nextInt();

    for(int i=0;i<number;i++){
        System.out.println("Say I'm sorry.");
    }
}    
}
