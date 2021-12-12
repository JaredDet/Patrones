package builderv2.modelo.celular;

public class ConstructorCelular extends ConstructorAbstractoCelular {

    private final Celular celular;

    private ConstructorCelular() {
        celular = new Celular();
    }

    public static ConstructorCelular celular() {
        return new ConstructorCelular();
    }

    @Override
    public Celular construir() {
        return celular;
    }

    @Override
    public ConstructorAbstractoCelular isTouch() {
        celular.isTouch(true);
        return this;
    }

    @Override
    public ConstructorAbstractoCelular agregarPantalla(String pantalla) {
        celular.setPantalla(pantalla);
        return this;
    }

    @Override
    public ConstructorAbstractoCelular agregarParlante(String parlante) {
        celular.setParlante(parlante);
        return this;
    }

    @Override
    public ConstructorAbstractoCelular agregarBateria(int bateria) {
        celular.setBateria(bateria);
        return this;
    }
}
