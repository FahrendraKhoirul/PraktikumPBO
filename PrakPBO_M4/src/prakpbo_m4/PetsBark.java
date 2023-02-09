package prakpbo_m4;
//Class PetsBark
public class PetsBark {
    // inisialisasi instance Variabel
    private int size; 
    //method getter 
    public int getSize(){
        return size;
    }
    //method setter
    public void setSize(int a){
        size = a;
    }
    //method bark
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
//Class PetsBarkTestDrive
class PetsBarkTestDrive{
    //Method main
    public static void main(String[] a){
        //Inisialisasi array
        PetsBark hewan []= new PetsBark[10];
        
        for(int i=0; i<10; i++){
            //objek baru disetiap index array
            hewan[i] = new PetsBark(); 
             //menentukan size secara random dari setip objek
            hewan[i].setSize((int) (Math.random() * 100));
        }       
        for(int i=0; i<10; i++){
            //cetak masing masing objek
            System.out.print("Ukuran Anjing " + (i+1) +"= " +hewan[i].getSize()
                    +" ,bunyinya ");
            hewan[i].bark();
        }
    }
}