import java.util.Scanner;
public class circul {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double radius;
        double area;
        double circumference;
        double volume;
        System.out.println("enter the radius :- ");
        radius=sc.nextDouble();
        area=Math.PI*Math.pow(radius,2);
        circumference=2*Math.PI*radius;
        volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);

        System.out.printf("the area of circle is :- %.1fcm²\n ",area);
        System.out.printf("the circumference is :- %.1fcm\n",circumference);
        System.out.printf("the volume of the circle is:- %.1fcm³ \n",volume);


        sc.close();
    }
}
