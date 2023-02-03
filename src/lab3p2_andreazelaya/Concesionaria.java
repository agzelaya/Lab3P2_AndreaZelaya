package lab3p2_andreazelaya;

import java.util.ArrayList;

public class Concesionaria {
    private String nombre;
    private int ID;
    private String direccion;
    private ArrayList<Vehiculo> catalogoVenta = new ArrayList();
    private ArrayList<Clientes> clientes = new ArrayList();
    private double saldo;

    public Concesionaria(String nombre, int ID, String direccion, double saldo) {
        this.nombre = nombre;
        this.ID = ID;
        this.direccion = direccion;
        setSaldo(saldo);
    }

    public Concesionaria() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculo> getCatalogoVenta() {
        return catalogoVenta;
    }

    public void setCatalogoVenta(ArrayList<Vehiculo> catalogoVenta) {
        this.catalogoVenta = catalogoVenta;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
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
        return "Concesionaria{" + "nombre=" + nombre + ", ID=" + ID + ", direccion=" + direccion + ", catalogoVenta=" + catalogoVenta + ", clientes=" + clientes + ", saldo=" + saldo + '}';
    }
    
    
    
}
