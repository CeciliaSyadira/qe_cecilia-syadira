import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Input : ");
        int bilangan = x.nextInt();
        System.out.print("Output : ");
        //Process: Your Solution Code Here
        for (int i=1; i<=bilangan;i++)
        {
            if(bilangan%i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
