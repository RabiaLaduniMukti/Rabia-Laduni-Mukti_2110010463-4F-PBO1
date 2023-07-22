package PBO;

    //Membuat Class
public class DealerMotor {
    //Atribut & Encapsulation
    private String namapembeli ;
    private String kode;
    private String merkmotor;
   
    
    
    //Membuat Constructor
    public DealerMotor(String namapembeli, String kode, String merkmotor ) {
        this.namapembeli = namapembeli;
        this.kode = kode;
        this.merkmotor = merkmotor;
             
    }
    
    //Membuat Method Mutator (Setter)

    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public void setMerkmotor(String merkmotor) {
        this.merkmotor = merkmotor;
    }

  
    //Membuat Method Accsesor (Getter)
    public String getNamapembeli(){
        return namapembeli;
    }

    public String getKodePembelian() {
        return kode;
    }

    public String getMerkmotor() {
        return merkmotor;
    }
    


    public String infoDealerMotor() {
        return "Nama Pembeli: "+getNamapembeli()+
                "\nKode Pembelian: "+getKodePembelian()+
                "\nMerk Motor: "+getMerkmotor();
    }
    
    //Membuat Polymorphism (Overloading)
    public String infoDealerMotor(String Dealer){
        return infoDealerMotor ()+ "\nDealerr: "+Dealer;
    }
    
}
