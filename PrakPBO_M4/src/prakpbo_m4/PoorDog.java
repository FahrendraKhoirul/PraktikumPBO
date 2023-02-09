
package prakpbo_m4;

public class PoorDog {
    
    private int size;
    private String name;
    
     public int getSize(){
         return size;
     }
     
     public String getName(){
         return name;
     }
    
     public static void main(String[] a){
         PoorDog one = new PoorDog();
         System.out.println("Ukuran anjing = " + one.getSize);
         System.out.println("Nama anjing = " + one.getName);
     }
}
