package pertemuan7;

import java.util.Scanner;

public class StudiKasus130 {
    public static void main(String[] args) {
        Scanner akhdan = new Scanner(System.in);

        int hargaPercup = 15000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon = 0, totalBayar;
        int kembalian = 0;
        int kurang = 0;

        System.out.println("Masukkan jumlah cup");
        jumlahCup=akhdan.nextInt();
        System.out.println("Masukkan Uang Bayar");
        uangBayar=akhdan.nextInt();

        totalHarga=jumlahCup*hargaPercup;

        if (totalHarga >= 80000) {
            diskon=totalHarga*5/100;
        }

        totalBayar=totalHarga-diskon;

        System.out.println("Total Harga : Rp  " + totalHarga);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Total Bayar : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian=uangBayar-totalBayar;
            System.out.println("Kembalian Rp : " + kembalian);
            }
        else {
            kurang=totalBayar-uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

    akhdan.close();
    }

    
}
