
package OwnOOP;

public class Senjata {
    int berat;
    int jumlahPeluru;
    
    String nama;
    
    void tembak(){
        jumlahPeluru -= 1; 
        System.out.println("Dor...");
        
    }
    void reload(){
        jumlahPeluru += 5;
        System.out.println("Berhasil Reload");
        
    }
    
    void check(){
        System.out.println("Nama Senjata = " + nama);
        System.out.println("berat = " + berat + " kg");
        System.out.println("Jumlah peluru saat ini = " + jumlahPeluru );
        System.out.println();
    }
}
