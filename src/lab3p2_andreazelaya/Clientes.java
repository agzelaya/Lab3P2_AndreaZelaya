package lab3p2_andreazelaya;

import java.util.ArrayList;


public class Clientes {
    private int ID;
    private String nombre;
    private ArrayList<Vehiculo> vehiculos= new ArrayList();
    private double saldo;

    public Clientes() {
    }

    public Clientes(int ID, String nombre, double saldo) {
        this.ID = ID;
        this.nombre = nombre;
        setSaldo(saldo);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo < 0){
            System.out.println("Valor no valido");
        }else{
        this.saldo = saldo;
        }
    }

    @Override
    public String toString() {
        return "Clientes{" + "ID=" + ID + ", nombre=" + nombre + ", vehiculos=" + vehiculos + ", saldo=" + saldo + '}' + "\n";
    }
    
    
}
