
package prakpbo_m5;

public class Animal {
    //inisialisasi instace variabel 
    String picture;
    String food;
    boolean hunger;
    int boundaries;
    String location;
    
    
    //method dari class animal sebagai superclass
    //dengan akses public tanpa nilai kembalian
    public void makeNoise(){
       System.out.println(picture+" Bersuara");
    }
    
    public void eat(){
        System.out.println(picture+" lagi makan");
    }
    
    public void sleep(){
        System.out.println(picture+" lagi tidur");
    }
    
    public void roam(){
        System.out.println(picture+" lagi berteriak");
    }
}
