package builder;

import builder.modelo.Computador;
import builder.servicio.ServicioComputador;

public class App {

    public static void main(String[] args) {

        Computador computador;

        {
            computador = ServicioComputador
                    .comprarComputador("INTEL");
            System.out.println(computador);
        }

        {
            computador = ServicioComputador
                    .comprarComputador("AMD");
            System.out.println(computador);
        }
    }
}
