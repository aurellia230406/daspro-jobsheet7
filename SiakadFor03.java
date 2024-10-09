import java.util.Scanner;


public class SiakadFor03 {
    public static void main(String[] args) {
        double nilai, tertinggi = 0, terendah = 100;
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i <= 9; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke- " + (i + 1) + " : ");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        input.close();
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
    }
}