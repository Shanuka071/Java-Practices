import java.util.Scanner;
//Planing for the Wedding applivation.
public class JavaExercise11 {
    static Scanner obj1=new Scanner(System.in);

static int select_vehicle(){
    System.out.println("********Welcome to A.S.P. Wedding planners.****************");
    System.out.println("Select the Package of our service,");
    System.out.println("1.Primum package ");
    System.out.println("2.Silve package");
    System.out.println("3.Normal Package");
    int number=obj1.nextInt();

    return number;
}

static void package_details( int number){
    switch (number) {
        case 1:
            System.out.println("*******Thank you for selecting the Primum Package*******");
            System.out.println("Here are our services that are belong to the Primum Package...");
            System.out.println("1.Wedding Cars...");
            System.out.println("2.Hotel Services...");
            System.out.println("3.A buffer set for the 100 plates...");
            System.out.println("4.A Dj sound system with the DJ artist...");
            break;
        case 2:
            System.out.println("*******Thank you for selecting the Silver Package*******");
            System.out.println("Here are our services that are belong to the Silver Package...");
            System.out.println("1.Wedding Cars...");
            System.out.println("2.Hotel Services...");
            System.out.println("3.A buffer set for the 100 plates...");
            
            break;    
        case 3:
            System.out.println("*******Thank you for selecting the Normal Package*******");
            System.out.println("Here are our services that are belong to the Normal Package..."); 
            System.out.println("1.Hotel Services...");
            System.out.println("2.A buffer set for the 100 plates...");
            
            break;
        default:
            System.out.println("Enter the valid number for continuing the procedure.");
            break;
    }

}

    static double wedding_calculator(int number){
        System.out.println("Please enter your budget:");
        double Wedding_budget=obj1.nextDouble();
        
        System.out.println("Input the Package number:");
        int number1=obj1.nextInt();

        switch (number1) {
            case 1:
                int free_distance=100;
                double distance;
                double fuel_cost=5000;
                double wedding_car_cost=distance*75+;
                break;
        
            default:
                break;
        }
        
    }
}
