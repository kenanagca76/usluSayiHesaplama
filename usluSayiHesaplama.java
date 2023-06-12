package usluSayiHesaplama;

import java.util.Scanner;

public class usluSayiHesaplama {
    public static void main(String[] args) {
        // 3^4 =3*3*3*3
        int k, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayi : ");
        k = input.nextInt();
        System.out.print("Üs olacak Sayi : ");
        n = input.nextInt();
        int total = 1;
        int i = 1;
       // while (i <= k) {
       //     total *= n;
       //     i++;
       // }
       // System.out.println("Cevap : " + total);

        for (i = 1; i <= n; i++) {
            total *= k;
        }
        System.out.println("===");
        System.out.println("CEVAP : " + total);
    }
}
