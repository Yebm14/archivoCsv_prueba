/*
 
 */
package domain;

/**
 *
 * @author yesen
 */
public class Repartidor extends Empleado {

    protected String zona;

    /*CONSTRUCTOR*/

    public Repartidor() {
    }

    public Repartidor(String zona) {
        this.zona = zona;
    }
    
    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    /*Métodos getters y setters*/
    public String getZona() {
        return this.zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("zona=").append(zona);
        sb.append(',');
        sb.append(super.toString());

        return sb.toString();
    }

    @Override
    public boolean bonificacion() {
        if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("zona 3")) {
            double nuevoSalario = super.getSalario() + super.bonificacion;
            super.setSalario(nuevoSalario);
            System.out.println("Se le añadio la bonificacion al empleado " + super.getNombre());
            return true;
        }
        return false;
    }

}



