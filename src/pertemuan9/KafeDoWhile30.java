//kopi = 10000 ( 1000+(30 mod 5)x1000), teh = 7000 (5000 + (30 mod 4) × 1000), roti = 15000 (15000 + (30 mod 6) × 1000) 

package pertemuan9;

import java.util.Scanner;

public class KafeDoWhile30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHarga, kopi, teh, roti, hargaKopi = 10000, hargaTeh = 7000, hargaRoti = 15000;
        String namaPelanggan;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            sc.nextLine();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
        } while (true);

        sc.close();
    }
    
}
