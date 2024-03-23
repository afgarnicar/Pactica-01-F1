public class PitCrewTeam {
    private int numEquipo;

    public PitCrewTeam(int numEquipo) {
        this.numEquipo = numEquipo;
    }


    public int getNumEquipo() {
        return numEquipo;
    }


    public void setNumEquipo(int numEquipo) {
        this.numEquipo = numEquipo;
    }


    public void tamanioEquipo() {
        System.out.println("El tamaño de este equipo es de: " + numEquipo);
    }
}
