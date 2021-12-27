import java.util.Scanner;
class exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean cal = true;
        boolean pr = true;
        String choice;
        double number1;
        double number2;

        while (cal)
        {
            System.out.print("Dwse ton prwto arithmo: ");
            number1 = scan.nextDouble();
            System.out.print("Dwse ton deutero arithmo: ");
            number2 = scan.nextDouble();
            System.out.print("Dialekse tin praksei pou theleis(+,-,*,/,^): ");
            choice = scan.next();


            while(pr) {
                if (choice.equals("+"))
                {
                    System.out.println("To apotelesma einai: " + (number1 + number2));
                    break;
                }
                else if (choice.equals("-"))
                {
                    System.out.println("To apotelesma einai: " + (number1 - number2));
                    break;
                }
                else if (choice.equals("*"))
                {
                    System.out.println("To apotelesma einai: " + (number1 * number2));
                    break;
                }
                else if (choice.equals("/")) {
                    System.out.println("To apotelesma einai: " + (number1 / number2));
                    break;
                }
                else if (choice.equals("^"))
                {
                    System.out.println("H dinamh tou prwtou arithmou einai: " + (number1 * number1) + " " + "H dinamh tou deutetou arithmou einai: " + (number2 * number2));
                    break;
                }
                else {
                    System.out.println("o telestis den einai ekgiros!!prospathise ksana!!");
                    System.out.print("Dialekse tin praksei pou theleis(+,-,*,/): ");
                    choice = scan.next();

                }
            }
            System.out.println();
            System.out.println("Gia eksodo piese to (0) alliws piese opoiodipote allo pliktro na sinexiseis!!");
            String exodos = scan.next();
            if (exodos.equals("0"))
                cal = false;
        }
    }
}
