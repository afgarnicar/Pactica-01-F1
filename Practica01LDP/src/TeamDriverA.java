public class TeamDriverA extends PitCrewTeam implements PitCrewTask{
    PitCrewTeam pit = new PitCrewTeam(5);
    private String nombreConductorA;
    private int aniosDeExperiencia;

    public TeamDriverA(String nombreConductorA, int aniosDeExperiencia) {
        super(5);
        this.nombreConductorA = nombreConductorA;
        this.aniosDeExperiencia = aniosDeExperiencia;
    }

    @Override
    public void rolDesempeñado(){
        System.out.println("Equipo piloto 1");
    }
    public void trabajaParaDriverA() {
        System.out.println("Trabaja para el conductor 1: " + nombreConductorA + " con " + aniosDeExperiencia + " años de experiencia como piloto de F1");
    }

    @Override
    public void tamanioEquipo(){
        System.out.println("Este equipo esta compuesto por "+  pit.getNumEquipo()+ " integrantes");
    }

    public String getNombreConductorA() {
        return nombreConductorA;
    }

    public void setNombreConductorA(String nombre) {
        this.nombreConductorA = nombre;
    }

    public int getAniosDeExperiencia(){return aniosDeExperiencia;}

    public void setAniosDeExperiencia(int aniosDeExperiencia){
        this.aniosDeExperiencia = aniosDeExperiencia;
    }
}
