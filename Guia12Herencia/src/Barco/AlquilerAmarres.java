package Barco;

import com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.NamespaceVersion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author SAMIR
 */
public class AlquilerAmarres {

    private String nombreCliente;
    private String documentoCliente;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public AlquilerAmarres() {
    }

    public AlquilerAmarres(String nombreCliente, String documentoCliente, LocalDate fechaInicio, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public AlquilerAmarres crearAlquiler() {
        System.out.println("Ingrese el nombre del Cliente");
        nombreCliente = leer.next();

        System.out.println("Ingrese el documento del Cliente");
        documentoCliente = leer.next();

        fechaInicio = LocalDate.now();

        System.out.println("Fecha de inicio: " + fechaInicio);

        System.out.println("Ingrese la fecha de devolucion AAAA-MM-DD");
        String fechadev = leer.next();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        fechaDevolucion = LocalDate.parse(fechadev);
        
        double dias = ChronoUnit.DAYS.between(fechaInicio, fechaDevolucion);

        System.out.println("Cantidad de días: " + dias);
        
        System.out.println("Ingrese posición de amarre");
        posicionAmarre = leer.nextInt();

        do {

            System.out.println("Ingrese que tipo de barco quiere crear 1-2-3");
            System.out.println("1-Velero 2-BarcoMotor 3-Yate");
            int opc = leer.nextInt();
            int aux;
            switch (opc) {
                case 1:
                    Velero v1 = new Velero();
                    v1.crearVelero();
                    barco = v1;
                    aux = (int) (v1.calcularModulo() * dias);
                    System.out.println("El precio total del alquiler es de: " + aux + "$");
                    return new AlquilerAmarres(nombreCliente, documentoCliente, fechaInicio, fechaDevolucion, posicionAmarre, barco);
                case 2:
                    BarcoMotor b1 = new BarcoMotor();
                    b1.crearBarcoMotor();
                    barco = b1;
                    aux = (int) (b1.calcularModulo() * dias);
                    System.out.println("El precio total del alquiler es de: " + aux + "$");
                    return new AlquilerAmarres(nombreCliente, documentoCliente, fechaInicio, fechaDevolucion, posicionAmarre, barco);

                case 3:
                    Yate Y1 = new Yate();
                    Y1.crearYate();
                    barco = Y1;
                    aux = (int) (Y1.calcularModulo() * dias);
                    System.out.println("El precio total del alquiler es de: " + aux + "$");
                    return new AlquilerAmarres(nombreCliente, documentoCliente, fechaInicio, fechaDevolucion, posicionAmarre, barco);
            }
        } while (true);
        
    }

    @Override
    public String toString() {
        super.toString();
        return "AlquilerAmarres{" + "nombreCliente=" + nombreCliente + ", documentoCliente=" + documentoCliente + ", fechaInicio=" + fechaInicio + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }

}
// Calcular la cantidad de días entre la fecha actual y la fecha posterior
        









//        do {
//            if (opc == 1) {
//                Velero v1 = new Velero();
//                Barco barco = v1.crearVelero();
//            }
////            if (opc == 2) {
////                Barco barco1 = new BarcoMotor();
////            }
////            if (opc == 3) {
////                Barco barco1 = new Yate();
////            }
//        } while (opc == 1 || opc == 2 || opc == 3);
//        double modulo = barco.calcularModulo();
//        return new AlquilerAmarres(nombreCliente, documentoCliente, fechaInicio, fechaDevolucion, posicionAmarre, 1) ;

 
//do {
//            System.out.print("Tipo de barco: 1-Velero\t2-Barco a Motor\t3-Yate");
//            switch (read.nextInt()) {
//                case 1:
//                    tipo_de_barco = new Veleros();
//                    return new Alquiler(nombre, dni, fecha_de_alquiler, fecha_de_devolucion, posicion, tipo_de_barco);
//                case 2:
//                    tipo_de_barco = new BarcosAMotor();
//                    return new Alquiler(nombre, dni, fecha_de_alquiler, fecha_de_devolucion, posicion, tipo_de_barco);
//                case 3:
//                    tipo_de_barco = new Yates();
//                    return new Alquiler(nombre, dni, fecha_de_alquiler, fecha_de_devolucion, posicion, tipo_de_barco);
//                default:
//                    throw new AssertionError();
//            }
//        } while (true);
