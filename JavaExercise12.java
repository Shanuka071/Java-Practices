import java.util.Scanner;
public class JavaExercise12 {
    
    static Scanner obj1=new Scanner(System.in);

static int select_package(){
    System.out.println("********Welcome to A.S.P. Wedding planners.****************");
    System.out.println("Select the Package of our service,");
    System.out.println("1.Primum package ");
    System.out.println("2.Silve package");
    System.out.println("3.Normal Package");
    System.out.println("-----------------------------------------------------------");
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
            System.out.println("-----------------------------------------------------------");
            break;
        case 2:
            System.out.println("*******Thank you for selecting the Silver Package*******");
            System.out.println("Here are our services that are belong to the Silver Package...");
            System.out.println("1.Wedding Cars...");
            System.out.println("2.Hotel Services...");
            System.out.println("3.A buffer set for the 100 plates...");
            System.out.println("-----------------------------------------------------------");
            break;    
        case 3:
            System.out.println("*******Thank you for selecting the Normal Package*******");
            System.out.println("Here are our services that are belong to the Normal Package..."); 
            System.out.println("2.Hotel Services...");
            System.out.println("3.A buffer set for the 100 plates...");
            System.out.println("-----------------------------------------------------------");
            break;
        default:
            System.out.println("Enter the valid number for continuing the procedure.");
            break;
    }

}
    static void package_deatails1(int number){
        System.out.println("....Futher more details....");
        System.out.println("Enter number ");
        int number2=obj1.nextInt();

        switch (number2) {
            case 1:
                System.out.println("...Select the vehicle...");
                System.out.println("1.Audi Car.");
                System.out.println("2.Mercedize Benz.");
                System.out.println("3.BMW.");
                System.out.println("4.Prius.");
                System.out.println("-----------------------------------------------------------");
                int number3=obj1.nextInt();
               //choose the customer's choice Car...

               switch (number3) {
                case 1:
                    System.out.println("*There is a free 100Km ");
                    System.out.println("*There is a extra charge for additional km");
                    double price1=10000.00;
                    System.out.println("*The price of car is Rs."+price1);
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("*There is a free 100Km ");
                    System.out.println("*There is a extra charge for additional km");
                    double price2=10000.00;
                    System.out.println("*The price of car is Rs."+price2);
                    System.out.println("-----------------------------------------------------------");
                    break;    
                case 3:
                    System.out.println("*There is a free 100Km ");
                    System.out.println("*There is a extra charge for additional km");
                    double price3=10000.00;
                    System.out.println("*The price of car is Rs."+price3);
                    System.out.println("-----------------------------------------------------------");
                    break;

                case 4:
                    System.out.println("*There is a free 100Km ");
                    System.out.println("*There is a extra charge for additional km");
                    double price4=10000.00;
                    System.out.println("*The price of car is "+price4);
                    System.out.println("-----------------------------------------------------------");
                    break;    
                default:
                    System.out.println("Please a enter the valid number for this.");
                    break;
               }

                break;
            case 2:
                System.out.println("........Hotel Services.....");
                System.out.println("*All the Hotel Servies are free of Charge...");
                System.out.println("*There is no any extra payment for this package...");
                System.out.println("*You can customerize the services also.");
                System.out.println("-----------------------------------------------------------");
                break;
            case 3:
                System.out.println(".......BufferSet.........");
                System.out.println("*Custermer can select the buffer menu as thier wishes...");
                System.out.println("*And, dessert coner is available in this package...");
                System.out.println("*Dinning tables deccorations...");       
                System.out.println("*Buffer set includes only 100 plates only...");
                System.out.println("*For additional chargers are charged per each plates...");
                System.out.println("-----------------------------------------------------------");
                break;
            case 4:
                System.out.println(".........DJ Sound system.........");
                System.out.println("*The Dj sound system with free artist is given...");
                System.out.println("*Free smoking machine...");
                System.out.println("*free light system is provided...");
                System.out.println("*Free wireless mics are supplied...");
                System.out.println("-----------------------------------------------------------");
                break;    
            default:
                System.out.println("Enter the valid number for continue the programme...1");
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
            


                break;
        
            default:
                break;
        }
        
        return 0;
        //
    }

    public static void main(String[] args){
        int number=select_package();
        
        
        int choice=1;
        // User can select number of times for the inquery.
        while(choice==1){
        System.out.println("Enter ,");
        System.out.println("1.To continue.");
        System.out.println("2.To end the program.");
        System.out.println("*************************************************************");
        choice=obj1.nextInt();

            if(choice==1){
                package_details(number);
                package_deatails1(number);    

            }
             
            else{
                System.out.println("The program is over...");
                System.out.println("*******Thank You for selecting the A.S.P.Wedding Planner*********");
            }
        }
        }
        
    }

