package pertemuan2;

public class tugas1 {
    public static void main(String[] args) {
        int gajiPokok=5000000;
        int jumlahAnak=4;
        int tunjanganPeranak=100000;
        double persenPensiun=10;
        
        int tunjanganAnak=tunjanganPeranak * jumlahAnak;
        double potonganPensiun=(persenPensiun / 100) * gajiPokok;
        double gajiBersih = gajiPokok + tunjanganAnak - potonganPensiun;

        System.out.println("PERHITUNGAN GAJI PAK DANUR");
        System.out.println("gaji pokok : Rp" + gajiPokok);
        System.out.println("jumlah anak : " + jumlahAnak + " anak");
        System.out.println("tunjangan anak : Rp" + tunjanganAnak);
        System.out.println("potongan pensiun : Rp" + (int)potonganPensiun);
        System.out.println("gaji bersih : Rp" + (int)gajiBersih);

    }
    
}
