package model;

public class KTP2 {
    public String noKTP;
    public String namaLengkap;
    public String alamatKTP;
    public String tglLahir;
    public String Pekerjaan;
    public String Status;

    public KTP2(){ //constructor tanpa parameter
    }


    public KTP2(String no, String nama, String alamat, String tgl, String pkj, String st){  // constructor dengan parameter
        this.noKTP = no;
        this.namaLengkap = nama;
        this.alamatKTP = alamat;
        this.tglLahir = tgl;
        this.Pekerjaan = pkj;
        this.Status = st;
    }

    public void cekPekerjaan(String pkj1){
        switch (Pekerjaan){
            case "Mahasiswa":
            System.out.println("Sekolah dulu baru pacaran");
            break;
            case "odong-odong":
            System.out.println("cari duit dulu yang banyak");
            break;
            case"Ibu Rumah Tangga":
            System.out.println("Masakannya Enak");
            break;
        }

    }


}
