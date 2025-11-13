import java.util.Scanner;

public class kelolaNilai14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa yang akan diinput (bilangan bulat): ");
        int jumlahNilai = scanner.nextInt();

        int[] nilaiMahasiswa = new int[jumlahNilai];
        int totalNilai = 0;
        int nilaiTertinggi = -1;
        int nilaiTerendah = 101;

        System.out.println("--- Mulai Input Nilai ---");

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int nilai = scanner.nextInt();

            nilaiMahasiswa[i] = nilai;

            totalNilai += nilai;

            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }

            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        System.out.println("--- Hasil Pengolahan Nilai ---");

        System.out.print("Semua Nilai yang Dimasukkan: [");
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print(nilaiMahasiswa[i]);
            if (i < jumlahNilai - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        double rataRata = (double) totalNilai / jumlahNilai;
        System.out.printf("Nilai Rata-rata: %.2f\n", rataRata);

        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);

        scanner.close();
    }
}