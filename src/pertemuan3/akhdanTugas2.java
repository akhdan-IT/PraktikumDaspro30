package pertemuan3;

import java.util.Scanner;

public class akhdanTugas2 {
    public static void main(String[] args) {
        Scanner akhdan = new Scanner(System.in);

        int x;
        double cetak;
        double jilid=5000;
        double total;

        System.out.println("masukkan jumlah dokumen yang ingin di cetak : ");
        x=akhdan.nextInt();

        cetak=x*500;
        total=cetak+jilid;

        System.out.println("total biaya yang harus dibayar : " + total);

        akhdan.close();
    }
    
}
