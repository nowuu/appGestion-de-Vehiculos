package GestionVehiculos.Clases;

public class Automovil extends VehiculoMotorizado {

     String Numero_de_puertas;


    public Automovil(String marca, String modelo, String año, String tipocombustible, String numero_de_puertas) {
        super(marca, modelo, año, tipocombustible);
        this.Numero_de_puertas = numero_de_puertas;
    }




    public String mostrarDetalles() {
        return "Automovil{" +
                "Numero_de_puertas='" + Numero_de_puertas + '\'' +
                ", tipocombustible='" + tipocombustible + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                '}';


  }
}
