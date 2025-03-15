
package Model;

/**
 *
 * @author antho
 */
public class Trabajador {

    private String nombreCompleto;
    private String rutT;
    private String contraseñaT;
    private int numeroT;

    public Trabajador() {
    }

    public Trabajador(String nombreCompleto, String rutT, String contraseñaT, int numeroT) {
        this.nombreCompleto = nombreCompleto;
        this.rutT = rutT;
        this.contraseñaT = contraseñaT;
        this.numeroT = numeroT;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRutT() {
        return rutT;
    }

    public void setRutT(String rutT) {
        this.rutT = rutT;
    }

    public String getContraseñaT() {
        return contraseñaT;
    }

    public void setContraseñaT(String contraseñaT) {
        this.contraseñaT = contraseñaT;
    }

    public int getNumeroT() {
        return numeroT;
    }

    public void setNumeroT(int numeroT) {
        this.numeroT = numeroT;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombreCompleto=" + nombreCompleto + ", rutT=" + rutT + ", contrase\u00f1aT=" + contraseñaT + ", numeroT=" + numeroT + '}';
    }

}
