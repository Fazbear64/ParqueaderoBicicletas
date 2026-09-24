package datos;

public class Bicicleta {
    private int serial;
    private int idDueno;
    private String color;

    Bicicleta(int serial, int idDueno, String color){
        this.serial = serial;
        this.idDueno = idDueno;
        this.color = color;
    }

    public int obtenerSerial(){return this.serial;}
    public int obtenerIdDueno(){return this.idDueno;}
    public String obtenerColor(){return this.color;}
}
