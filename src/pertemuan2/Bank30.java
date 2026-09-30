package pertemuan2;

import java.util.Scanner;

public class Bank30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double presentase_bunga =0.02, bunga,jml_tabungan_akhir;

        System.out.println("Masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = sc.nextInt();
        System.out.println("Masukkan lama menabung anda");
        lama_menabung = sc.nextInt();

        bunga = jml_tabungan_awal*presentase_bunga*lama_menabung;
        jml_tabungan_akhir=jml_tabungan_awal+bunga;

        System.out.println("Bunga adalah " +bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " +jml_tabungan_akhir);

        sc.close();
    }
    
}
