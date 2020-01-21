
public class Producto {

    private Double precio;
    private Integer porcentajeDescuento;

    public Double getPrecio() {
        if (tieneDescuento()){

        }
        return precio;
    }

    private boolean tieneDescuento() {
        return porcentajeDescuento != null && porcentajeDescuento > 0;
    }
}

