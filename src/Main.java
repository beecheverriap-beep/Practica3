public class Main {
    public static void main(String[] args) {

        EquipoEmergencia medica = new BrigadaMedica("Brigada medica");

        DronRescate dron = new DronRescate("Dron de rescate");
        BrigadaTecnica tecnica = new BrigadaTecnica("Brigada Tecnica");

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