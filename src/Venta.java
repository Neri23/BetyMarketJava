import java.sql.Date;
import java.util.List;

public class Venta {
	
	private String metodoPago;
    private Date fecha;
    private Double precioFinal;
    private List<Producto>Productos;
    private Usuario usuario;
    
    
    

    public Venta(String metodoPago, Date fecha, Double precioFinal) {
        this.metodoPago = metodoPago;
        this.fecha = fecha;
        this.precioFinal = precioFinal;
    }




}
