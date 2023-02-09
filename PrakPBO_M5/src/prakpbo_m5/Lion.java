package prakpbo_m5;

//class lion sebagai subclass dari superclass Feline
public class Lion extends Feline {
    //method overriding tanpa nilai kembalian
    @Override
    public void makeNoise(){
        System.out.println(picture+" grusak grusuk");
    }
    @Override
    public void eat(){
        System.out.println(picture+" makan zebra");
    }
}
//class cat sebagai subclass dari superclass Feline
class Cat extends Feline {
    //method overriding tanpa nilai kembalian
    @Override
    public void makeNoise(){
        System.out.println(picture+" grusak grusuk");
    }
    @Override
    public void eat(){
        System.out.println(picture+" makan ikan");
    }
}
//class tiger sebagai subclass dari superclass Feline
class Tiger extends Feline {
    //method overriding tanpa nilai kembalian
    @Override
    public void makeNoise(){
        System.out.println(picture+" grusak grusuk");
    }
    @Override
    public void eat(){
        System.out.println(picture+" makan daging segar");
    }
}
//class hippo sebagai subclass dari superclass Animal
class Hippo extends Animal {
    //method overriding tanpa nilai kembalian
    @Override
    public void makeNoise(){
        System.out.println(picture+" grusak grusuk");
    }
    @Override
    public void eat(){
        System.out.println(picture+" makan rumput");
    }
}
//class Dog sebagai subclass dari superclass Canine
class Dog extends Canine {
    //method overriding tanpa nilai kembalian
    @Override
    public void makeNoise(){
        System.out.println(picture+" grusak grusuk");
    }
    @Override
    public void eat(){
        System.out.println(picture+" makan Daging");
    }
}
//class wolf sebagai subclass dari superclass Canine
class Wolf extends Canine {
    //method overriding tanpa nilai kembalian
    @Override
    public void makeNoise(){
        System.out.println(picture+" grusak grusuk");
    }
    @Override
    public void eat(){
        System.out.println(picture+" makan hewan");
    }
}
