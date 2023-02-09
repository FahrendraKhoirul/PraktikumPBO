
package OwnOOP;

public class testDriveSenjata {
    public static void main(String[]a){
        Senjata shotgun = new Senjata();
        shotgun.berat = 5;
        shotgun.jumlahPeluru =10;
        shotgun.nama = "Shotgun";
        shotgun.check();
        shotgun.tembak();
        shotgun.check();
        shotgun.reload();
        shotgun.check();
        
    }
}
