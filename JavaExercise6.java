import java.util.Scanner;

public class JavaExercise6 {
 static Scanner obj1=new Scanner(System.in);

 static int input_choice(){
    System.out.println("Enter the choice");
    System.out.println("1.Celcius");
    System.out.println("2.Kelvin");
    System.out.println("3.Farenheiht");
    int input_choice=obj1.nextInt();

    return input_choice;
 }
 static void number1(int input_choice){
    switch (input_choice) {
        case 1:
            System.out.println("Enter the temperature in Celicius");
            double temperature1=obj1.nextDouble();
            double converter1;
            
            System.out.println("Select,");
            System.out.println("1.Convert into the Kelvin");
            System.out.println("2.Convert into Farrenheiht");
            double number=obj1.nextInt();

            int choice=1;
            if(choice==1){
                if(number==1){
                double output1=temperature1+273.15;
                System.out.println("The temperature in celicius is "+temperature1+" is converted to the "+output1);
            }else if(number==2){
                
                double output1=temperature1*(9/5)+32;
                System.out.println("The temperature in celcius is "+temperature1+" is converted to the "+output1);
            }else{
                System.out.println("Invalid number is entered");
            }
            }else{
                System.out.println("End the program.");
            }
            

            
            break;

        case 2:
            System.out.println("Enter the temperature in Kelvin");
            double temperature2=obj1.nextDouble();
            double converter2;
            
            System.out.println("Select,");
            System.out.println("1.Convert into the Celcius");
            System.out.println("2.Convert into Farrenheiht");
            double number1=obj1.nextInt();

            int choice1=1;
            if(choice1==1){
                if(number1==1){
                double output1=temperature2-273.15;
                System.out.println("The temperature in Kelvin is "+temperature2+" is converted to the Celcius "+output1);
            }else if(number1==2){
                double output2=temperature2-273.15;
                double output1=output2*(9/5)+32;
                System.out.println("The temperature in Kelvin is "+temperature2+" is converted to the Farrenheight "+output1);
            }else{
                System.out.println("Invalid number is entered");
            }
            }else{
                System.out.println("End the program.");
            }
            

            
            break;
        case 3:
            System.out.println("Enter the temperature in Farrenheigh");
            double temperature3=obj1.nextDouble();
            double converter3;
            
            System.out.println("Select,");
            System.out.println("1.Convert into the Celcius");
            System.out.println("2.Convert into Kelvin");
            double number2=obj1.nextInt();

            int choice3=1;
            if(choice3==1){
                if(number2==1){
                double output1=(temperature3-32)*(5/9);
                System.out.println("The temperature in Farrenheight is "+temperature3+" is converted to the Celcius "+output1);
            }else if(number2==2){
                
                double output2=(temperature3-32)*(5/9);
                double output3=output2+273.15;
                System.out.println("The temperature in celcius is "+temperature3+" is converted to the "+output3);
            }else{
                System.out.println("Invalid number is entered");
            }
            }else{
                System.out.println("End the program.");
            }
            

            
            break;        
    
        default:
        System.out.println("Please enter the valid number for the calculation");
            break;
    }
 }

 //Main method
 public static void main(String[] args){
    int input_choice=input_choice();
    number1(input_choice);
    int choice=1;
    while(choice==1){
            System.out.println("Enter,");
            System.out.println("1.Continue the program.");
            System.out.println("2.Exit program.");
            choice=obj1.nextInt();
        if(choice==1){
            number1(input_choice);
        }else{
            System.out.println("End the program.");
        }
    }
 }
}
