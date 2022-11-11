package RepositorioClases.JUnit.Ejercicio2;

public class Usuario {
    private String nombre;
    private String contrasena;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void concatenarNombre(Ejercicios.Ejercicio2.Usuario u) {
        this.nombre = this.nombre + "" +u.getNombre();
    }

    public Ejercicios.Ejercicio2.Usuario crearMezclado(Ejercicios.Ejercicio2.Usuario u) {
        return new Ejercicios.Ejercicio2.Usuario(u.getNombre(), this.contrasena);
    }
}