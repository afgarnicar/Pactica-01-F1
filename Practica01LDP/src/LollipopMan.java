public class LollipopMan extends PitCrewTeam implements PitCrewTask {
    // Role: Give the signal for the car to be released
    // Number of crew members: One

    PitCrewTeam pit = new PitCrewTeam(1);

    String nombre;

    public LollipopMan(){
    super(1);
    this.nombre = "Santiago";
    }
    public void levantarSenial(){
        System.out.println(nombre + "Levanta la sela que indica que el carro puede salir de los pits");
    }

    @Override
    public void rolDesempeñado(){
        System.out.println("Lollipop Man");
    }

    @Override
    public void tamanioEquipo(){
        System.out.println("Este equipo esta compuesto por "+  pit.getNumEquipo()+ " integrantes");
    }
}