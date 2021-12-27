import java.util.Scanner;
public class ΘΕΜΑ3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double number;

        System.out.print("Give a number: ");
        number = s.nextDouble();

        if(number < 100){
            System.out.println("Small number");
        }
        else if(number >= 100 && number < 1000){
            System.out.println("Medium number");
        }
        else if(number >= 1000){
            System.out.println("Large number");-
        }

    }
}
