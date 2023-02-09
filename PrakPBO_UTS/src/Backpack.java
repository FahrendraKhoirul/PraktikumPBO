public class Backpack extends Tas{
    private int jumlahKantong;
    private final int A = 5;
    private String jenisTas;
    private double persenDiskon;

    public Backpack() {
        this.jenisTas = "Backpack";
    }
    
    @Override
    public String getJenisTas(){
        return jenisTas;
    }
    
    public void setJumlahKantong(int a){
        jumlahKantong = a;
    }
    public int getJumlahKantong(){
        return jumlahKantong;
    }
    
    @Override
    public void setPersenDiskon(){
        persenDiskon = ((50.0/jumlahKantong)+A)/100;
    }
    @Override
    public double getPersenDiskon(){
        return persenDiskon;
    }
}

