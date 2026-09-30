package pertemuan3;

import java.util.Scanner;

public class MenghitungTotalBayar30 {
    public static void main(String[] args) {
        
    Scanner akhdan = new Scanner(System.in);

    int harga;
    double potongan;
    double jml_bayar;
    double diskon = 0.15;

    harga = akhdan.nextInt();

    potongan = diskon*harga;

    jml_bayar=harga-potongan;

    System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);

    akhdan.close();
    }

}
