1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + (i) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
Tidak ada perubahan, karena sama" mengikuti batas indeks (angka > 10 sebelumnya sesuai dengan batas indeks).
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
akan true jika variabel i kurang dari jumlah panjang indeks variabel array nilaiAkhir.
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program
hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai
> 70):
for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70)
            System.out.println("Mahasiswa ke-" + (i) + "Lulus");
        }
Jalankan program dan jelaskan alur program!
4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan
nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus,
seperti ilustrasi output berikut: