package lab3p2_andreazelaya;

import java.awt.Color;

public class Bus extends Vehiculo{
    private int pasajeros;
    private String tipo;

    public Bus() {
    }

    public Bus(int p, String color, String marca, String modelo, int year, int precio, int llantas) {
        super(color, marca, modelo, year, precio, llantas);
        setPasajeros(p);
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        if(pasajeros < 0){
            System.out.println("Numero de pasajeros no es valido");
        }else{
            this.pasajeros = pasajeros;
        }
        
        if (pasajeros <= 50){
            tipo = "Rapidito";
        }else{
            tipo = "De Ruta";
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bus{" + "pasajeros=" + pasajeros + ", tipo=" + tipo + '}';
    }
    
    
}
