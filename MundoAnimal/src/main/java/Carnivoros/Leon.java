package Carnivoros;

/**
 *
 * @author Carlos
 */
public class Leon extends Carnivoro {

    private static final boolean sonido = true;
    private static final String ruido = "grrrrr";
    private static final String genero = "macho";
    private static final String nombreCientifico = "Panthera leo";
    private static final String habitat = "Sabana";
    private static final String reyno = "animalia";

    public Leon() {
    }

    public Leon( int edad) {
        super(Leon.genero, Leon.habitat, edad, Leon.reyno, Leon.nombreCientifico, tipoAlimento);
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Leon" + super.toString() + "\nRuido: " + ruido;
    }
}
