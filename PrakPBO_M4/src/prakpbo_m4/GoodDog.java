
package prakpbo_m4;

public class GoodDog {
    
    private int size;
     public int getSize(){
         return size;
     }
     
     public void setSize(int a){
         size= a;
     }
    
    void bark(){
        if(size > 60){
            System.out.println("Woof! Woof!");
        } else if(size > 14){
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Kaing! Kaing!");
        }
    }
}
