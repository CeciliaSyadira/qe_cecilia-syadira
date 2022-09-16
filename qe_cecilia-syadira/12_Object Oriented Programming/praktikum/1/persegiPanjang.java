package ObjectOrientedProgramming;
import java.util.Scanner;

public class persegiPanjang implements bangunDatar {

    persegiPanjang(){}

    public double luas(double sisi1, double sisi2){
        return (sisi1 * sisi2);
    }

    public double keliling(double sisi1, double sisi2){
        return  (2 * (sisi1 + sisi2));
    }

}
