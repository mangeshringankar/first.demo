import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class area {
    public static void main(String args[]){
        double h,w,a;
        System.out.println("enter  tbe height :- ");
        Scanner sc = new Scanner(System.in);
        h=sc.nextDouble();
        System.out.println("enter the width :- ");
        w=sc.nextDouble();
        a=h*w;
        System.out.println("Area :- "+a+"cm²");
}
}
