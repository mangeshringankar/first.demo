import java.util.Scanner;

public class If_Example {
    public static void main(String args []){
        String name;
        int age;
        boolean isstudent;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the name :- ");
       name= sc.nextLine();
        System.out.println("enter the age  :-");
        age=sc.nextInt();

        System.out.println("enter the your student (true/false):-");
         isstudent=sc.nextBoolean();
        if (name.isEmpty())
        {
            System.out.println(" please enter the name :- ");
        }
      else
      {
          System.out.println("hii  "+name +"!");
        }



       if (age>=60){
           System.out.println("your senior ");
       } else if (age>=18) {
           System.out.println("you are a adult !");
       } else if (age>=1) {
           System.out.println("you are a child !");

       } else if (age>=0) {
           System.out.println("you are a baby !");

       }
       else {
           System.out.println(" please enter  the valid age  ");

       }

        if(isstudent){
            System.out.println("you are a student !");
        }

       else{
            System.out.println("you are not a student !");
        }

    }

}
