import java.util.Scanner;

public class thema2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double basi;
        double ipsos;

        System.out.print("Dwse tin basi tou trigwnou: ");
        basi = s.nextDouble();
        System.out.print("Dwse to ipsos tou trigwnou: ");
        ipsos = s.nextDouble();

        double sum = (basi*ipsos)/2;

        System.out.println("To embado tou trigvnou einai: " + sum);
    }
}
