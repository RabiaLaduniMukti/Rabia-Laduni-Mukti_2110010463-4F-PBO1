# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data dealer menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama pembeli, kode dan merk motor, dan memberikan output berupa informasi detail dari nama pembeli tersebut seperti nama konsumen, kode pembelian, dan tipe motor.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `DealerMotor`, `DealerDetail`, dan `DealerMotorBeraksi` adalah contoh dari class.

```bash
public class DealerMotor {
    String namapembeli ;
    String kode;
    String merkmotor;
}

public class DealerDetail extends DealerMotor {
    public DealerDetail (String namapembeli, String kode, String merkmotor){
        super(namapembeli, kode, merkmotor);
}

public class DealerMotorBeraksi {

public static void main(String[] args) {
}


2. **Object** adalah instance dari class. Pada kode ini, 'konsumen[i] = new DealerDetail(namapembeli ,kode, Dealer);' adalah contoh pembuatan object.

```bash
konsumen[i] = new DealerDetail(namapembeli ,kode, Dealer);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namapembeli`, 'kode' dan `merkmotor` adalah contoh atribut.

```bash
namapembeli ;
kode;
merkmotor;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `DealerMotor` dan `DetailDetail`.

```bash
public DealerMotor(String namapembeli, String kode, String merkmotor ) {
        this.namapembeli = namapembeli;
        this.kode = kode;
        this.merkmotor = merkmotor;
}

public DealerDetail (String namapembeli, String kode, String merkmotor){
        super(namapembeli, kode, merkmotor);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaPembeli`, 'setKode' dan `setMerkMotor` adalah contoh method mutator.

```bash
public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public void setMerkmotor(String merkmotor) {
        this.merkmotor = merkmotor;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPembeli`, `getKode`, `getMerkMotor`adalah contoh method accessor.

```bash
public String getNamapembeli(){
        return namapembeli;
    }
    public String getKodePembelian() {
        return kode;
    }
    public String getMerkmotor() {
        return merkmotor;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namapembeli`, 'kode' dan `merkmotor` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namapembeli ;
private String kode;
private String merkmotor;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `DealerDetail` mewarisi `DealerMotor` dengan sintaks `extends`.

```bash
public class DealerDetail extends DealerMotor {
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `infoDealerMotor(String Dealer)` di `DealerMotor` merupakan overloading method `infoDealerMotor` dan `infoDealerMotor` di `DealerDetail` merupakan override dari method `infoDealerMotor` di `DealerMotor`.

```bash
public String infoDealerMotor(String Dealer){
        return infoDealerMotor ()+ "\nDealerr: "+Dealer;
}

@Override
public String infoDealerMotor(){
    return super.infoDealerMotor()+
        "\n Kode Motor: "+getKodeMotor()+
        "\n Nama Motor: "+getNamaMotor()+
        "\n Merk Motor: "+getMerkMotor();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKodeMotor` dan seleksi `switch` dalam method `getKodePembelian`.

```bash
public String getKodeMotor(){
    String kodeMotor;
        kodeMotor = getKodePembelian().substring(0, 1);
    if(kodeMotor.equals("1")){
        return "LN2";
    }else{
        return "Kode Yang Di Pilih Tidak Ada...!";

    //return getKodeMotor().substring(0, 1).equals("1") ? "LN2" : "Kode Yang Di Pilih Tidak Ada...!";
}

String NamaMotor = getKodePembelian().substring(1, 3);
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<konsumen.length; i++){

```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner (System.in);
System.out.print("1. Masukkan Nama Konsumen : ");
String namapembeli = scanner.nextLine();
System.out.print("2. Masukkan Kode Pembelian : ");
String kode = scanner.nextLine();
System.out.print("3.Masukkan Tipe Motor: ");
String Dealer = scanner.nextLine();

System.out.println("--------------------");
System.out.println("DATA KONSUMEN DEALER");
System.out.println(data.infoDealerMotor());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
DealerDetail[] konsumen = new DealerDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    } catch (NumberFormatException e){
         System.out.println("Terjadi Kesalahan Format Kode:    "+e.getMessage());
} catch (StringIndexOutOfBoundsException e){
         System.out.println("Terjadi Kesalahan Format Pesanan: "+e.getMessage());
} catch (Exception e){
         System.out.println("Terjadi Kesalahan Umum:           "+e.getMessage());
}

```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Rabia Laduni Mukti
NPM: 2110010463
 
