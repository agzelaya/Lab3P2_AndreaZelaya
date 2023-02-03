package lab3p2_andreazelaya;

import java.awt.Color;


public class Motocicleta extends Vehiculo{
    private int desplazamiento;
    private boolean isElectrica;

    public Motocicleta() {
    }

    public Motocicleta(int desplazamiento, boolean isElectrica, String color, String marca, String modelo, int year, double precio, int llantas) {
        super(color, marca, modelo, year, precio, llantas);
        setDesplazamiento(desplazamiento);
        setIsElectrica(isElectrica);
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
            salida = "Si es electrica";
        }else{
            salida = "No es electrica";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Motocicleta{" + "desplazamiento=" + desplazamiento + salida;
    }
    
    
}
