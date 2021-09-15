/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author yesen
 */
public class Comercial extends Empleado {

    //protected double comision;
    private double comision; //Como ya no se van a tener clases hijas de esta clase

    /*CONSTRUCTOR*/

    public Comercial() {
    }

    public Comercial(double comision) {
        this.comision = comision;
    }
    
   
    public Comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    /*Métodos getters y setters*/
    public double getComision() {
        return this.comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("comision=").append(this.comision);
        sb.append(',');
        sb.append(super.toString());
        return sb.toString();
    }

    @Override
    public boolean bonificacion() {
        if (super.getEdad() > 30 && this.comision > 400.000) {
            double nuevoSalario = super.getSalario() + super.bonificacion;
            super.setSalario(nuevoSalario);
            System.out.println("Se le añadio la bonificacion al empleado" + " " + super.getNombre());
            return true;
        }
        return false;
    }

}



