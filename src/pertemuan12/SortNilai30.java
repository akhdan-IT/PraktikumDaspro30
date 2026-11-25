package pertemuan12;

import java.util.Arrays;

public class SortNilai30 {
    public static void main(String[] args) {
        int[] akhdan = {50, 65, 42, 80, 30, 55};   // B=50: {B, B+15, B-8, B+30, B-20, B+5}
        System.out.println("Sebelum: " + Arrays.toString(akhdan));

        for (int i = 0; i < akhdan.length - 1; i++) {
            for (int j = 0; j < akhdan.length - 1 - i; j++) {
                if (akhdan[j] > akhdan[j + 1]) {
                    int temp = akhdan[j];
                    akhdan[j] = akhdan[j + 1];
                    akhdan[j + 1] = temp;
                }
            }
        }
        System.out.println("Sesudah: " + Arrays.toString(akhdan));
    }
}
