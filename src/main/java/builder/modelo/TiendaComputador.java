package builder.modelo;

public class TiendaComputador {

    private ComputadorBuilder builder;

    public void setBuilder(ComputadorBuilder builder) {
        this.builder = builder;
    }

    public Computador getComputador() {
        return builder.getComputador();
    }

    public void construirComputador() {

        builder.crearComputador();
        builder.buildMarca();
        builder.buildProcesador();
        builder.buildRam();
    }
}
