import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	public static Clientes subMenuCliente() throws IOException {
        java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        //Inicializacion datos cliente
        String nombre = null;
        String apellido = null;
        String email = null;
        int telefono = 0;
        String calle = null;
        int numero = 0;
        int cp = 0;
        String poblacion = null;
        String pais = null;

        System.out.println("Introduce datos del cliente:");
        //Introduccion de datos cliente por el usuario
        System.out.println("Introduce nombre:");
        nombre = in.readLine();
        System.out.println("Introduce apellidos:");
        apellido = in.readLine();
        System.out.println("Introduce email:");
        email = in.readLine();
        while(!email.contains("@")) {
            System.out.println("Email no valido");
            System.out.println("Introduce email:");
            email = in.readLine();
        }
        System.out.println("Introduce telefono:");
        telefono = Integer.parseInt(in.readLine());;
        System.out.println("Introduce direccion");
        System.out.println("Calle:");
        calle = in.readLine();
        System.out.println("Numero:");
        numero = Integer.parseInt(in.readLine());;
        System.out.println("Codigo Postal:");
        cp = Integer.parseInt(in.readLine());;
        System.out.println("Poblacion:");
        poblacion = in.readLine();
        System.out.println("Pais:");
        pais = in.readLine();
        System.out.println("---FIN DE CLIENTE---");

        Clientes c = new Clientes(nombre, apellido, email, telefono, calle, numero, cp, poblacion, pais);
        return c;

    }
	public static Producto subMenuProducto() throws NumberFormatException, IOException {
        java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        //Inicializacion de datos de producto
        int codigo = 0;
        String nombre = null;
        String descripcion = null;
        int stock = 0;
        char pasillo = ' ';
        int estanteria = 0;
        int estante = 0;
        boolean estado = false;
        String estado_aux = null;
        System.out.println("Introduce datos del producto:");
        //Introducción de datos por el usuario
        System.out.println("Introduce codigo de 10 números:");
        codigo = Integer.parseInt(in.readLine());;
        System.out.println("Introduce nombre:");
        nombre = in.readLine();
        System.out.println("Introduce descripcion:");
        descripcion = in.readLine();
        System.out.println("Introduce stock:");
        stock = Integer.parseInt(in.readLine());;
        System.out.println("Introduce la localización del producto en el almacen:");
        System.out.println("Pasillo (A-Z):");
        pasillo = (in.readLine()).charAt(0);
        System.out.println("Estanteria (0-10):");
        estanteria = Integer.parseInt(in.readLine());;
        System.out.println("Introduce estante (0-5):");
        estante = Integer.parseInt(in.readLine());;
        System.out.println("---Fin de localización---");
        System.out.println("Introduce si el producto está en almacen (y/n):");
        estado_aux = in.readLine();
        if (estado_aux == "y"  estado_aux == "yes"  estado_aux == "si") {
            estado = true;
        }else if(estado_aux == "n" || estado_aux== "no"){
            estado = false;
        }
        System.out.println("---FIN DE PRODUCTO---");

        Producto p = new Producto(codigo, nombre, descripcion, stock, pasillo,
                estanteria, estante, estado);
        return p;
    }

}
