
package prakpbo_m2;

public class PrakPBO_M2 {

    public static void main(String[] args) {
        movie satu = new movie();
        satu.tittle = "Avengers";
        satu.genre = "Sci-fi";
        satu.rating = 5;
        satu.playIt();
        
        movie dua = new movie();
        dua.tittle = "Spider-man";
        dua.genre = "Sci-fi";
        dua.rating = 5;
        dua.playIt();
        System.out.println(dua.tittle);
  
    }
    
}
