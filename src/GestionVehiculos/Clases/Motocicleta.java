package GestionVehiculos.Clases;

public class Motocicleta extends VehiculoMotorizado {

 String tipoMoto;


    public Motocicleta(String marca, String modelo, String ano, String tipocombustible, String tipoMoto) {
        super(marca, modelo, ano, tipocombustible);
        this.tipoMoto = tipoMoto;
    }


    public String mostrarDetalles() {
        return "Motocicleta{" +
                "tipoMoto='" + tipoMoto + '\'' +
                ", tipocombustible='" + tipocombustible + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                '}';

    }
}