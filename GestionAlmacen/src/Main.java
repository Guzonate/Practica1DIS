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

}
