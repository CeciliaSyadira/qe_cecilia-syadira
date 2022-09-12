import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        int bilangan, i;
        boolean primeNumber = true;

        Scanner x = new Scanner(System.in);

        System.out.print("Input : ");
        bilangan = x.nextInt();
        System.out.print("Output : ");

        if (bilangan == 0 || bilangan == 1){
            primeNumber = false;
        }
            for (i = 2; i <= bilangan/2; i++) {
                if (bilangan % i == 0) {
                    primeNumber = false;
                    break;
                }
            }

        if (primeNumber)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
