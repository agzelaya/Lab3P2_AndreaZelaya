package lab3p2_andreazelaya;


public class Bicicleta extends Vehiculo {
    private String desc;
    private int radioRueda;
    private String tipo;

    public Bicicleta() {
        super();
    }

    public Bicicleta(String desc, int radioRueda, String color, String marca, String modelo, int year, int precio, int llantas, String tipo) {
        super(color, marca, modelo, year, precio, llantas);
        this.desc = desc;
        this.radioRueda = radioRueda;
        setTipo(tipo);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRadioRueda() {
        return radioRueda;
    }

    public void setRadioRueda(int radioRueda) {
        if(radioRueda <= 0){
            System.out.println("Valor no valido");
        }else{
        this.radioRueda = radioRueda;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.equals("BMX")||tipo.equals("de Calle")){
        this.tipo = tipo;
        }else{
            System.out.println("Tipo no valido");
        }
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "desc=" + desc + ", radioRueda=" + radioRueda + ", tipo=" + tipo + '}';
    }
    
    
    
}
