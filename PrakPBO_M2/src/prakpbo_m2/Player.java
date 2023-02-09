
package prakpbo_m2;

class Player {
    int number = 0;
    
    void guess(String player){
        number = (int) (Math.random() * 10);
        System.out.println(player + " menebak angka " + number);
    }
}
