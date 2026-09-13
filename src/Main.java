public class Main {
    public static void main(String[] args) {

        EquipoEmergencia medica = new BrigadaMedica("Brigada medica");

        DronRescate dron = new DronRescate("Dron de rescate");
        BrigadaTecnica tecnica = new BrigadaTecnica("Brigada Tecnica");

        dron.volar();
        tecnica.reparar();

        medica.mostrarNombre();
        medica.atenderEmergencia();

       tecnica.mostrarNombre();
       tecnica.atenderEmergencia();

        dron.mostrarNombre();
        dron.atenderEmergencia();
    }
}