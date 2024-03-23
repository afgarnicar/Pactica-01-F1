public class TyreGunner extends PitCrewTeam implements PitCrewTask {

    PitCrewTeam pit = new PitCrewTeam(4);

    private int numLlantasDaniadas;
    private String nombreTyreGunner,nombreTyreGunner2,nombreTyreGunner3,nombreTyreGunner4,llantaArreglar;

    public TyreGunner(int numLlantasDaniadas, String llantaArreglar) {
        super(4);
        this.numLlantasDaniadas = numLlantasDaniadas;
        this.nombreTyreGunner = "Felipe";
        this.nombreTyreGunner2 = "Daniel";
        this.nombreTyreGunner3 ="Mario";
        this.nombreTyreGunner4 ="Tomas";
        this.llantaArreglar = llantaArreglar;
    }


    public void numeroLlantas(){
        System.out.println("el numero de llantas dañadas es: " + numLlantasDaniadas);
    }
    public void llantaPorArreglar() {

        System.out.println("Tiene las llantas " + llantaArreglar + " dañadas. Los nombres de las personas encargadas de quitar las tuercas son : " + nombreTyreGunner + " y " + nombreTyreGunner2);

    }

    @Override
    public void rolDesempeñado(){
        System.out.println("Tyre Gunner");
    }

    @Override
    public void tamanioEquipo(){
        System.out.println("Este equipo esta compuesto por "+  pit.getNumEquipo()+ " integrantes");
    }

    public void trabajo(){
        System.out.println("Tuercas de las llantas quitadas con exito");
    }

    public int getNumLlantasDaniadas() {
        return numLlantasDaniadas;
    }

    public void setNumLlantasDaniadas(int numLlantasDaniadas) {
        this.numLlantasDaniadas = numLlantasDaniadas;
    }

    public String getNombreTyreGunner() {
        return nombreTyreGunner;
    }

    public void setNombreTyreGunner(String nombreTyreGunner) {
        this.nombreTyreGunner = nombreTyreGunner;
    }

    public String getNombreTyreGunner2() {
        return nombreTyreGunner2;
    }

    public void setNombreTyreGunner2(String nombreTyreGunner2) {
        this.nombreTyreGunner2 = nombreTyreGunner2;
    }

    public String getLlantaArreglar() {
        return llantaArreglar;
    }

    public void setLlantaArreglar(String llantaArreglar) {
        this.llantaArreglar = llantaArreglar;
    }
}