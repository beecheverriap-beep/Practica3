public abstract class EquipoEmergencia {
    private String nombre;

    public EquipoEmergencia(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarNombre(){
        System.out.println(nombre + "_");
    }
    public abstract void atenderEmergencia();
}
