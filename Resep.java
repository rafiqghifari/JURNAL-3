public class Resep {
        String namaResep;
        String bahanUtama;
        int waktuMemasak;
    
        public Resep(String namaResep, String bahanUtama, int waktuMemasak) {
            this.namaResep = namaResep;
            this.bahanUtama = bahanUtama;
            this.waktuMemasak = waktuMemasak;
        }
    
        @Override
        public String toString() {
            return "Nama Resep: " + namaResep + ", Bahan Utama: " + bahanUtama + ", Waktu Memasak: " + waktuMemasak + " menit";
        }
    }

