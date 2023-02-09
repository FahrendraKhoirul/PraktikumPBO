
package prabkpbo_m3;

public class Dog {
    
    String name;
    
    public static void main(String[] args) {
        //buat objek dog dari akses
        Dog dog1 = new Dog();        
        dog1.name = "Ciko";
        dog1.bark();
        
        //buat array doh
        Dog[] anjing = new Dog[3];
        anjing[0] = new Dog();
        anjing[1] = new Dog();
        anjing[2] = dog1;
        
        //akses objek dog menggunakan referensi array
        anjing[0].name = "Dalma";
        anjing[1].name = "Doggy";
        
        //coba cetak, angjing terakhir namanya siapa ya?
        System.out.println("nama anjing terakhir");
        System.out.println(anjing[2].name);
        
        //loop array dan semu anjing menggonggong
        int x = 0;
        while(x< anjing.length){
            anjing[x].bark();
            x++;
        }
    }
    
    public void bark(){
        System.out.println( name + " bersuara guk-guk");
    }
    
}
