
package prakpbo_m5;

//class Feline sebagai subclass dari superclass Animal
public class Feline extends Animal{
    //method overriding tanpa nilai kembalian
    @Override
    public void roam(){
        System.out.println(picture+" lagi bergaung");
    }
}
//class Canine sebagai subclass dari superclass Animal
class Canine extends Animal{
    //method overriding tanpa nilai kembalian
    @Override
    public void roam(){
        System.out.println(picture+" lagi menggongong");
    }
}