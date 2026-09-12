public class Main {
    public static void main(String[] args) {

        EquipoEmergencia medica = new BrigadaMedica("Brigada medica");
        EquipoEmergencia tecnica = new BrigadaTecnica("Brigada tecnica");
        EquipoEmergencia dron = new DronRescate("Dron Rescate");


        medica.mostrarNombre();
        medica.atenderEmergencia();

       tecnica.mostrarNombre();
       tecnica.atenderEmergencia();

        dron.mostrarNombre();
        dron.atenderEmergencia();
    }
}