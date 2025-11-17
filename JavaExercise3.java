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

        int operator=obj1.nextInt();
        return operator;
    }
    
    static double result(int operator,double[] number1,int number){
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
    public static void main(String[] args){
        int number=number();
        double[] number1=number1(number);
        int operator=operator();
        double number3=result(operator, number1, number);

 
    }
}
