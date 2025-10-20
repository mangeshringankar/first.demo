import java.util.Random;
public class Random_ex {
    public static void main(String args[]){

        Random rd = new Random();
        boolean isHeades;



        isHeades = rd.nextBoolean();

        if(isHeades)
        {
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }
    }

}
