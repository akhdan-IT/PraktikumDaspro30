package pertemuan3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang30 {

    public static void main(String[] args) {
        Scanner akhdan = new Scanner(System.in);
        
        int panjang;
        int lebar;
        int luas;

        panjang=akhdan.nextInt();
        lebar=akhdan.nextInt();

        luas=panjang*lebar;

        System.out.println("luas persegi adalah " + luas);

        akhdan.close();

    }
}


    


