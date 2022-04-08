import model.KTP2;

public class PendaftaranKTPElektronik {
    public static void main(String[] args) {
        KTP2 warga1 = new KTP2();
        warga1.noKTP="123456";
        warga1.namaLengkap="Kartika";
        warga1.alamatKTP="Warureja";
        warga1.tglLahir="03/08/2001";
        warga1.Pekerjaan="Mahasiswa";

        System.out.println("Nama warga yang ke 1= "+ warga1.namaLengkap);
        warga1.cekPekerjaan(warga1.Pekerjaan);

        KTP2 warga2 = new KTP2();
        warga2.noKTP="abcdefg";
        warga2.namaLengkap="kamingsun";
        warga2.alamatKTP="amerika";
        warga2.Pekerjaan="odong-odong";

        System.out.println("Nama warga yang ke 2= "+ warga2.namaLengkap);
        warga2.cekPekerjaan(warga2.Pekerjaan);

        KTP2 warga3 = new KTP2("123456", "Hasnita", "Brebes", "23/09/2003", "Mahasiswa", "Pacaran");
        System.out.println("Nama warga yang ke 3= "+ warga3.namaLengkap);
        warga3.cekPekerjaan(warga3.Pekerjaan);

        KTP2 warga4 = new KTP2("123456", "Susi", "Brebes", "23/09/2003", "Ibu Rumah Tangga", "Menikah");
        System.out.println("Nama warga yang ke 3= "+ warga4.namaLengkap);
        warga4.cekPekerjaan(warga4.Pekerjaan);

    }
}
