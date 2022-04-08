import java.util.ArrayList;
import java.util.Scanner;

import model.KartuATM;

public class ATMArray {
   public static void main(String[] args) {
       ArrayList<KartuATM> daftarKartuATM = new ArrayList<KartuATM>();
       for(int index =0;index<3;index++){
           KartuATM atmku = new KartuATM();

           Scanner inputDetail = new Scanner(System.in);

           System.out.println("Masukkan No ATM : ");
           atmku.nomer =inputDetail.nextLine();

           System.out.println(" masukkan No Rekening : ");
           atmku.norek =inputDetail.nextLine();

           System.out.println(" masukkan Nama : ");
           atmku.nama =inputDetail.nextLine();

           System.out.println(" masukkan Bank : ");
           atmku.nama_bank =inputDetail.nextLine();

           daftarKartuATM.add(atmku);
       }
   } 
}
