import java.util.Scanner;

public class javaQ1 {

        static void Discount(double amount,int id,String username){
            double discount=0;
            double net=0;

            if(amount<=30000){
                discount=amount*0.02;
            }else if(amount>=30001 && amount<=50000){
                discount=amount*0.07;
                
            }else if(amount>=50001&&amount<=70000){
                discount=amount*0.12;

            }else if(amount>=70001 && amount<=100000){

                discount=amount*0.18;
            }else if(amount>=100000){
                discount=amount*0.25;
            }

            net=amount-discount;

            System.out.println("The customer's Id no is "+id);
            System.out.println("The customer's name is "+username);
            System.out.println("The Purchase amount is "+amount);
            System.out.println("The discount is "+discount);
            System.out.println("The Net amount is "+net);
        }
    public static void main(String[] args){
        Scanner obj1=new Scanner(System.in);
        Scanner obj2=new Scanner(System.in);

        int id;
        String username;
        double amount;

        System.out.println("Enter the Customer's Id :");
        id=obj1.nextInt();

        System.out.println("Enter the Customer's name");
        username=obj2.nextLine();

        System.out.println("Enter the purchase amount :");
        amount=obj1.nextDouble();

        Discount(amount, id, username);
    }
    
}
