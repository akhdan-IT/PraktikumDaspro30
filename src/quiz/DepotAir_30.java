package quiz;

import java.util.Scanner;

public class DepotAir_30 {
    public static void main(String[] args) {
        Scanner akhdan = new Scanner(System.in);

        int airBersih;
        int jumlahGalon;
        int Pendapatan;
        int sisaAir;
        double rataPendapatan;

        System.out.println("Masukkan jumlah air bersih (liter)");
        airBersih=akhdan.nextInt();

        jumlahGalon=airBersih%19;
        sisaAir=airBersih%19;
        Pendapatan=jumlahGalon*19500;
        rataPendapatan=Pendapatan*8;

        System.out.println("Jumlah galon : " +jumlahGalon);
        System.out.println("Sisa air (liter) : " +sisaAir);
        System.out.println("Pendapatan : " + Pendapatan);
        System.out.println("Rata-rata per jam : " +rataPendapatan);

        akhdan.close();
    }
    
}
