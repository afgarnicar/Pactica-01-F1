public class FrontJack extends PitCrewTeam implements PitCrewTask {
    // Role: Lift the front of the car in the air to allow the tyres to be changed
    // Number of crew members: Two
    PitCrewTeam pit = new PitCrewTeam(2);
    private String trabajo,nombre1,nombre2;

    public FrontJack( String trabajo, String nombre1, String nombre2) {
        super(2);
        this.trabajo = trabajo;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }

    public void TrabajoPorHacer() {
        System.out.println("El trabajo que va a hacer " + nombre1 + " y " + nombre2 + " es: " + trabajo);
    }

    @Override
    public void rolDesempeñado(){
        System.out.println("Front Jack");
    }

    @Override
    public void tamanioEquipo(){
        System.out.println("Este equipo esta compuesto por "+  pit.getNumEquipo()+ " integrantes");
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

}
