package PBO;

import java.util.Scanner;

public class DealerMotorBeraksi {
    public static void main(String[] args) {
        //Membuat Objek
        //Dealer Motor = new Dealer ("Rabia Laduni Mukti", "102003", "Honda");
     //System.out.println(toko.infoTokoSanken());
        //System.out.println(toko.infoTokoSanken("Delima Motor"));

    
       // Error Handling
         try{
       // IO Sederhana
         Scanner scanner = new Scanner (System.in);        
       //Array
         DealerDetail[] konsumen = new DealerDetail[2];
         
       //Perulangan
         for(int i=0; i<konsumen.length; i++){
             System.out.print("1. Masukkan Nama Konsumen : ");
             String namapembeli = scanner.nextLine();
             System.out.print("2. Masukkan Kode Pembelian : ");
             String kode = scanner.nextLine();
             System.out.print("3.Masukkan Tipe Motor: ");
             String Dealer = scanner.nextLine();
             
             
             //Objek
         konsumen[i] = new DealerDetail(namapembeli ,kode, Dealer);
}   
        //Perulangan
        for(DealerDetail data: konsumen ){
            System.out.println("--------------------");
            System.out.println("DATA KONSUMEN DEALER");
            System.out.println(data.infoDealerMotor());
}

} catch (NumberFormatException e){
         System.out.println("Terjadi Kesalahan Format Kode:    "+e.getMessage());
} catch (StringIndexOutOfBoundsException e){
         System.out.println("Terjadi Kesalahan Format Pesanan: "+e.getMessage());
} catch (Exception e){
         System.out.println("Terjadi Kesalahan Umum:           "+e.getMessage());
}

}
}