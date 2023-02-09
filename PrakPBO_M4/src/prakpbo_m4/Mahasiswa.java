package prakpbo_m4;
//Class Mahasiswa
public class Mahasiswa {
    // inisialisasi instance Variabel
    private String jurusan; 
    private String nama; 
    //method getter 
    public String getJurusan(){
        return jurusan;
    }
    public String getNama(){
        return nama;
    }
    //method setter
    public void setJurusan(String a){
        jurusan = a;
    }
    public void setNama(String a){
        nama = a;
    }
    //method cetak
    void Cetak(){
        System.out.println("Nama = " + nama + 
                " , Jurusan = " + jurusan);
    }
}
//Class MahasiswaTestDrive
class MahasiswaTestDrive{
    //Method main
    public static void main(String[] a){
        //Inisialisasi
        Mahasiswa satu= new Mahasiswa();
        Mahasiswa dua= new Mahasiswa();
        Mahasiswa tiga= new Mahasiswa();

        //set nama dan jurusan
        satu.setNama("Fahrendra Khoirul Ihtada");
        satu.setJurusan("Teknik Informatika");
        dua.setNama("Ghufron Ghozi Ramadhan");
        dua.setJurusan("Teknik Informatika");
        tiga.setNama("Fazlur Rahman Zulqarnain");
        tiga.setJurusan("Teknik Instrumentasi");
        
        //cetak
        satu.Cetak();
        dua.Cetak();
        tiga.Cetak();
    }
}