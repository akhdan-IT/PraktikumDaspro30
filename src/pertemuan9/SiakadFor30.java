//Batas pengulangan : 8 + (P mod 5) = 8, nilai minimal = 55 + (P mod 11) = 63

package pertemuan9;

import java.util.Scanner;

public class SiakadFor30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi=0, terendah=100;

        for (int i=1; i<=8; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+i+" : ");
            nilai = sc.nextDouble();
            if (nilai>tertinggi) {
                tertinggi = nilai;
            }
            if (nilai<terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi adalah : "+tertinggi);
        System.out.println("Nilai terendah adalah : "+terendah);
        
        sc.close();
    }
    
}

