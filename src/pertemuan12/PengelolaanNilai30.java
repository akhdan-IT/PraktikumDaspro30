package pertemuan12;

import java.util.Scanner;

public class PengelolaanNilai30 {
    public static void main(String[] args) {
        Scanner akhdan = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = akhdan.nextInt();
        int[] nilai = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = akhdan.nextInt();
            total += nilai[i];
        }

        double rata2 = (double) total / n;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        System.out.println("\n=== DAFTAR NILAI ===");
        for (int i = 0; i < n; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println("\nRata-rata       : " + String.format("%.2f", rata2));
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

        akhdan.close();
    }
}
