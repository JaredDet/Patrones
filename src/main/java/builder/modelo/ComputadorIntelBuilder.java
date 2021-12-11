package builder.modelo;

public class ComputadorIntelBuilder extends ComputadorBuilder {

    @Override
    protected void buildMarca() {
        computador.setMarca("Intel");
    }

    @Override
    protected void buildProcesador() {
        computador.setProcesador("Intel Core i7");
    }

    @Override
    protected void buildRam() {
        computador.setRam(16);
    }
}
