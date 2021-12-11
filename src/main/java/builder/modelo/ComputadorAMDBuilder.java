package builder.modelo;

public class ComputadorAMDBuilder extends ComputadorBuilder{

    @Override
    protected void buildMarca() {
        computador.setMarca("AMD");
    }

    @Override
    protected void buildProcesador() {
        computador.setProcesador("Ryzen 5");
    }

    @Override
    protected void buildRam() {
        computador.setRam(16);
    }
}
