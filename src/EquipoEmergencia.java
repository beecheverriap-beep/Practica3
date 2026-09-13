public abstract class EquipoEmergencia {
    private String nombre;

    public void mostrarNombre(){
        System.out.println(nombre + "_");
    }
    public abstract void atenderEmergencia();
}
