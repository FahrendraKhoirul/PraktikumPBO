
package prakpbo_m5;

public class AnimalTestDrive {
    
    //method main
    public static void main(String[] args) {
        //Membuat objek dari referensi Animal
        Animal Kucing = new Cat();
        Animal KudaNil = new Hippo();
        
        //Menginisialisasi nama (picture)
        //dari objek yang dibuat dengan akses dot
        Kucing.picture = "Kucing";
        KudaNil.picture = "Kuda Nil";
        
        //pemanggilan method method yang ada pada
        //kelas animal beserta subclasses nya
        Kucing.eat();
        Kucing.sleep();
        KudaNil.eat();
        KudaNil.makeNoise();
    }
}
