/*
 Reto técnico TCS
 */
package domain;

/**
 *
 * @author yesen
 */
public abstract class Empleado {

    protected String nombre;
    protected int edad;
    protected double salario;
    protected final double bonificacion = 150000.0;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

//    public double getBonificacion() {
//        return this.bonificacion;
//    }
//
//    public void setBonificacion(double bonificacion) {
//        this.bonificacion = bonificacion;
//    }

    /*toString para imprimir todo*/
//    @Override
//    public String toString() {
//        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", bonificacion=" + bonificacion + '}';
//    }
    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", ";
    }

    public abstract boolean bonificacion();

}





