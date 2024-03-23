public class F1Team {

    //Atributos
private String nombre,director,corredor1, corredor2;
private int anioFundacion;


    //Constructor
    public F1Team(String nombre, String director, String corredor1, String corredor2, int anioFundacion) {
        this.nombre = nombre;
        this.director = director;
        this.corredor1 = corredor1;
        this.corredor2 = corredor2;
        this.anioFundacion = anioFundacion;
    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCorredor1() {
        return corredor1;
    }

    public void setCorredor1(String corredor1) {
        this.corredor1 = corredor1;
    }

    public String getCorredor2() {
        return corredor2;
    }

    public void setCorredor2(String corredor2) {
        this.corredor2 = corredor2;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion) {
        this.anioFundacion = anioFundacion;
    }


    public void infoF1Team(){
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Nombre del director: " + director);
        System.out.println("Piloto 1: " + corredor1);
        System.out.println("Piloto 2: " + corredor2);
        System.out.println("Año de fundacion: " + anioFundacion);
    }

    public void equipo(){
        System.out.println("El equipo " + nombre + " tiene un total de 20 integrantes");
    }
}
