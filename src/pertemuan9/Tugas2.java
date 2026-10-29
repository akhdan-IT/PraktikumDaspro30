/*
 P = 30
 P mod 6 = 0 -> Tarif mobil = 2500 + (0 x 250) = Rp2.500 per jam
             -> Tarif motor = 1500 + (0 x 250) = Rp1.500 per jam
*/

package pertemuan9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.print("Input jenis (1 mobil, 2 motor, 0 keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Input durasi (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 2500;
                } else {
                    total += durasi * 1500;
                }
            }
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp" + total);

        sc.close();
    }
}