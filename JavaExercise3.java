import java.util.Scanner;
//Build a simple Calculator using methods and arrays.
public class JavaExercise3 {
static Scanner obj1=new Scanner(System.in);

static int number(){
    //Enter the number of digits or number that are entered into the calculator.
    System.out.println("Enter the number of numbers that you are added? ");
    int number=obj1.nextInt(); 
    return number;

}

static double[] number1(int number){
    
    double[] number1=new double[number];

    for(int i=0;i<number;i++){
        System.out.println("Enter the "+(i+1)+": ");
        number1[i]=obj1.nextDouble();
    }
    return number1;
}
    
static int operator(){
        
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Select the Operation number :");

        int operator1=obj1.nextInt();
        return operator1;
    }
    
    static double result(int operator,int operator1,double[] number1,int number){
        double number3=number1[0]; 
        switch (operator) {
            case 1:
                number3=0;
                for(int i=0;i<number1.length;i++){
                    
                    number3+=number1[i];
                }
                System.out.println("The  the number is "+number3);
            
                break;
             case 2:
                number3=number1[0];
                for(int i=1;i<number1.length;i++){
                    
                    number3-=number1[i];
                }
                System.out.println("The differentiation number are "+number3);
            
                break;
            case 3:
                number3=number1[0];
                for(int i=1;i<number1.length;i++){
                    number3*=number1[i];
                }
                System.out.println("The Mulitiplication of the number is "+number3);
                break;
            case 4:
                number3=number1[0];
                for(int i=1;i<number1.length;i++){
                    number3/=number1[i];
                }
                System.out.println("The division of  is "+number3);
                
                break;
                
                
                
            default:
                System.out.println("Invalid operator");
                return 0;
                
        }
        return number3;

    }
        static double result1(int operator,int operator1,double[] number1,int number){
        double number4=number1[0]; 
        switch (operator) {
            case 1:
                number4=0;
                for(int i=0;i<number1.length;i++){
                    
                    number4+=number1[i];
                }
                System.out.println("The  the number is "+number4);
            
                break;
             case 2:
                number4=number1[0];
                for(int i=1;i<number1.length;i++){
                    
                    number4-=number1[i];
                }
                System.out.println("The differentiation number are "+number4);
            
                break;
            case 3:
                number4=number1[0];
                for(int i=1;i<number1.length;i++){
                    number4*=number1[i];
                }
                System.out.println("The Mulitiplication of the number is "+number4);
                break;
            case 4:
                number4=number1[0];
                for(int i=1;i<number1.length;i++){
                    number4/=number1[i];
                }
                System.out.println("The division of  is "+number4);
                
                break;
                
                
                
            default:
                System.out.println("Invalid operator");
                return 0;
                
        }
        return number4;

    }


    
    public static void main(String[] args){
        int number=number();
        double[] number1=number1(number);
        int operator1=operator();
        double number3=result1(operator1, operator1, number1, number);
        
        int desire=1;
        
        //control the calculator by the user.
        while(desire==1){
            
            System.out.println("1.if you preffer to change the operator ");
            System.out.println("2.You can end the calculation.");
            desire=obj1.nextInt();
            if(desire==1){
                int operator=operator();
            double number4=result(operator,operator1, number1, number);
            }
            else{
                System.out.println("The Calculation is over");
            }
        }

        

 
    }
}
