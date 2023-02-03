package lab3p2_andreazelaya;

import java.awt.Color;


public class Carro extends Vehiculo {
    private int puertas;
    private String descmotor;
    private int maxvel;

    public Carro() {
        super();
    }

    public Carro(int puertas, String descmotor, int maxvel, String color, String marca, String modelo, int year, double precio, int llantas) {
        super(color, marca, modelo, year, precio, llantas);
        setPuertas(puertas);
        this.descmotor = descmotor;
        setMaxvel(maxvel);
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        if(puertas < 0){
            System.out.println("Valor no valido");
        }else{
        this.puertas = puertas;
        }
    }

    public String getDescmotor() {
        return descmotor;
    }

    public void setDescmotor(String descmotor) {
        this.descmotor = descmotor;
    }

    public int getMaxvel() {
        return maxvel;
    }

    public void setMaxvel(int maxvel) {
        if(maxvel < 0){
            System.out.println("Valor no valido");
        }else{
        this.maxvel = maxvel;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Carro{" + "puertas=" + puertas + ", descmotor=" + descmotor + ", maxvel=" + maxvel + '}';
    }
    
    
    
}
