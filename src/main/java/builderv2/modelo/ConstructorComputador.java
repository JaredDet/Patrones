package builderv2.modelo;

public class ConstructorComputador extends ConstructorAbstractoComputador{

    private final Computador computador;

    private ConstructorComputador(){
        computador = new Computador();
    }

    public static ConstructorComputador computador(){
        return new ConstructorComputador();
    }

    @Override
    public Computador construir() {
        return computador;
    }

    @Override
    public ConstructorAbstractoComputador agregarMarca(String marca) {
        computador.setMarca(marca);
        return this;
    }

    @Override
    public ConstructorAbstractoComputador agregarProcesador(String procesador) {
        computador.setProcesador(procesador);
        return this;
    }

    @Override
    public ConstructorAbstractoComputador agregarRam(int ram) {
        computador.setRam(ram);
        return this;
    }
}
