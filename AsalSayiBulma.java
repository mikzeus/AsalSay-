import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        int sayac = 0;

        for (int k=1; k<=100;k++) {
            for (int i = 1; i < k; i++) {
                if (k % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 1) {
                System.out.print(k+" ");
            }
            sayac=0;
        }
    }
}
