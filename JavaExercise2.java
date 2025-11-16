import java.util.Scanner;
//create a form using a java methods
public class JavaExercise2 {
static Scanner obj1=new Scanner(System.in);

static String username(){
    System.out.println("Enter the User's full name :");
    String username=obj1.nextLine();
    return username;
}
static int age(){
    System.out.println("Enter the current age of the user :");
    int age1=obj1.nextInt();
    obj1.nextLine();
    return age1;
}

static String sex(){
    System.out.println("Enter the Sex of the user:\n");
    String sex=obj1.nextLine();
    return sex;

}

static String regno(){
    System.out.println("Enter the Regno of the user :");
    String regno=obj1.nextLine();
    return regno;
}

static String campus(){
    System.out.println("Enter the University name :");
    String campus_name=obj1.nextLine();
    return campus_name;
}

static String idno(){
    System.out.println("Enter the identity card number of the user :");
    String idno=obj1.nextLine();
    return idno;

}
public static void main(String[] args){
    String username=username();
    int age=age();
    String sex=sex();
    String regno=regno();
    String campus_name=campus();
    String idno=idno();
    System.out.println("------------------------------------------------------------------");
    System.out.println("|           A.S.P     Form    Sheet.                              |");
    System.out.println("|       Full name  :"+username+"                                     ");
    System.out.println("|       Age        :"+age+"                                          ");
    System.out.println("|       Sex        : "+sex+"                                         ");
    System.out.println("|       Reg.No     :"+regno+"                                        ");
    System.out.println("|       University :"+campus_name+"                                  ");
    System.out.println("|       Identity No:"+idno+"                                         ");
}

}
