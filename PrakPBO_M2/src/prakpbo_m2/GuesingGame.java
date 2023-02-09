
package prakpbo_m2;

public class GuesingGame {
    Player p1;
    Player p2;
    
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        
        int guessp1;
        int guessp2;
        
        boolean p1isright = false;
        boolean p2isright = false;
        
        int targetNumber = (int) (Math.random()*10);
        
        while(true){
            System.out.println("Angka yang harus ditebak adalah " + targetNumber);
            
            p1.guess("Player 1");
            p2.guess("Player 2");
            
            guessp1 = p1.number;
            System.out.println("Pemain pertama menebak angka "+ guessp1);
            guessp2 = p2.number;
            System.out.println("Pemain kedua menebak angka "+ guessp2);
            
            if (guessp1 == targetNumber){
                p1isright = true;
            }
            if (guessp2 == targetNumber){
                p2isright = true;
            }
            
            if (p1isright || p2isright){
                System.out.println("Aasek ada yang benar menebak..");
                System.out.println("Apakah player 1 benar?? " + p1isright);
                System.out.println("Apakah player 2 benar?? " + p2isright);
                System.out.println();
                break;
            } else {
                System.out.println("Ayo dicoba lagi...");
                System.out.println();
            }
        }
    }    
}
