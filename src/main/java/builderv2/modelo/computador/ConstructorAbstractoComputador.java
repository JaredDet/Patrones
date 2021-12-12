package builderv2.modelo.computador;

import builderv2.interfaz.Constructor;

public abstract class ConstructorAbstractoComputador implements Constructor<Computador> {

    public abstract ConstructorAbstractoComputador agregarMarca(String marca);

    public abstract ConstructorAbstractoComputador agregarProcesador(String procesador);

    public abstract ConstructorAbstractoComputador agregarRam(int ram);
}

