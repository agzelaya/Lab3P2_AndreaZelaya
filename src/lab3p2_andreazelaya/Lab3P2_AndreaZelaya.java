package lab3p2_andreazelaya;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_AndreaZelaya {

    static Scanner in = new Scanner(System.in);
    static ArrayList<Concesionaria> concesionarias = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Alcaldía Municipal del Distrito Central (AMDC)\n");
        int main;
        do {
            System.out.println("MENU PRINCIPAL\n"
                    + "1. CRUD Concesionaria\n"
                    + "2. CRUD Clientes\n"
                    + "3. CRUD Vehiculos\n"
                    + "4. Compra/Venta de vehículos por parte de un cliente\n"
                    + "Ingrese la opción que desea usar:");
            main = in.nextInt();

            switch (main) {
                case 1: {
                    CRUDConc();
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
                + "Ingrese la opcion a usar: ");
        opc = in.nextInt();

        switch (opc) {
            case 1: {
                System.out.println("Ingrese el nombre de la concesionaria:\n");
                in.nextLine();
                String name = in.nextLine();

                System.out.println("Ingrese la direccion de la concesionaria:\n");
                String direc = in.nextLine();

                System.out.println("Ingrese el saldo de la concesionaria\n");
                double saldo = in.nextDouble();

                int id = 0;
                int x = 0;
                if (concesionarias.size() == 0) {

                    id = concesionarias.size() + 1;
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

}
