package pertemuan2;

import java.util.Scanner;

public class StudiKasus1_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        int jumlahAnak;
        int tunjangan;
        double potongan = 0.10;

        System.out.println("Masukkan gaji pokok : ");
        gajiPokok = sc.nextInt();
        System.out.println("Masukkan tunjangan : ");
        tunjangan = sc.nextInt();
        System.out.println("Masukkan jumlah anak : ");
        jumlahAnak = sc.nextInt();

        int tunjanganAnak = tunjangan*jumlahAnak;
        double potonganPensiun = gajiPokok*potongan;
        double gajiBersih = gajiPokok+tunjanganAnak-potonganPensiun;

        System.out.println(gajiBersih);
        sc.close();
    }
}
