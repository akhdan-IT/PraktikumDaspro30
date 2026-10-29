/*
 P = 30
 P mod 6 = 0 -> Harga tiket   = 40000 + (0 x 2000)   = Rp40.000
 P mod 3 = 0 -> Syarat diskon 1 = lebih dari (3 + 0) = lebih dari 3 tiket
 P mod 5 = 0 -> Diskon 1      = (8 + 0)%             = 8%
 P mod 4 = 2 -> Syarat diskon 2 = lebih dari (8 + 2) = lebih dari 10 tiket
              -> Diskon 2     = (15 + 2)%            = 17%
*/

package pertemuan9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 40000;
        int jumlah;
        int totalTiket = 0;
        double totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid, masukkan jumlah yang valid!");
                continue; // abaikan input, minta input ulang
            }

            if (jumlah > 0) {
                double total = jumlah * hargaTiket;

                if (jumlah > 10) {
                    total = total - (total * 17 / 100);
                    System.out.println("Diskon 17%");
                } else if (jumlah > 3) {
                    total = total - (total * 8 / 100);
                    System.out.println("Diskon 8%");
                }

                System.out.println("Total bayar pelanggan: Rp" + total);
                totalTiket += jumlah;
                totalPenjualan += total;
            }
        } while (jumlah != 0);

        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp" + totalPenjualan);

        sc.close();
    }
}
