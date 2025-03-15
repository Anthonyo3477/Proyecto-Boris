package Model;

/**
 *
 * @author antho
 */
public class Producto {

    private String nombreProducto;
    private String catidadProducto;
    private String tipoProducto;
    private int precioProducto;

    public Producto() {
    }

    public Producto(String nombreProducto, String catidadProducto, String tipoProducto, int precioProducto) {
        this.nombreProducto = nombreProducto;
        this.catidadProducto = catidadProducto;
        this.tipoProducto = tipoProducto;
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCatidadProducto() {
        return catidadProducto;
    }

    public void setCatidadProducto(String catidadProducto) {
        this.catidadProducto = catidadProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", catidadProducto=" + catidadProducto + ", tipoProducto=" + tipoProducto + ", precioProducto=" + precioProducto + '}';
    }

}
