abstract class Mobil {
    String tipe;
    double harga;

    public Mobil(String tipe, double harga) {
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getTipe() {
        return tipe;
    }

    public double getHarga() {
        return harga;
    }
}