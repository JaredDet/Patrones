package builderv2.modelo.celular;

import builderv2.interfaz.Constructor;

public abstract class ConstructorAbstractoCelular implements Constructor<Celular> {

    public abstract ConstructorAbstractoCelular isTouch();

    public abstract ConstructorAbstractoCelular agregarPantalla(String pantalla);

    public abstract ConstructorAbstractoCelular agregarParlante(String parlante);

    public abstract ConstructorAbstractoCelular agregarBateria(int bateria);
}
