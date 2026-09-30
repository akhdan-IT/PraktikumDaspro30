package pertemuan5;

import java.util.Scanner;

public class TugasParkir30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarif = 0;

        System.out.println("---CETAK TARIF PARKIR---");
        System.out.println("Masukkan lama parkir (jam)");
        int lamaParkir = sc.nextInt();
        
        if (lamaParkir <= 2) {
            tarif=2000;
        }
        else {
            tarif=2000+(lamaParkir-2)*1000;
        }
        
        System.out.println("Tarif parkir yang harus dibayar: Rp " + tarif);

        sc.close();

    }
}
