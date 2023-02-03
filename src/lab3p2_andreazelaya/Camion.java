package lab3p2_andreazelaya;

import java.awt.Color;


public class Camion extends Vehiculo {
    private int volumen;
    private int altura;
    private boolean retroex;
    
    public Camion() {
        super();
    }

    public Camion(int volumen, int altura, boolean r, String color, String marca, String modelo, int year, double precio, int llantas) {
        super(color, marca, modelo, year, precio, llantas);
        setVolumen(volumen);
        this.altura = altura;
        setRetroex(r);
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if(volumen < 0){
            System.out.println("Valor no valido");
        }else{
        this.volumen = volumen;
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura < 0){
            System.out.println("Valor no valido");
        }else{
        this.altura = altura;
        }
    }

    public boolean isRetroex() {
        return retroex;
    }
    
    String exc;
    public void setRetroex(boolean retroex) {
        this.retroex = retroex;
        if(retroex==true){
            exc = "Si tiene excavadora";
        }else{
            exc = "No tiene excavadora";
        }
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "Camion:" + "volumen=" + volumen + ", altura=" + altura + exc;
    }

    
    
    
}
