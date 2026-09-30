package pertemuan3;

import java.util.Scanner;

public class akhdanTugas1 {

    public static void main(String[] args) {
        Scanner akhdan = new Scanner(System.in);

        double x, y, sisaHarga, bunga, pokokPerbulan, cicilanPerbulan;
        int z;

        System.out.println("masukkan harga laptop Rp. ");
        x=akhdan.nextDouble();

        System.out.println("masukkan uang muka Rp. ");
        y=akhdan.nextDouble();

        System.out.println("masukkan lama cicilan ");
        z=akhdan.nextInt();

        sisaHarga=x-y;
        bunga=0.02*sisaHarga;
        pokokPerbulan=sisaHarga/z;
        cicilanPerbulan=pokokPerbulan+bunga;

        System.out.println("cicilan yang harus dibayar setiap bulan : Rp. " + cicilanPerbulan);

        akhdan.close();
    }
    
    

    
}
