package builderv2.modelo.celular;

public class Celular {

    private boolean isTouch;

    private String pantalla;
    private String parlante;

    private int bateria;

    public void isTouch(boolean touch) {
        isTouch = touch;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public void setParlante(String parlante) {
        this.parlante = parlante;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Pantalla: " + pantalla
                + ", Parlante: " + parlante
                + ", Bateria: " + bateria + "%";
    }
}
