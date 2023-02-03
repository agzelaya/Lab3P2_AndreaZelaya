package lab3p2_andreazelaya;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_AndreaZelaya {

    static Scanner in = new Scanner(System.in);
    static ArrayList<Concesionaria> concesionarias = new ArrayList();
    static ArrayList<Clientes> clientes = new ArrayList();
    static ArrayList<Vehiculo> vehiculos = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Alcaldía Municipal del Distrito Central (AMDC)\n");
        int main;
        do {
            System.out.println("MENU PRINCIPAL\n"
                    + "1. CRUD Concesionaria\n"
                    + "2. CRUD Clientes\n"
                    + "3. CRUD Vehiculos\n"
                    + "4. Compra/Venta de vehículos por parte de un cliente\n"
                    + "5. Salida\n"
                    + "Ingrese la opción que desea usar:");
            main = in.nextInt();

            switch (main) {
                case 1: {
                    CRUDConc();
                    break;
                }

                case 2: {
                    CRUDClientes();
                    break;
                }

                case 3: {
                    CRUDVehiculos();

                    break;
                }

                case 4: {
                    System.out.println(printVehiculos());
                    break;
                }

                default: {
                    System.out.println("Opcion ingresada no existe");
                }
            }

        } while (main != 5);

    }

    public static void CRUDConc() {
        int opc;
        System.out.println("\nMENU CONCESIONARIAS\n"
                + "1. Crear Concesionaria\n"
                + "2. Modificar dirección de la concesionaria\n"
                + "3. Eliminar concesionaria\n"
                + "4. Salir\n"
                + "Ingrese la opcion a usar: ");
        opc = in.nextInt();

        switch (opc) {
            case 1: {
                System.out.println("Ingrese el nombre de la concesionaria:\n");
                in.nextLine();
                String name = in.nextLine();

                System.out.println("Ingrese la direccion de la concesionaria:\n");
                String direc = in.nextLine();

                System.out.println("Ingrese el saldo de la concesionaria:\n");
                double saldo = in.nextDouble();

                int id = 0;
                int x = 0;
                if (concesionarias.size() == 0) {
                    id = concesionarias.size();
                } else {
                    for (int i = 0; i < concesionarias.size() - 1; i++) {
                        x = concesionarias.get(i + 1).getID();
                        if (concesionarias.get(i).getID() > x) {
                            x = concesionarias.get(i).getID();
                        }
                    }
                    id = x + 1;
                }

                Concesionaria conc = new Concesionaria(name, id, direc, saldo);
                concesionarias.add(conc);
                break;
            }

            case 2: {
                System.out.println(printConc());
                System.out.println("Ingrese el indice de la concesionaria para modificar su direccion");
                int ind = in.nextInt();

                if (ind >= 0 && ind < concesionarias.size()) {
                    System.out.println("Ingrese la nueva direccion de la concesionaria: ");
                    in.nextLine();
                    String direc = in.nextLine();
                    concesionarias.get(ind).setDireccion(direc);
                } else {
                    System.out.println("Indice ingresado no es valido");
                }
                break;
            }

            case 3: {
                System.out.println(printConc());
                System.out.println("Ingrese el indice de la concesionaria a eliminar");
                int ind = in.nextInt();

                if (ind >= 0 && ind < concesionarias.size()) {
                    concesionarias.remove(ind);
                    System.out.println("Concesionaria eliminada exitosamente");
                } else {
                    System.out.println("Indice ingresado no es valido");
                }
                break;
            }

            case 4: {
                break;
            }

            default: {
                System.out.println("Opcion ingresada no es válida");
            }
        }

    }

    public static String printConc() {
        String salida = "";
        for (Concesionaria c : concesionarias) {
            salida += concesionarias.indexOf(c) + " -> " + c + "\n";
        }

        return salida;
    }

    public static void CRUDClientes() {

        System.out.println("\nMENU CLIENTES\n"
                + "1. Crear Cliente\n"
                + "2. Eliminar cliente\n"
                + "3. Listar clientes\n"
                + "4. Salida\n"
                + "Ingrese la opcion a usar: ");
        int opc = in.nextInt();

        switch (opc) {
            case 1: {
                System.out.println("Ingrese el nombre del cliente: ");
                in.nextLine();
                String name = in.nextLine();

                System.out.println("Ingrese el saldo del cliente: ");
                double saldo = in.nextDouble();

                int id = 0;
                int x = 0;
                if (clientes.size() == 0) {

                    id = clientes.size();
                } else {
                    for (int i = 0; i < clientes.size() - 1; i++) {
                        x = clientes.get(i + 1).getID();
                        if (clientes.get(i).getID() > x) {
                            x = clientes.get(i).getID();
                        }
                    }
                    id = x + 1;
                }

                Clientes c = new Clientes(id, name, saldo);
                clientes.add(c);
                break;
            }

            case 2: {
                System.out.println(printClientes());
                System.out.println("Ingrese el indice del cliente a eliminar");
                int ind = in.nextInt();

                if (ind >= 0 && ind < clientes.size()) {
                    clientes.remove(ind);
                    System.out.println("Cliente eliminado exitosamente");
                } else {
                    System.out.println("Indice ingresado no es valido");
                }
                break;
            }

            case 3: {
                System.out.println(printClientes());
                break;
            }

            case 4: {
                break;
            }

            default: {
                System.out.println("Opcion ingresada no el valida");
            }
        }

    }

    public static String printClientes() {
        String salida = "";
        for (Clientes c : clientes) {
            salida += clientes.indexOf(c) + " -> " + c + "\n";
        }

        return salida;
    }

    public static void CRUDVehiculos() {
        System.out.println("\nMENU VEHICULOS\n");
        System.out.println("1. Crear vehiculo\n"
                + "2. Modificar vehiculo\n"
                + "3. Eliminar vehiculo\n"
                + "4. Salir\n"
                + "Ingrese la opcion a usar\n");
        int opc = in.nextInt();

        switch (opc) {
            case 1: {
                System.out.println(printConc());
                System.out.println("Ingrese el indice la concesionaria a añadir el vehiculo: ");
                int conc = in.nextInt();

                if (concesionarias.isEmpty() || conc >= concesionarias.size() || conc < 0) {
                    System.out.println("No se puede crear vehiculo");
                } else {

                    System.out.println("Ingrese el color del vehiculo: ");
                    in.nextLine();
                    String color = in.nextLine();

                    System.out.println("Ingrese la marca del vehiculo: ");
                    String marca = in.nextLine();

                    System.out.println("Ingrese el modelo del vehiculo: ");
                    String modelo = in.nextLine();

                    System.out.println("Ingrese el año de creacion del vehiculo: ");
                    int year = in.nextInt();

                    System.out.println("Ingrese el precio del vehiculo: ");
                    double precio = in.nextDouble();

                    System.out.println("Ingrese la cantidad de llantas del vehiculo: ");
                    int llantas = in.nextInt();

                    switch (llantas) {
                        case 2: {
                            System.out.println("1. Bicicleta  2. Motocicleta\n");
                            int num = in.nextInt();

                            switch (num) {
                                case 1: {
                                    System.out.println("\nBICICLETA");
                                    System.out.println("Ingrese la descripcion de la bicicleta: ");
                                    in.nextLine();
                                    String desc = in.nextLine();

                                    System.out.println("Ingrese el radio de las ruedas de la bicicleta: ");
                                    int radio = in.nextInt();

                                    System.out.println("Ingrese el tipo de bicicleta (BMX o de Calle):");
                                    in.nextLine();
                                    String tipo = in.nextLine();

                                    Bicicleta bici = new Bicicleta(desc, radio, color, marca, modelo, year, precio, llantas, tipo);
                                    vehiculos.add(bici);

                                    concesionarias.get(conc).getCatalogoVenta().add(bici);
                                    break;
                                }

                                case 2: {
                                    System.out.println("\nMOTOCICLETA");
                                    System.out.println("Ingrese el desplazamiento del motor de la motocicleta: ");
                                    int motor = in.nextInt();

                                    System.out.println("¿Es la moto electrica? 1=si, 0=no");
                                    int elect = in.nextInt();
                                    boolean isElect = false;
                                    if (elect == 1) {
                                        isElect = true;
                                    } else if (elect == 0) {
                                        isElect = false;
                                    } else {
                                        System.out.println("Opcion no es valida");
                                    }

                                    Motocicleta moto = new Motocicleta(motor, isElect, color, marca, modelo, year, precio, llantas);
                                    vehiculos.add(moto);

                                    concesionarias.get(conc).getCatalogoVenta().add(moto);
                                    break;
                                }
                                default: {
                                    System.out.println("Opcion ingresada no es valida");
                                }
                            }
                        }

                        case 4: {
                            System.out.println("1. Carro  2. Bus  3. Camión de carga\n");
                            int num = in.nextInt();

                            switch (num) {
                                case 1: {
                                    System.out.println("CARRO");
                                    System.out.println("Ingrese la cantidad de puertas del carro: ");
                                    int puertas = in.nextInt();

                                    System.out.println("Ingrese una descripción del motor del carro: ");
                                    in.nextLine();
                                    String desc = in.nextLine();

                                    System.out.println("Ingrese la velocidad maxima del carro: ");
                                    int maxvel = in.nextInt();

                                    Carro carro = new Carro(puertas, desc, maxvel, color, marca, modelo, year, precio, llantas);
                                    vehiculos.add(carro);

                                    concesionarias.get(conc).getCatalogoVenta().add(carro);
                                    break;
                                }
                                case 2: {
                                    System.out.println("BUS");
                                    System.out.println("Ingrese la cantidad maxima de pasajeros del bus: ");
                                    int capacidad = in.nextInt();

                                    Bus bus = new Bus(capacidad, color, marca, modelo, year, precio, llantas);
                                    vehiculos.add(bus);

                                    concesionarias.get(conc).getCatalogoVenta().add(bus);
                                    break;
                                }
                                case 3: {
                                    System.out.println("CAMION DE CARGA");
                                    System.out.println("Ingrese el volumen maximo de carga: ");
                                    int volumen = in.nextInt();
                                    
                                    System.out.println("Ingrese la altura del camion");
                                    int alt = in.nextInt();
                                    
                                    System.out.println("¿El camion tiene excavadora? 1=si, 0=no");
                                    int exc = in.nextInt();
                                    boolean hasExc = false;
                                    if (exc == 1) {
                                        hasExc = true;
                                    } else if (exc == 0) {
                                        hasExc = false;
                                    } else {
                                        System.out.println("Opcion no es valida");
                                    }
                                    
                                    Camion cam = new Camion(volumen, alt, hasExc, color, marca, modelo, year, precio, llantas);
                                    vehiculos.add(cam);
                                    concesionarias.get(conc).getCatalogoVenta().add(cam);
                                    break;
                                }
                                default: {
                                    System.out.println("Opcion ingresada no es valida");
                                }
                            }
                        }
                    }
                }
                break;
            }

            case 2: {
                break;
            }

            case 3: {
                break;
            }

            case 4: {
                break;
            }

            default: {
                System.out.println("Opcion ingresada no es valida");
            }
        }
    }

    public static String printVehiculos() {
        String salida = "";
        for (Vehiculo v : vehiculos) {
            salida += vehiculos.indexOf(v) + " -> " + v + "\n";
        }

        return salida;
    }

}
