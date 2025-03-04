import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Resep di Awal");
            System.out.println("2. Tambah Resep di Akhir");
            System.out.println("3. Hapus Resep dari Awal");
            System.out.println("4. Hapus Resep dari Akhir");
            System.out.println("5. Cetak Semua Resep");
            System.out.println("6. Cari Resep Berdasarkan Nama");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Resep: ");
                    String namaResepAwal = scanner.nextLine();
                    System.out.print("Masukkan Bahan Utama: ");
                    String bahanUtamaAwal = scanner.nextLine();
                    System.out.print("Masukkan Waktu Memasak (menit): ");
                    int waktuMemasakAwal = scanner.nextInt();
                    list.tambahResepAwal(new Resep(namaResepAwal, bahanUtamaAwal, waktuMemasakAwal));
                    break;
                case 2:
                    System.out.print("Masukkan Nama Resep: ");
                    String namaResepAkhir = scanner.nextLine();
                    System.out.print("Masukkan Bahan Utama: ");
                    String bahanUtamaAkhir = scanner.nextLine();
                    System.out.print("Masukkan Waktu Memasak (menit): ");
                    int waktuMemasakAkhir = scanner.nextInt();
                    list.tambahResepAkhir(new Resep(namaResepAkhir, bahanUtamaAkhir, waktuMemasakAkhir));
                    break;
                case 3:
                    list.hapusResepAwal();
                    System.out.println("Resep di awal daftar telah dihapus.");
                    break;
                case 4:
                    list.hapusResepAkhir();
                    System.out.println("Resep di akhir daftar telah dihapus.");
                    break;
                case 5:
                    list.cetakResep();
                    break;
                case 6:
                    System.out.print("Masukkan Nama Resep: ");
                    String namaResepCari = scanner.nextLine();
                    Resep resepDitemukan = list.cariResep(namaResepCari);
                    if (resepDitemukan != null) {
                        System.out.println(resepDitemukan);
                    } else {
                        System.out.println("Resep tidak ditemukan.");
                    }
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 7);

        scanner.close();
    }
}