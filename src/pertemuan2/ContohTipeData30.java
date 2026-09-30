package pertemuan2;

public class ContohTipeData30
{
    public static void main(String[] args) {
        char golonganDarah = 'A';
        byte jarak = (byte) 130;
        short jumlahpendudukdalamsatudusun = 1025;
        float suhu = 60.50f;
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angkadesimal = 0x10;

        System.out.println("Golongan Darah\t\t\t: " + (byte) golonganDarah);
        System.out.println("Jarak\t\t\t: " + jarak);
        System.out.println("Jumlah Penduduk dalam Satu Dusun\t: " + jumlahpendudukdalamsatudusun);
        System.out.println("Suhu\t\t\t: " + suhu);
        System.out.println("Berat\t\t\t: " + (float) berat);
        System.out.println("Saldo\t\t\t: " + saldo);
        System.out.println("Angka Desimal\t\t\t: " + angkadesimal);
    }
    
}
