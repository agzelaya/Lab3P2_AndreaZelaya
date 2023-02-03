package lab3p2_andreazelaya;

import java.awt.Color;


public class Motocicleta extends Vehiculo{
    private int desplazamiento;
    private boolean isElectrica;

    public Motocicleta() {
    }

    public Motocicleta(int desplazamiento, boolean isElectrica, String color, String marca, String modelo, int year, int precio, int llantas) {
        super(color, marca, modelo, year, precio, llantas);
        setDesplazamiento(desplazamiento);
        this.isElectrica = isElectrica;
    }

    public int getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(int desplazamiento) {
        if(desplazamiento < 0){
            System.out.println("Valor no valido");
        }else{
        this.desplazamiento = desplazamiento;
        }
    }

    public boolean isIsElectrica() {
        return isElectrica;
    }
    
    String salida;
    public void setIsElectrica(boolean isElectrica) {
        this.isElectrica = isElectrica;
        if(isElectrica==true){
            salida = "Si tiene excavadora";
        }else{
            salida = "No tiene excavadora";
        }
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "desplazamiento=" + desplazamiento + ", isElectrica=" + isElectrica + '}' + salida;
    }
    
    
}
