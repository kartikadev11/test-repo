package model;

public class KTP {
    public String nama;
    public String tempatlahir;
    public String tanggalLahir;
    public String alamat;
    public String agama;
    public String StatusPerkawinan;
    public String pekerjaan;

    public KTP (String mNama, String mTempatlahir, String mTanggalLahir  , String mAlamat, 
                String mAgama, String mstatusPerkawinan, String mPekerjaan ){
        this.nama               = mNama;
        this.tempatlahir        = mTempatlahir;
        this.tanggalLahir       = mTanggalLahir;    
        this.alamat             = mAlamat;
        this.agama              = mAgama;
        this.StatusPerkawinan   = mstatusPerkawinan;
        this.pekerjaan          = mPekerjaan;
    }
    public void cekstatus(String myStatus){
        switch (myStatus){
            case "married":
            System.out.println("Bener married?");
            break;
            case "single":
            System.out.println("marriednya kapan???");
        }
    }
    
}
