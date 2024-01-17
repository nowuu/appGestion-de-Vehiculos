package GestionVehiculos.Clases;

public class Vehiculo {

    public String marca;
    public String modelo;
    public String ano;


    public Vehiculo(String marca, String modelo, String año) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = año;
    }



    public String mostrarDetalles() {

        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
