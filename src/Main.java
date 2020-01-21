
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente unCliente = new Cliente();
		Administrador unAdministrador = new Administrador("Pepe","Mujica","uruguayNomas","pepito@mujico.uy","3");
		
		Carrito unCarrito = new Carrito(unCliente);
		Carrito dosCarrito = new Carrito(unAdministrador);
		
		System.out.println(unCarrito);
		//cliente.registrar = 
		

	}
}

	
	
	
	


