import java.util.ArrayList;

import java.util.Scanner;

public class menuRestaurant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Plato> platosMenu = new ArrayList<Plato>();

        while (true) {
            System.out.println("Restaurante 'El Sereno'.");
            System.out.println("Ingrese el nombre del plato:");
            String nombrePlato = scan.nextLine();

            System.out.println("Ingrese el precio del plato:");
            double precioPlato = Double.parseDouble(scan.nextLine());

            System.out.println("¿Es una bebida? (true/false):");
            boolean esBebida = Boolean.parseBoolean(scan.nextLine());

            Plato plato = new Plato(nombrePlato, precioPlato, esBebida);

            if (!esBebida) {
                while (true) {
                    System.out.println("Ingrese el nombre del ingrediente (o escriba 'fin' para terminar):");
                    String nombreIngrediente = scan.nextLine();
                    if (nombreIngrediente.equalsIgnoreCase("fin")) {
                        break;
                    }

                    System.out.println("Ingrese la cantidad del ingrediente:");
                    double cantidadIngrediente = Double.parseDouble(scan.nextLine());

                    System.out.println("Ingrese la unidad de medida del ingrediente:");
                    String unidadMedida = scan.nextLine();

                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidadIngrediente, unidadMedida);
                    plato.agregarIngrediente(ingrediente);
                }
            }

            platosMenu.add(plato);

            System.out.println("¿Desea ingresar otro plato? (s/n):");
            String continuar = scan.nextLine().toLowerCase();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }
        System.out.println("-----------MENÚ----------------");
        for (Plato plato : platosMenu) {
            System.out.println(plato.getNombreCompleto());
            System.out.println("Precio: $ " + plato.getPrecio());

            if (!plato.isEsBebida()) {
                System.out.println("Ingredientes:");
                System.out.println("Nombre   Cantidad   Unidad de Medida");
                for (Ingrediente ingrediente : plato.getIngredientes()) {
                    System.out.println(ingrediente.getNombre() + " " + ingrediente.getCantidad() + " " + ingrediente.getUnidadMedida());
                }
            }
            System.out.println("----------------------------------");
        }
        System.out.println("----------------------------------");
        scan.close();
    }

    }

