package GestionVehiculos;

import GestionVehiculos.Clases.Automovil;
import GestionVehiculos.Clases.Motocicleta;
import GestionVehiculos.Clases.Vehiculo;
import GestionVehiculos.Clases.VehiculoMotorizado;

public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("opel", "sub", "a", "diesel", "5");
        Vehiculo vehiculo1 = new Vehiculo("opel", "normal", "1992");
        VehiculoMotorizado vehiculoMotorizado = new VehiculoMotorizado("2001", "a", "3", "a");
    Motocicleta motocicleta=new Motocicleta("honda","chopper","1993","diesel","grande");
        System.out.println(automovil.mostrarDetalles());
        System.out.println("--------------------");
        System.out.println(vehiculo1.mostrarDetalles());
        System.out.println("--------------------");
        System.out.println(vehiculoMotorizado.mostrarDetalles());
        System.out.println("--------------------");
        System.out.println( motocicleta.mostrarDetalles());
        System.out.println("---------------------");

    }

}