abstract class Pembeli {
    String nama;
    String alamat;

    public Pembeli(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    abstract void beliMobil(Mobil mobil, int jumlah);
}