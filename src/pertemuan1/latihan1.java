package pertemuan1;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner Akhdan = new Scanner(System.in);

        int tabunganAwal;
        int lamaMenabung;
        double bungaTabungan;
        double bunga5Tahun;
        double tabAkhir;

        System.out.print("Masukkan tabungan awal: ");
        tabunganAwal = Akhdan.nextInt();
        System.out.print("Masukkan lama menabung (dalam tahun): ");
        lamaMenabung = Akhdan.nextInt();

        bungaTabungan = tabunganAwal * 0.05;
        bunga5Tahun = bungaTabungan * lamaMenabung;
        tabAkhir = tabunganAwal + bunga5Tahun;

        System.out.println("Bunga tabungan per tahun: " + bungaTabungan);
        System.out.println("Bunga tabungan selama " + lamaMenabung + " tahun: " + bunga5Tahun);
        System.out.println("Total tabungan akhir: " + tabAkhir);

        Akhdan.close();
    }
}