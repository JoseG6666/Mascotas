public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarFicha() {
        System.out.println("Mascota: " + "| Nombre:" + nombre + "| Especie:" + especie + "| Edad:" + edad);

    }

    public int cumplirAnios() {
        edad = edad + 1;
        return edad;
    }

}