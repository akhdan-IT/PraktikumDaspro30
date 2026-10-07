package pertemuan7;

import java.util.Scanner;

public class StudiKasus230 {
    public static void main(String[] args) {
        Scanner akhdan = new Scanner(System.in);

        System.out.println("Nama Mahasiswa : ");
        String nama = akhdan.nextLine();

        System.out.println("Jenis Kegiatan (BELAMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = akhdan.nextLine();

        System.out.println("Jumlah Dokumen yang diupload : ");
        int jumlahDokumen = akhdan.nextInt();

        System.out.println("Peringkat Juara : ");
        int peringkat = akhdan.nextInt();

        System.out.println("Status pendanaan PKM (1=lolos, 0=tidak lolos) : ");
        int statusPKM = akhdan.nextInt();

        String statusPendanaan = "";
        boolean dapatDana = false;

        if (jumlahDokumen < 4) {
            statusPendanaan = "Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan";
        } else {
            String jenisLower = jenisKegiatan.toLowerCase();

            if (jenisLower.equals("belamawa") || jenisLower.equals("bakorma") || jenisLower.equals("mandiri")) {
                dapatDana = (peringkat >= 1 && peringkat <= 3);
            } else if (jenisLower.equals("pkm")) {
                dapatDana = (statusPKM == 1);
            } else {
                dapatDana = false;
            }

            if (dapatDana) {
                statusPendanaan = "Dana penghargaan diberikan";
            } else {
                statusPendanaan = "Dana penghargaan tidak diberikan";
            }
        }

        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Jenis Kegiatan : " + jenisKegiatan);
        System.out.println("Jumlah Dokumen : " + jumlahDokumen);
        System.out.println("Peringkat Juara : " + peringkat);
        System.out.println("Status Pendanaan : " + statusPendanaan);

        akhdan.close();
    }
}
