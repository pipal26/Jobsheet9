import java.util.Scanner;

public class linearSearch14 {

    public static void main(String[] args) {
        
        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappucino", 
            "Chocolate Ice"
        };
        
        Scanner scanner = new Scanner(System.in);
        boolean isTersedia = false; 

        System.out.println("=== Selamat Datang di Cafe ===");
        System.out.println("Daftar Menu Tersedia:");
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println("------------------------------");

        System.out.print("Masukkan nama makanan/minuman yang ingin Anda pesan: ");
        String makananDicari = scanner.nextLine();
        
        String makananDicariLowerCase = makananDicari.toLowerCase();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].toLowerCase().equals(makananDicariLowerCase)) {
                isTersedia = true; 
                break; 
            }
        }

        System.out.println("\n=== Hasil Pencarian ===");
        if (isTersedia) {
            System.out.println("Yeay! Makanan/Minuman **" + makananDicari + "** **TERSEDIA** di menu kami. Pesanan Anda akan segera disiapkan."); 
        } else {
            System.out.println("Mohon maaf, makanan/minuman **" + makananDicari + "** **TIDAK ADA** di dalam menu kami."); 
        }
        System.out.println("------------------------------");

        scanner.close();
    }
}