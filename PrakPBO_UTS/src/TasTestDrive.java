
import java.util.Scanner;

public class TasTestDrive {
    public static void main(String [] a){
        Scanner b = new Scanner(System.in);
        Tas tas [] = new Tas[3];
        
        tas[0] = new Backpack();
        tas[1] = new SlingBag();
        tas[2] = new ToteBag();
        
        
        
        for (int i=0; i<tas.length; i++){
            String jns = tas[i].getJenisTas();
            System.out.println("Tentukan Spesifikasi "+jns);
            
            System.out.print("Bahan Tas : ");
            String bhn = b.next();
            tas[i].setBahan(bhn);
            
            System.out.print("Warna Dasar : ");
            String wrn = b.next();
            tas[i].setWarnaDasar(wrn);
            
            
            switch (i) {
                case 0:{
                        System.out.print("Jumlah Kantong : ");
                        int knt = b.nextInt();
                        tas[i].setJumlahKantong(knt);
                        break;
                    }
                case 1:{
                        System.out.print("Jumlah Tali : ");
                        int knt = b.nextInt();
                        tas[i].setJumlahTali(knt);
                        break;
                    }
                case 2:{
                        System.out.print("Jumlah Warna : ");
                        int knt = b.nextInt();
                        tas[i].setJumlahWarna(knt);
                        break;
                    }
                default:
                    break;
            }
            System.out.print("Harga Jual : ");
            double hrg = b.nextDouble();
            tas[i].setHargaJual(hrg);
            
            System.out.println("----");     
        }
        
        for(int i=0; i<tas.length; i++){
            tas[i].setPersenDiskon();
            tas[i].cetakInfo();
        }
        
    }
}
