package pertemuan12;

import java.util.Scanner;

public class KafeKampus30 {
    public static void main(String[] args) {
        Scanner akhdan = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                         "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

    
        System.out.println("=== MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-16s Rp %,d%n", (i + 1), menu[i], harga[i]);
        }

    
        System.out.print("\nCari menu: ");
        String cari = akhdan.nextLine();
        int idxCari = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) { idxCari = i; break; }
        }
        if (idxCari != -1) System.out.printf("%s tersedia, harga Rp %,d%n", menu[idxCari], harga[idxCari]);
        else System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia.");


        System.out.print("\nJumlah item yang dipesan: ");
        int jumlah = Integer.parseInt(akhdan.nextLine());

        String[] pesanan = new String[jumlah]; 
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int k = 0; k < jumlah; k++) {
            int idx = -1;
            while (idx == -1) {                  
                System.out.print("Pesanan ke-" + (k + 1) + " (nama menu): ");
                String nama = akhdan.nextLine();
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(nama)) { idx = i; break; }
                }
                if (idx == -1) System.out.println("Menu tidak tersedia, coba lagi.");
            }
            pesanan[k] = menu[idx];
            hargaPesanan[k] = harga[idx];
            total += harga[idx];
        }

        System.out.println("\n======== DAFTAR PESANAN ========");
        for (int k = 0; k < jumlah; k++) {
            System.out.printf("%d. %-16s Rp %,10d%n", (k + 1), pesanan[k], hargaPesanan[k]);
        }
        System.out.println("--------------------------------");
        System.out.printf("%-19s Rp %,10d%n", "TOTAL BIAYA", total);

        akhdan.close();
    }
}
