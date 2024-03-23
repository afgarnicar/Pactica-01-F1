public class TyreOn extends PitCrewTeam implements PitCrewTask {
    // Role: Bring tyres to the pit box and fit on to the car
    // Number of crew members: Four – one for each tyre
    PitCrewTeam pit = new PitCrewTeam(4);


    private int numLlantasDaniadas;
    private String nombreTyreOn,nombreTyreOn2,nombreTyreOn3,nombreTyreOn4,llantaAPoner;

    public TyreOn(){
        super(4);
    }

    public void info() {
        this.numLlantasDaniadas = 2;
        this.nombreTyreOn = "Felipe";
        this.nombreTyreOn2 = "Daniel";
        this.nombreTyreOn3 = "Mario";
        this.nombreTyreOn4 = "Tomas";
        this.llantaAPoner = "delantera izquierda y derecha trasera";
    }
    public void ponerLlanta(){
        System.out.println("Las llantas fueron colocadas exitosamente");
    }
    public void numeroDeLlantas(){
        System.out.println("la cantidad de llantas dañadas es: " + numLlantasDaniadas);
    }
    public void llantaPorArreglar() {

            System.out.println("Tiene la llanta " + llantaAPoner + " dañada. El nombre de la persona que se le va a poner la llanta es: " + nombreTyreOn + " y " + nombreTyreOn2);


    }

    @Override
    public void rolDesempeñado(){
        System.out.println("Tyre On");
    }

    @Override
    public void tamanioEquipo(){
        System.out.println("Este equipo esta compuesto por "+  pit.getNumEquipo()+ " integrantes");
    }

    public int getNumLlantasDaniadas() {
        return numLlantasDaniadas;
    }

    public void setNumLlantasDaniadas(int numLlantasDaniadas) {
        this.numLlantasDaniadas = numLlantasDaniadas;
    }

    public String getNombreTyreOn() {
        return nombreTyreOn;
    }

    public void setNombreTyreOn(String nombreTyreOn) {
        this.nombreTyreOn = nombreTyreOn;
    }

    public String getLlantaAPoner() {
        return llantaAPoner;
    }

    public void setLlantaAPoner(String llantaAPoner) {
        this.llantaAPoner = llantaAPoner;
    }

    public String getNombreTyreOn2() {
        return nombreTyreOn2;
    }

    public void setNombreTyreOn2(String nombreTyreOn2) {
        this.nombreTyreOn2= nombreTyreOn2;
    }
}
