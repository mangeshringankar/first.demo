import java.util.Scanner;
public class cal {
    public static void main (String[]args )
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the num1:");
    float a=sc.nextFloat();
    System.out.println("enter the num2:");
    float b= sc.nextFloat();
        System.out.println("1 :- for addition");
        System.out.println("2:-for subtraction");
        System.out.println("3:- for the division");
        System.out.println("4:- for multiplication");
        System.out.println("5:- for reminder ");
        System.out.println("6:- for exit");
    System.out.println("enter the option:");
    int opration=sc.nextInt();

    switch (opration){
        case 1:
            System.out.println(a+b);
            break;
        case 2:
            System.out.println(a-b);
            break;
        case 3:
            System.out.println(a/b);
            break;
        case 4:
            System.out.println(a%b);
            break;
        case 5:
            System.out.println(a*b);
            break;
        case 6:
            System.out.print("exit");
            break;
        default:
            System.out.print("enter the valiad option ");
            break;

    }



}
}
