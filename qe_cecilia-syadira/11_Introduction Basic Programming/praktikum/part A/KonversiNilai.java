import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args){
        // input
        Scanner x = new Scanner(System.in);
        System.out.print("Input: ");
        int studentScore = x.nextInt();
        System.out.print("Output: ");

        // Process : Your solution code here
        if (studentScore >= 80 && studentScore <=100){
            System.out.print("Nilai A");
        }
        else if (studentScore >= 65 && studentScore <=79){
            System.out.print("Nilai B+");
        }
        else if (studentScore >= 50 && studentScore <=64){
            System.out.print("Nilai B");
        }
        else if (studentScore >= 35 && studentScore <=49){
            System.out.print("Nilai C");
        }
        else if (studentScore >= 0 && studentScore <=34){
            System.out.print("Nilai D");
        }
        else {
            System.out.print("Invalid");
        }

        //Output
        // Nilai A
    }
}
