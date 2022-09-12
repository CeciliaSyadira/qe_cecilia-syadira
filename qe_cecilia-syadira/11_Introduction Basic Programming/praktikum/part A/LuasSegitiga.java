import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args){
        float alas, tinggi;
        double luas;
        Scanner n = new Scanner(System.in);
        //input
        System.out.print("Alas : ");
        alas = n.nextFloat();
        System.out.print("Tinggi : ");
        tinggi = n.nextFloat();

        // kode disini
        luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga: " +luas);
    }
}
