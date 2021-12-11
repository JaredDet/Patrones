package builder.modelo;

public abstract class ComputadorBuilder {

    protected Computador computador;

    public Computador getComputador() {
        return computador;
    }

    public void crearComputador() {
        computador = new Computador();
    }

    protected abstract void buildMarca();

    protected abstract void buildProcesador();

    protected abstract void buildRam();
}
