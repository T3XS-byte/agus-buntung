class PembeliIndividu extends Pembeli {
    public PembeliIndividu(String nama, String alamat) {
        super(nama, alamat);
    }

    @Override
    void beliMobil(Mobil mobil, int jumlah) {
        System.out.println(nama + " membeli " + jumlah + " " + mobil.getTipe() + " dengan harga total: " + mobil.getHarga() * jumlah);
    }
}
