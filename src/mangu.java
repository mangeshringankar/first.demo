import java.util.Scanner;
public class mangu {
    public static void main(String[] args)
    {
        int id;
        double salary;
        String job_name;
        Scanner sc = new Scanner(System.in) ;

        id=sc.nextInt();
        System.out.print("Enter the your name :-\n");
        name=sc.next();
        System.out.print("Enter the your Salary:-");
        salary=sc.nextDouble();
        System.out.print("enter the job name:-");
        job_name=sc.next();

        System.out.println("your id :-" + id);
        System.out.println("your salary is :-" +salary);
        System.out.println("your name is :-"+name);
        System.out.println("your job is :-"+job_name);

    }
}
