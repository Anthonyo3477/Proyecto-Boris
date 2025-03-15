
package Model;

/**
 *
 * @author antho
 */
public class Cliente {

    private String nombreCompleto;
    private String rut;
    private String contraseña;
    private int numero;

    public Cliente() {
    }

    public Cliente(String nombreCompleto, String rut, String contraseña, int numero) {
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
        this.contraseña = contraseña;
        this.numero = numero;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCompleto=" + nombreCompleto + ", rut=" + rut + ", contrase\u00f1a=" + contraseña + ", numero=" + numero + '}';
    }

}
