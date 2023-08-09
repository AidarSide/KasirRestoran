import java.util.Scanner;

public class KasirATK {

/**
 * @param args
 */
public static void main(String[] args) {
    double bukuTulis , pensil , penghapus , penggaris;
    bukuTulis=2500;
    pensil=1000;
    penghapus=1500;
    penggaris=1000;

    // Scanner input = new Scanner(System.in);
    // System.out.println("Masukkan jumlah beli Buku Tulis: ");
    // double jumlahBuku = input.nextDouble();
    // double total = jumlahBuku*bukuTulis;
    // System.out.println("Masukkan Pembayaran: ");
    // double bayar = input.nextDouble();
    // double diskon = 0.05*total;
    // double kembali = bayar-(total-diskon);
    // System.out.println("Total diskon: "+diskon);
    // System.out.println("Total kembalian: "+kembali);

    // Scanner input = new Scanner(System.in);
    // System.out.println("Masukkan jumlah beli Pensil: ");
    // double jumlahPensil = input.nextDouble();
    // double total = jumlahPensil*pensil;
    // System.out.println("Masukkan Pembayaran: ");
    // double bayar = input.nextDouble();
    // double diskon = 0.05*total;
    // double kembali = bayar-(total-diskon);
    // System.out.println("Total diskon: "+diskon);
    // System.out.println("Total kembalian: "+kembali);

    // Scanner input = new Scanner(System.in);
    // System.out.println("Masukkan jumlah beli Penghapus: ");
    // double jumlahPenghapus = input.nextDouble();
    // double total = jumlahPenghapus*penghapus;
    // System.out.println("Masukkan Pembayaran: ");
    // double bayar = input.nextDouble();
    // double diskon = 0.05*total;
    // double kembali = bayar-(total-diskon);
    // System.out.println("Total diskon: "+diskon);
    // System.out.println("Total kembalian: "+kembali);

    // Scanner input = new Scanner(System.in);
    // System.out.println("Masukkan jumlah beli Penggaris: ");
    // double jumlahPenggaris = input.nextDouble();
    // double total = jumlahPenggaris*penggaris;
    // System.out.println("Masukkan Pembayaran: ");
    // double bayar = input.nextDouble();
    // double diskon = 0.05*total;
    // double kembali = bayar-(total-diskon);
    // System.out.println("Total diskon: "+diskon);
    // System.out.println("Total kembalian: "+kembali);

    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan jumlah beli Buku Tulis: ");
    double jumlahBuku = input.nextDouble();
    double total = jumlahBuku*bukuTulis;
    System.out.println("Masukkan jumlah beli Pensil: ");
    double jumlahpensil = input.nextDouble();
    total += jumlahpensil*pensil;
    System.out.println("Masukkan jumlah beli Penghapus: ");
    double jumlahPenghapus = input.nextDouble();
    total += jumlahPenghapus*penghapus;
    System.out.println("Masukkan jumlah beli Penggaris: ");
    double jumlahPenggaris = input.nextDouble();
    total += jumlahPenggaris*penggaris;
    System.out.println("Masukkan Pembayaran: ");
    double bayar = input.nextDouble();
    double diskon = 0.05*total;
    double kembali = bayar-(total-diskon);
    System.out.println("Total diskon: "+diskon);
    System.out.println("Total kembalian: "+kembali);
    

    
    
}

}