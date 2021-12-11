package builder.servicio;

import builder.modelo.Computador;
import builder.modelo.ComputadorAMDBuilder;
import builder.modelo.ComputadorIntelBuilder;
import builder.modelo.TiendaComputador;

public class ServicioComputador {

    private static TiendaComputador tienda;

    public static Computador comprarComputador(String marca) {

        tienda = new TiendaComputador();

        elegirComputador(marca);
        tienda.construirComputador();
        return tienda.getComputador();
    }

    private static void elegirComputador(String marca) {

        switch (marca) {
            case "INTEL" -> tienda.setBuilder(new ComputadorIntelBuilder());
            case "AMD" -> tienda.setBuilder(new ComputadorAMDBuilder());
        }
    }
}

