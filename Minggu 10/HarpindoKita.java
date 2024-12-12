import java.util.ArrayList;
import java.util.List;


class Karyawan {
    String nama;
    List<Pembeli> pembeliList = new ArrayList<>();

    public Karyawan(String nama) {
        this.nama = nama;
    }

    public void tambahPembeli(Pembeli pembeli) {
        pembeliList.add(pembeli);
    }

    public void lihatDataPembeli() {
        for (Pembeli pembeli : pembeliList) {
            System.out.println("Nama: " + pembeli.nama + ", Alamat: " + pembeli.alamat);
        }
    }

    public double hitungKeuntungan(double totalHarga) {
        return totalHarga * 0.1;
    }
}

public class HarpindoKita {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan("Joko");

        PembeliIndividu pembeliIndividu = new PembeliIndividu("Jawir", "Kebumen");
        PembeliBorongan pembeliBorongan = new PembeliBorongan("PT. 3 Roda", "Jakarta");

        MobilSedan sedan = new MobilSedan(300000);
        MobilMinibus minibus = new MobilMinibus(500000);
        MobilBus bus = new MobilBus(80000);

        pembeliIndividu.beliMobil(sedan, 1);
        pembeliBorongan.beliMobil(bus, 7);

        karyawan.tambahPembeli(pembeliIndividu);
        karyawan.tambahPembeli(pembeliBorongan);

        karyawan.lihatDataPembeli();

        double totalHarga = sedan.getHarga() + (bus.getHarga() * 7);
        double keuntungan = karyawan.hitungKeuntungan(totalHarga);
        System.out.println("Keuntungan karyawan: " + keuntungan);
    }
}
