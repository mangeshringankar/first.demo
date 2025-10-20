import java.util.Scanner;
public class Shopping_Card {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String item;
        double price ;
        int quantity;
        String currancy="$";
        double total;

        System.out.println("enter the item name :- ");
        item=sc.nextLine();
        System.out.println("Enter the price of item :-  ");
        price=sc.nextDouble();
        System.out.println("Enter  the quantity of "+ item+":- ");
        quantity=sc.nextInt();
        total=quantity*price;
        System.out.println(" the totel bill :-"+currancy+total);
        sc.close();
    }
}
