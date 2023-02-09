class ToteBag extends Tas{
    private int jumlahWarna;
    private final int C = 2;
    private String jenisTas;
    private double persenDiskon;

    ToteBag() {
        this.jenisTas = "ToteBag";
    }
    @Override
    public String getJenisTas(){
        return jenisTas;
    }
    
    @Override
    public void setJumlahWarna(int a){
        jumlahWarna = a;
    }
    @Override
    public int getJumlahWarna(){
        return jumlahWarna;
    }
    
    @Override
    public void setPersenDiskon(){
        persenDiskon = ((50.0/jumlahWarna)+C)/100;
    }
    
    @Override
    public double getPersenDiskon(){
        return persenDiskon;
    }
}