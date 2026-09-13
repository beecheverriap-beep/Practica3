public class Main {
    public static void main(String[] args) {

        EquipoEmergencia medica = new BrigadaMedica("Brigada medica");

        DronRescate dron = new DronRescate("Dron de rescate");
        BrigadaTecnica tecnica = new BrigadaTecnica("Brigada Tecnica");


        EquipoEmergencia equipo1 = new BrigadaMedica("Brigada Medica");
        EquipoEmergencia equipo2 = new BrigadaTecnica("Brigada Tecnica");
        EquipoEmergencia equipo3 = new DronRescate("Dron de rescate");

        Volador volador = new DronRescate("Dron aereo");
        Reparador reparador = new BrigadaTecnica("Equipo tecnico");

        equipo1.atenderEmergencia();
        equipo2.atenderEmergencia();
        equipo3.atenderEmergencia();

        volador.volar();
        reparador.reparar();

        dron.mostrarNombre();
        dron.atenderEmergencia();
        dron.volar();
        tecnica.reparar();


        medica.mostrarNombre();
        medica.atenderEmergencia();

       tecnica.mostrarNombre();
       tecnica.atenderEmergencia();


    }
}