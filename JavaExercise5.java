import java.util.Scanner;
//Temperature Converter using the Java methods.
public class JavaExercise5 {
    static Scanner obj1=new Scanner(System.in);

    static double input_temperature(){
        System.out.println("Enter the temperatue in celcius:");
        double input_temperature=obj1.nextInt();
        return input_temperature;
    }
    //Convert the temperature in Kelvin
    static double converter1(double input_temperature){
        double converter1=input_temperature+273.15;
        return converter1;
    }
    //Convert the temperature into Farenheiht.
    static double converter2(double input_temperature){
        double converter2=input_temperature*(9/5)+32;
        return converter2;
    }
    //Custermer User pannel.
    static void output(double input_temperature,double converter1,double converter2){
        System.out.println("1.Convert the temperature into the Kelvin.");
        System.out.println("2.Convert the temperature into the Farrenheiht");
        System.out.println("3.Show the temperature in both Kelvin and Farrenheiht");
        System.out.println("Select the option that you need");
        int number=obj1.nextInt();

        switch (number) {
            case 1:
                
                System.out.println("The Celcius Temperature of "+input_temperature+" in Kelvin is "+converter1);

                break;
            case 2:
            
                System.out.println("The Celcius Temperature of "+input_temperature+" in Farenheiht is "+converter2);
                
                break;
            case 3:
                System.out.println("The Celcius temperatureof "+input_temperature+" in Kelvin is "+converter1+"in Fareheight"+converter2);
                
                break;    
            default:
                System.out.println("Enter the valid number.");
                break;
        }
        
    }
    
    public static void main(String[] args){
        double input_temperature=input_temperature();
        
    
    int choice=1;
    while(choice==1){
        System.out.println("Enter,");
        System.out.println("1.Continue");
        System.out.println("2.Exit.");
         choice=obj1.nextInt();

        if(choice==1){
        double converter1=converter1(input_temperature);
        double converter2=converter2(input_temperature);
        output(input_temperature, converter1, converter2);
            
        }else{
            System.out.println("Temperature converter is over.");
        }
    }
        
    }

}
