package GestionVehiculos.Clases;

public class VehiculoMotorizado extends Vehiculo {
    String tipocombustible;


    public VehiculoMotorizado(String marca, String modelo, String ano, String tipocombustible) {
        super(marca, modelo, ano);
        this.tipocombustible = tipocombustible;
    }



    public String mostrarDetalles() {
        return "VehiculoMotorizado{" +
                "tipocombustible='" + tipocombustible + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                '}';



    }
}
