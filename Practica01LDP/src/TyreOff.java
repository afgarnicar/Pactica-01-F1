public class TyreOff extends PitCrewTeam implements PitCrewTask {

    PitCrewTeam pit = new PitCrewTeam(4);

    private int numLlantasDaniadas;
    private String nombreTyreOff,nombreTyreOff2,nombreTyreOff3,getNombreTyreOff4,llantaAQuitar;

    public TyreOff(int numLlantasDaniadas, String llantaAQuitar) {
        super(4);
        this.numLlantasDaniadas = numLlantasDaniadas;
        this.nombreTyreOff = "Felipe";
        this.nombreTyreOff2 = "Daniel";
        this.nombreTyreOff3 = "Mario";
        this.getNombreTyreOff4 = "Tomas";
        this.llantaAQuitar = llantaAQuitar;
    }


    public void numeroLlantas(){
        System.out.println("tine " + numLlantasDaniadas + " llantas dañadas");
    }
    public void llantaPorQuitar() {

        System.out.println("Tiene las llantas " + llantaAQuitar + " dañadas. El nombre de la persona que le va a poner las llantas es: " + nombreTyreOff + " y " + nombreTyreOff2);

    }

    @Override
    public void rolDesempeñado(){
        System.out.println("Tyre Off");
    }

    @Override
    public void tamanioEquipo(){
        System.out.println("Este equipo esta compuesto por "+  pit.getNumEquipo()+ " integrantes");
    }

    public void trabajo(){
        System.out.println("Las llantas se desmontaron satisfactoriamente");
    }
    public int getNumLlantasDaniadas() {
        return numLlantasDaniadas;
    }

    public void setNumLlantasDaniadas(int numLlantasDaniadas) {
        this.numLlantasDaniadas = numLlantasDaniadas;
    }

    public String getNombreTyreOff() {
        return nombreTyreOff;
    }

    public void setNombreTyreOff(String nombreTyreOff) {
        this.nombreTyreOff = nombreTyreOff;
    }

    public String getNombreTyreOff2() {
        return nombreTyreOff2;
    }

    public void setNombreTyreOff2(String nombreTyreOff2) {
        this.nombreTyreOff2= nombreTyreOff2;
    }

    public String getLlantaAQuitar() {
        return llantaAQuitar;
    }

    public void setLlantaAQuitar(String llantaAQuitar) {
        this.llantaAQuitar = llantaAQuitar;
    }
}