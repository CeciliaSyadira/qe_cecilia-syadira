import java.util.Scanner;

public class FaktorBilanganII {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Input : ");
        int bilangan = x.nextInt();
        System.out.print("Output : ");
        //Process: Your Solution Code Here
        for (int i=bilangan; i>=1;i--)
        {
            if(bilangan%i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
