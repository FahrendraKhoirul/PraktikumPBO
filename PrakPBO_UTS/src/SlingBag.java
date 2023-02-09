public class SlingBag extends Tas{
    private int jumlahTali;
    private final int B = 3;
    private String jenisTas;
    private double persenDiskon;

    public SlingBag() {
        this.jenisTas = "SlingBag";
    }
    
    @Override
    public String getJenisTas(){
        return jenisTas;
    }
   
    @Override
    public void setJumlahTali(int b){
        jumlahTali = b;
    }
    @Override
    public int getJumlahTali(){
        return jumlahTali;
    }
    
    @Override
    public void setPersenDiskon(){
        persenDiskon = ((50.0/jumlahTali)+B)/100;
    }
    
    @Override
    public double getPersenDiskon(){
        return persenDiskon;
    }
}