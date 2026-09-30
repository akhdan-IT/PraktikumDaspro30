package pertemuan2;

import java.util.Scanner;

public class StudiKasus2_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lebartanah;
        int panjangtanah;
        int diameterkolam;
        int panjangsisitaman;

        System.out.println("Masukkan lebar tanah");
        lebartanah = sc.nextInt();
        System.out.println("Masukkan panjang tanah");
        panjangtanah = sc.nextInt();
        System.out.println("Masukkan diameter kolam");
        diameterkolam = sc.nextInt();
        System.out.println("Masukkan panjang sisi taman");
        panjangsisitaman = sc.nextInt();

        int luasTanah = lebartanah * panjangtanah;
        int luasTaman = panjangsisitaman * panjangsisitaman;
        double jariJariKolam = diameterkolam / 2;
        double luasKolam = 3.14 * jariJariKolam * jariJariKolam;
        double luastidakgunakan = luasTanah - luasKolam - luasTaman;

        System.out.println(luastidakgunakan);

        sc.close();
    }
}
