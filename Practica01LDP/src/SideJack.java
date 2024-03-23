public class SideJack extends PitCrewTeam implements PitCrewTask {

    PitCrewTeam pit = new PitCrewTeam(2);
    private String funcion;
    private String nombreSideJack,nombreSideJack2;

    public SideJack(String funcion, String nombreSideJack, String nombreSideJack2) {
        super(2);
        this.funcion = funcion;
        this.nombreSideJack = nombreSideJack;
        this.nombreSideJack2 = nombreSideJack2;
    }

    public void TrabajoPorHacer() {
        System.out.println("El trabajo que van a hacer " + nombreSideJack + " y "+ nombreSideJack2 + " es: " + funcion);
    }

    @Override
    public void rolDesempeñado(){
        System.out.println("Side Jack");
    }

    @Override
    public void tamanioEquipo(){
        System.out.println("Este equipo esta compuesto por "+  pit.getNumEquipo()+ " integrantes");
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getNombreSideJack() {
        return nombreSideJack;
    }

    public void setNombreSideJack(String nombre) {
        this.nombreSideJack = nombre;
    }

    public String getNombreSideJack2() {
        return nombreSideJack2;
    }

    public void setNombreSideJack2(String nombre2) {
        this.nombreSideJack2 = nombre2;
    }
}