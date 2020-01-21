import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	private Integer id;
	private Usuario usuario;
	private List<Producto> productos;
	
	public Carrito(Usuario usuario) {
		this.usuario = usuario;
		this.productos = new ArrayList<>();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Integer getTotalProductos(){
      return productos.size();
  }
	
	public Double getTotalPrecio(){
      Double contador = 0.0;
      for (Producto producto : productos) {
          contador += producto.getPrecio();
      }

      return contador;
  }


}
