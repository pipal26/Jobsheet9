import java.util.Scanner;

public class ProgramKafe14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Pemesanan Kafe Sederhana ===");
        System.out.print("Masukkan jumlah item pesanan yang berbeda: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        long totalBiaya = 0;

        System.out.println("--- Masukkan Detail Pesanan ---");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nItem ke-" + (i + 1));
            
            System.out.print("Nama Makanan/Minuman: ");
            namaPesanan[i] = scanner.nextLine();
            
            System.out.print("Harga (Rp): ");
            int harga = scanner.nextInt();
            hargaPesanan[i] = harga;
            scanner.nextLine();

            totalBiaya += harga;
        }

        System.out.println("\n=====================================");
        System.out.println("       DAFTAR PESANAN ANDA           ");
        System.out.println("=====================================");
        
        System.out.printf("%-5s | %-20s | %s\n", "No.", "Nama Pesanan", "Harga (Rp)");
        System.out.println("-------------------------------------");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-5d | %-20s | %,d\n", 
                              (i + 1), 
                              namaPesanan[i], 
                              hargaPesanan[i]);
        }

        System.out.println("-------------------------------------");
        System.out.printf("TOTAL BIAYA KESELURUHAN: Rp %,d\n", totalBiaya);
        System.out.println("=====================================");
        System.out.println("Terima kasih atas pesanan Anda!");

        scanner.close();
    }
}