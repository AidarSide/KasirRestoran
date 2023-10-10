import java.util.Scanner;

public class KasirRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("===SELAMAT DATANG DI DHARR RESTORANT===");
        System.out.println(" ");
        // Daftar menu beserta harga
        String[] menu = {"Nasi Goreng", "Mie Ayam Hot", "Pizza", "Mie Genderuwo", "Es Teh", "Es Jeruk",
                "Kopi Tubruk", "Mango Splash", "Kopi Kapten", "Machta", "Green Tea", "Milk Tea"};
        double[] harga = {15000.0, 10000.0, 50000.0, 18000.0, 5000.0, 5000.0,
                4000.0, 15000.0, 12000.0, 15000.0, 15000.0, 15000.0};
        int[] jumlah = new int[menu.length];

        // Nama-nama kasir 
        String[] namaKasir2 = {"Refan", "Nopal", "Hapis", "Prima"};

        // Pilihan untuk memilih nama kasir 
        System.out.println("Pilih nama kasir (1-4):");
        System.out.println(" ");
        for (int i = 0; i < namaKasir2.length; i++) {
            System.out.println((i + 1) + ". " + namaKasir2[i]);
        }
        System.out.print("Pilih nama kasir: ");
        int pilihanKasir2 = input.nextInt();

        String namaKasirTerpilih2 = "";

        
        // Menampilkan menu kepada pengguna
        System.out.println("Menu Restoran:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " = Rp. " + harga[i]);
        }

        double totalBiaya = 0.0;

        while (true) {
            System.out.print("Pilih menu (1-12) atau 0 untuk selesai: ");
            int pilihan = input.nextInt();

            // Cek jika pengguna ingin keluar
            if (pilihan == 0) {
                break;
            }

            // Memeriksa apakah pilihan valid
            if (pilihan >= 1 && pilihan <= menu.length) {
                int indexMenu = pilihan - 1;
                System.out.print("Jumlah menu: ");
                int jumlahMenu = input.nextInt();
                System.out.println("Anda Memesan: " + jumlahMenu + " " + menu[indexMenu]);
                jumlah[indexMenu] += jumlahMenu;
                totalBiaya += harga[indexMenu] * jumlahMenu;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        // Menampilkan tagihan
        System.out.println("==============================");
        System.out.println("Total biaya: Rp " + totalBiaya);
        System.out.println("==============================");

        // Meminta pembayaran dari pengguna
        System.out.print("Masukkan jumlah uang: Rp ");
        double uangDibayarkan = input.nextDouble();
        input.nextLine(); // Membersihkan newline yang tersisa

        // Menghitung kembalian atau memberi tahu jika uang kurang atau pas
        if (uangDibayarkan == totalBiaya) {
            System.out.println("===== Uang anda pas TERIMAKASIH =====");
        } else if (uangDibayarkan < totalBiaya) {
            System.out.println("===== Maaf, uang anda kurang =====");
            System.out.println(" ");
        } else {
            double kembalian = uangDibayarkan - totalBiaya;
            System.out.println("Kembalian: Rp " + kembalian);
        }
        
        if (pilihanKasir2 >= 1 && pilihanKasir2 <= namaKasir2.length) {
            namaKasirTerpilih2 = namaKasir2[pilihanKasir2 - 1];
            System.out.println("KASIR: " + namaKasirTerpilih2);
        } else {
            System.out.println("Pilihan nama kasir tidak valid.");
        }
        input.close();
    }
}
