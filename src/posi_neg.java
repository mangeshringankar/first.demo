import java.util.Scanner;
public class posi_neg {
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter the number :- ");
        Scanner sc = new Scanner (System.in);
        num = sc.nextInt();
        if(num>=0) {
            System.out.println("the number is  positive :-" + num);

        }
        else
        {
            System.out.println("The number is Negetive :-"+num);
        }

    }
}
