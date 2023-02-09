
package prakpbo_m4;
public class GoodDogTestDrive {   
    public static void main(String[] a){
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog pertama! " + one.getSize());
        System.out.println("Dog kedua! " + two.getSize());
        one.bark();
        two.bark();
        
    }
}
