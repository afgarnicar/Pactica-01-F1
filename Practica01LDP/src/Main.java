import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while(true){
            System.out.println("-----MENU-----");
            System.out.println("1. F1 team");
            System.out.println("2. team driver A");
            System.out.println("3. team driver B ");
            System.out.println("4. tyre gunner ");
            System.out.println("5. tyre off ");
            System.out.println("6. tyre on ");
            System.out.println("7. side jack ");
            System.out.println("8. rear jack ");
            System.out.println("9. front jack ");
            System.out.println("10. lollipop man ");
            System.out.println("11. front wing flap adjust ");
            System.out.println("0. salir");

            int menu = sc.nextInt();


            if (menu == 1){
                F1Team f1team = new F1Team ("Eafun", "Diego", "Valentina", "Andres", 2024 );
                f1team.infoF1Team();
                f1team.equipo();
            }

            else if (menu == 2){
                TeamDriverA teamDriverA = new TeamDriverA("Valentina", 11);
                teamDriverA.rolDesempeñado();
                teamDriverA.tamanioEquipo();
                teamDriverA.trabajaParaDriverA();
            }

            else if(menu == 3){
                TeamDriverB teamDriverB = new TeamDriverB("Andres",7);
                teamDriverB.rolDesempeñado();
                teamDriverB.tamanioEquipo();
                teamDriverB.trabajaParaDriverB();
            }

            else if(menu == 4){
                TyreGunner tyreGunner = new TyreGunner(2, "delantera izquierda y derecha trasera");
                tyreGunner.rolDesempeñado();
                tyreGunner.tamanioEquipo();
                tyreGunner.numeroLlantas();
                tyreGunner.llantaPorArreglar();
                tyreGunner.trabajo();

            }

            else if(menu == 5){
                TyreOff tyreOff = new TyreOff(2, "delantera izquierda y derecha trasera");
                tyreOff.rolDesempeñado();
                tyreOff.tamanioEquipo();
                tyreOff.numeroLlantas();
                tyreOff.llantaPorQuitar();
                tyreOff.trabajo();

            }

            else if(menu == 6){
                TyreOn tyreOn = new TyreOn();
                tyreOn.rolDesempeñado();
                tyreOn.tamanioEquipo();
                tyreOn.info();
                tyreOn.numeroDeLlantas();
                tyreOn.llantaPorArreglar();
                tyreOn.ponerLlanta();

            }

            else if(menu == 7){
                SideJack sideJack = new SideJack("Levantar el carro por un lado", "Pedro", "Agustin");
                sideJack.rolDesempeñado();
                sideJack.tamanioEquipo();
                sideJack.TrabajoPorHacer();
            }

            else if( menu == 8){
                RearJack rearJack = new RearJack("Levanta el coche en el aire desde atrás.", "Pedro", "Agustin");
                rearJack.rolDesempeñado();
                rearJack.tamanioEquipo();
                rearJack.TrabajoPorHacer();
            }

            else if (menu == 9){
                FrontJack frontJack = new FrontJack("Levantar la parte delantera del automóvil en el aire para permitir que se cambien los neumáticos.", "Pedro", "Agustin");
                frontJack.rolDesempeñado();
                frontJack.tamanioEquipo();
                frontJack.TrabajoPorHacer();
            }


            else if (menu == 10){
                LollipopMan lollipopMan = new LollipopMan();
                lollipopMan.rolDesempeñado();
                lollipopMan.tamanioEquipo();
                lollipopMan.levantarSenial();

                System.out.println();
            }

            else if (menu == 11){
                FrontWingFlapAdjust frontWingFlapAdjust = new FrontWingFlapAdjust("Aplicar cambios aerodinámicos al alerón delantero.", "Julian", "Juan");
                frontWingFlapAdjust.rolDesempeñado();
                frontWingFlapAdjust.tamanioEquipo();
                frontWingFlapAdjust.TrabajoPorHacer();
            }

            else if (menu == 0){
                System.out.println("Has salido del programa");
                break;
            }

        }

    }
}