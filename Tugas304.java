import java.util.Scanner;

public class Tugas304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalBarangSemuaToko = 0;
            int barangTerbanyak = -1;
            int tokoTerbaik = 0;
            for (int i = 1; i <= jumlahToko; i++) {
                int jumlahPelanggan;
                int totalBarangToko = 0;

                System.out.print("Jumlah pelanggan toko " + i + ": ");
                jumlahPelanggan = sc.nextInt();

                while (jumlahPelanggan < 0) {
                    System.out.println(
                        "Jumlah pelanggan tidak boleh negatif."
                    );
                    System.out.print("Jumlah pelanggan toko " + i + ": ");
                    jumlahPelanggan = sc.nextInt();
                }
                for (int j = 1; j <= jumlahPelanggan; j++) {
                    int jumlahBarang;
                    do {
                        System.out.print(
                            "Jumlah barang pelanggan " + j
                            + " di toko " + i + ": "
                        );
                        jumlahBarang = sc.nextInt();

                        if (jumlahBarang < 0) {
                            System.out.println(
                                "Jumlah barang tidak boleh negatif."
                            );
                        }
                    } while (jumlahBarang < 0);
                    totalBarangToko += jumlahBarang;
                }
                totalBarangSemuaToko += totalBarangToko;
                System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan+ ", total barang: " + totalBarangToko);

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbaik = i;
                }
            }
            System.out.println("Total barang seluruh toko: "+ totalBarangSemuaToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        }
        sc.close();
    }
}