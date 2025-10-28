import java.util.Scanner;

public class Main10{
    
    public static void main(String[] args){
        Scanner obj1=new Scanner(System.in);

        System.out.println("Enter the number of digits to be entered ? ");
        int num1=obj1.nextInt();

        double[] number=new double[num1];

        for(int i=0;i<num1;i++){
            System.out.println("Enter the "+(i+1)+" is ");
            number[i]=obj1.nextInt();
        
        
        }
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("Enter the digit of the operation");
        int num2=obj1.nextInt();

        double num3=number[0];
        switch (num2) {
            case 1:
                for(int i=1;i<num1;i++){
                    
                    num3+=number[i];
                }
                System.out.println("The Sum of "+(num1)+" number is "+num3);
                break;
            case 2:
                for(int i=1;i<num1;i++){
                    num3-=number[i];
                }
                System.out.println("The differenciation of "+(num1)+" number is "+num3);
                break;
            case 3:
                for(int i=1;i<num1;i++){
                    num3*=number[i];
                }
                System.out.println("The Product of "+(num1)+" number is "+num3);
                break;
            case 4:
                for(int i=1;i<num1;i++){
                    num3/=number[i];
                }
                System.out.println("The Division of "+(num1)+" number is "+num3);
                break;
        
            default:
            System.out.println("Enter the valid number");
                break;

                
        }
        
    }

}