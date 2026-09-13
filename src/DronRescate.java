public class DronRescate extends EquipoEmergencia implements IVolador{
    public DronRescate(String nombre) {
        super(nombre);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Inpecciona zona de emergencia");
    }
    @Override
    public void volar() {
        System.out.println("Volar");
    }
}
