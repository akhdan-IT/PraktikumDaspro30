package pertemuan12;

import java.util.Scanner;

public class SearchNilai30 {
    public static void main(String[] args) {
        Scanner akhdan = new Scanner(System.in);
        System.out.print("Banyak elemen: ");
        int n = akhdan.nextInt();
        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = akhdan.nextInt();
        }
        System.out.print("Nilai yang dicari (key): ");
        int key = akhdan.nextInt();

        int posisi = -1;
        for (int i = 0; i < n; i++) {
            if (nilai[i] == key) { posisi = i; break; }
        }
        if (posisi != -1) System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + posisi);
        else System.out.println("Nilai yang dicari tidak ditemukan: " + key + " tidak ada di antara " + n + " data.");

        akhdan.close();
    }
}
