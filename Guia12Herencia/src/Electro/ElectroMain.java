package Electro;

import java.util.ArrayList;

/**
 *
 * @author SAMIR
 */
public class ElectroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");

//        Electrodomesticos elec = new Electrodomesticos();
//        Lavadora L = new Lavadora();
//        Televisor T = new Televisor();
        ArrayList<Electrodomesticos> ListaElectro = new ArrayList();
//
//        String opcion = "";
//        do {
//
//            System.out.println("\n\t  ******* CATÁLOGO DE ELECTRODOMESTICOS *******");
//            System.out.println("\n      MENÚ DE OPCIONES:");
//            System.out.println("IMPORTANTE = ELEGIR SI CARGAR EJEMPLOS para terminar ejecución O Ingresar manualmente.");
//            System.out.println("\t 1. Cargar 4 ejemplos");
//            System.out.println("\t 2. Ingresar nuevo Electrodomestico");
//            System.out.println("\t 3. Ingresar nueva Lavadora");
//            System.out.println("\t 4. Ingresar nuevo Televisor");
//            System.out.println("\t 5. Precio Final Electrodomestico");
//            System.out.println("\t 6. Precio Final Televisor");
//            System.out.println("\t 7. Precio Final Lavadora");
//            System.out.println("\t 8. Salir del programa");
//            System.out.print("\n     --> Elige tu opción: ");
//
//            opcion = leer.next();
//
//            switch (opcion) {
//                case "1":
        ListaElectro.add(new Lavadora(20, "DREAM", 0, "rojo", "C", 60));
        ListaElectro.add(new Lavadora(60, "Samsung", 0, "negro", "A", 110));

        ListaElectro.add(new Televisor(40, true, "TCL", 0, "verde", "C", 60));
        ListaElectro.add(new Televisor(20, false, "LG", 0, "azul", "C", 30));

        int aux = 0;
        int precioTele = 0;
        int precioLava = 0;
        
        for (Electrodomesticos electrodomesticos : ListaElectro) {
            
            electrodomesticos.precioFinal();
            
            aux += (electrodomesticos.getPrecio());

            if (electrodomesticos.getNombreProd().equalsIgnoreCase("DREAM") || electrodomesticos.getNombreProd().equalsIgnoreCase("SAMSUNG")) {

                precioLava += electrodomesticos.getPrecio();
            }
            if (electrodomesticos.getNombreProd().equalsIgnoreCase("TCL") || electrodomesticos.getNombreProd().equalsIgnoreCase("LG")) {

                precioTele += electrodomesticos.getPrecio();
            }
        }
        System.out.println("");
        System.out.println("El total de la suma de los productos es de: " + aux + "$");
        System.out.println("");
        System.out.println("El precio total de televisores es de: " + precioTele + "$");
        System.out.println("El precio total de lavadoras es de: " + precioLava + "$");

//                    break;
//             
//                default:
//                    System.out.println("\n     --> Debes Ingresar una opción válida (1 a 8) !!");
//                    es.limpiarPantalla();
//            }
//
//        } while (!"8".equals(opcion));
    }

}
