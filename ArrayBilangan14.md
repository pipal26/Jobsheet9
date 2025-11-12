1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
Program menjadi error, karena angka-angka tersebut tidak bisa ditampung di variabel integer.
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
3. Ubah statement pada langkah No 4 menjadi seperti berikut
 for (int i = 0; i < 4; i++){
        System.out.println(bil[i]);
        }
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4 at ArrayBilangan14.main(ArrayBilangan14.java:6), karena lebih dari indeks yang telah ditetapkan yaitu 4.