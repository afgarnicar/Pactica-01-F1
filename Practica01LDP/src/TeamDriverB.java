public class TeamDriverB extends PitCrewTeam implements PitCrewTask{
    PitCrewTeam pit = new PitCrewTeam(5);
    private int anios;
    private String nombre;

    public TeamDriverB(String nombre,int anios) {
        super(5);
        this.nombre = nombre;
        this.anios = anios;

    }

    @Override
    public void rolDesempeñado(){
        System.out.println("Equipo piloto 2");
    }

    public void trabajaParaDriverB() {
        System.out.println("Trabaja para el conductor 2: " + nombre + " con " + anios + " años de experiencia como piloto de F1");
    }

    public void tamanioEquipo(){
        System.out.println("Este equipo esta compuesto por "+ pit.getNumEquipo() + " integrantes");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnios() {
        return anios;
    }

    public void setTrabajo(int anios) {
        this.anios = anios;
    }
}
