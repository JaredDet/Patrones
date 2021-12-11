package builder.modelo;

public class Computador {

    private String marca;
    private String procesador;
    private int ram;

    public Computador() {
    }

    public Computador(String marca, String procesador, int ram) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Marca: " + marca
                + ", Procesador: " + procesador
                + ", Ram: " + ram + " GB";
    }
}
