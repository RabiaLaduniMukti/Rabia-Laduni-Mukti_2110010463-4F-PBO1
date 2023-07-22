package PBO;

//inheritance
public class DealerDetail extends DealerMotor {
    
    //Overriding
    public DealerDetail (String namapembeli, String kode, String merkmotor){
        super(namapembeli, kode, merkmotor);
        
    }
    
public String getKodeMotor(){
    String kodeMotor;
        kodeMotor = getKodePembelian().substring(0, 1);
    //Seleksi IF
    if(kodeMotor.equals("1")){
        return "LN2";
    } else if (kodeMotor.equals("2")){
        return "LH2";
    } else if (kodeMotor.equals("3")){
        return "LYX";
    } else if (kodeMotor.equals("4")){
        return "MCO";            
    }else{
        return "Kode Yang Di Pilih Tidak Ada...!";
            
    }    
}

public String getNamaMotor(){
    String NamaMotor = getKodePembelian().substring(1, 3);
    //Seleksi Switch
    switch(NamaMotor){
        case "01":
             return "Scoopy";
        case "02":
             return "Beat";
        case "03":
             return "Genio";
        case "04":
             return "Vario";    
        default:
             return "Nama Motor Yang Di Pilih Tidak Tersedia...!";
    }
}
public String getMerkMotor(){
    String kodeMerk = getKodePembelian().substring (3, 6);
    switch (kodeMerk){
        case "001":
            return "Honda";
        case "002":
            return "Yamaha";
        case "003":
            return "Suzuki";
        case "004":
            return "Kawasaki";    
        default:
            return "Merk Motor Yang Di Pilih Tidak Tersedia...!";
    } 
    
}
    //Membuat Polymorphism (Overriding)
public String infoDealerMotor(){
    return super.infoDealerMotor()+
        "\n Kode Motor: "+getKodeMotor()+
        "\n Nama Motor: "+getNamaMotor()+
        "\n Merk Motor: "+getMerkMotor();
}
}
