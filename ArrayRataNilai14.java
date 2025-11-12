import java.util.Scanner;
public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs ;
        double total = 0;
        double rata2lulus;
        double rata2tidaklulus;
        int jmlMhsLulus = 0;
        int jmlMhsTidakLulus = 0;
        int nilaiMhsLulus = 0;
        int nilaiMhsTidakLulus = 0;
        

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                jmlMhsLulus++;
            }else {
                jmlMhsTidakLulus++;
            }

            if (nilaiMhs[i] >= 70) {
                nilaiMhsLulus += nilaiMhs[i];
            } else {
                nilaiMhsTidakLulus += nilaiMhs[i];
            }
        }

        rata2lulus = nilaiMhsLulus / jmlMhsLulus;
        rata2tidaklulus = nilaiMhsTidakLulus / jmlMhsTidakLulus;
        System.out.println("Rata-rata nilai yang lulus = " + rata2lulus);
        System.out.println("Rata-rata nilai yang tidak lulus = " + rata2tidaklulus);
        System.out.println("Jumlah mahasiswa yang lulus = " + jmlMhsLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + jmlMhsTidakLulus);

    }
}

