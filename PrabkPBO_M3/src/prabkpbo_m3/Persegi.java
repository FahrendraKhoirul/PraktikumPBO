
package prabkpbo_m3;

public class Persegi {
    int sisi;
    
    int luas(){
        return (sisi*sisi);
    }
}

class persegiTestDrive{
    public static void main (String [] a){
        //Menyatakan
        Persegi[] kotak = new Persegi[3];
        
        //Inisialisasi
        kotak[0] = new Persegi();
        kotak[1] = new Persegi();
        kotak[2] = new Persegi();
        
        //mengisi array
        kotak[0].sisi = 5;
        kotak[1].sisi = 17;
        kotak[2].sisi = 32;
        
        int x=0;
        while(x < kotak.length){
            System.out.print("Sisi = " + kotak[x].sisi);
            System.out.println(" cm, Luasnya " + kotak[x].luas() +" cm2");            
            x++;
        }        
    }
}