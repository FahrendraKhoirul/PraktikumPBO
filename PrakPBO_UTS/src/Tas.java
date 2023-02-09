
public class Tas {
   
    private String jenisTas;
    private String warnaDasar;
    private String bahan;
    private double hargaJual;
    private double persenDiskon;
    
    public void setJenisTas(String a){
        jenisTas = a;
    }
    public String getJenisTas(){
        return jenisTas;
    }
    
    public void setWarnaDasar(String a){
        warnaDasar = a;
    }
    public String getWarnaDasar(){
        return warnaDasar;
    }
    
    public void setBahan(String a){
        bahan = a;
    }
    public String getBahan(){
        return bahan;
    }
    
    public void setHargaJual(double a){
        hargaJual = a;
    }
    public double getHargaJual(){
        return hargaJual;
    }
    
    public void setPersenDiskon(){
    }
    public double getPersenDiskon(){
        return persenDiskon;
    }
    
    public void setJumlahKantong(int a){
    }
    public int getJumlahKantong(){
        return 0;
    }
    public void setJumlahTali(int a){
    }
    public int getJumlahTali(){
        return 0;
    }
    public void setJumlahWarna(int a){
    }
    public int getJumlahWarna(){
        return 0;
    }
   
    public void cetakInfo(){
        System.out.println("==================\n       TAS\n==================");
        System.out.println("Jenis Tas   : " + getJenisTas());
        System.out.println("Warna Dasar : " + getWarnaDasar());
        System.out.println("Bahan       : " + getBahan());
        System.out.println("Harga Jual    : Rp" + getHargaJual());
        System.out.println("Persen Diskon : " + getPersenDiskon());
        System.out.println("Potongan      : Rp" + potonganDiskon());
        System.out.println("Total         : Rp" + hargaSetelahDiskon());
        System.out.println();
    }

    public double potonganDiskon() {
        return getPersenDiskon()*hargaJual;
    }
    
    public double hargaSetelahDiskon() {
        return hargaJual - potonganDiskon();
    }   

}
