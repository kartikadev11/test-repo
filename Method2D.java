public class Method2D {
    private static void HitungJumlah (){
        int angka3;
        int angka4;
        angka3 = 6;
        angka4 = 10;
        int jumlahHitung = 0;
        jumlahHitung = angka3+angka4;
        System.out.println("jumlah = " +jumlahHitung);
    }

    private static void HitungJumlahTambah (int a, int b){
        int jumlahTambah = a + b;
        System.out.println("Jumlah Tambah = " +jumlahTambah);

    }
    private static int HitungPerkalian(int a,int b){
        int HasilKali = a*b;
        return HasilKali;
    }
    public static void main(String[] args) {
        int angka1;
        int angka2;
        angka1 = 4;
        angka2 = 6;
        int jumlah = 0;
        jumlah = angka1+angka2;
        System.out.println("jumlah = " +jumlah);

        HitungJumlah();
        HitungJumlahTambah(10,17);
        HitungJumlahTambah(angka1, angka2);

        int TerimaHasilDariHitungPerkalian = HitungPerkalian(10, 2);
        System.out.println("Hasil Perkalian = "+TerimaHasilDariHitungPerkalian);
    }
}
