package com;

public class OperadoraClaro {

	String nombre, apellido, cedula, servicio;
	int turnoAsignado;
	static int numTurno = 0;
	
	//CONSTRUCTOR VACIO (CONSTRUCTOR POR DEFECTO) QUE SE ASIGNA AUTOMATICAMENTE
	public OperadoraClaro() {
		
	}
	
	/*public OperadoraClaro() {
		numTurno++;
		turnoAsignado = numTurno;
		System.out.println(turnoAsignado);
	}*/
	
	//CONSTRUCTOR INICIALIZA LAS INSTANCIAS 
	//CONSTRUCTOR DEFINIDO POR EL USUARIO
	//CONSTRUCTOR PERSONALIZADO SOBRRESCRIBE EL CONSTRUCTOR POR DEFECTO
	public OperadoraClaro(String nombre, String apellido, String cedula, String servicio) {
		nombre = nombre;
		apellido = apellido;
		cedula = cedula;
		servicio = servicio;
		numTurno++;
		turnoAsignado = numTurno;
	}
	
	
	public void IngresarServicios(String nombre1,String apellido1,String cedula1) {
		this.nombre = nombre1;
		this.apellido = apellido1;
		this.cedula = cedula1;
	}
	
	public void generarServicio(String servicio1) {
		this.servicio = servicio1;
		numTurno++;
		this.turnoAsignado = numTurno;
	}
	//METODO SOBRECARGADO QUE ME PERMITE FUCIONAR LOS DOS METODOS ANTERIORES
	//NO SERIA NECESARIO ESTE METODO YA QUE LO HAGO DIRECTAMENTE EN EL CONSTRUCTOR
	public String IngresarServicios(String nombre1,String apellido1,String cedula1, String servicio1) {
		this.nombre = nombre1;
		this.apellido = apellido1;
		this.cedula = cedula1;
		this.servicio = servicio1;
		numTurno++;
		this.turnoAsignado = numTurno;
		return "Usuario ingresado correctamente";
	}
	
	public void imprimirInfo() {
		System.out.println("__________________________________________");
		System.out.println("------------INFORMACION USUARIO-----------");
		System.out.println("---Nombre: " + nombre + " " + apellido +".");
		System.out.println("---Cedúla: " + cedula + ".");
		System.out.println("---#Turno: " + turnoAsignado + ".");
		System.out.println("---Tipo Servicio: " + servicio + ".");	
	}
	
	public void asignarCubiculo(int cubiculoLibre, String servicio) {
		System.out.println("------------------------------------------");	
		System.out.println("*****CUBICULO DISPONIBLE*****");
		System.out.println("--Pasar al cubículo: #" + cubiculoLibre + "." + "\nAl servicio: " + servicio);
		System.out.println("__________________________________________");
	}
	//METODO SOBRECARGADO CON LOS PARAMETROS CAMBIADOS EL ORDEN
	public void asignarCubiculo(String servicio, int cubiculoLibre) {
		System.out.println("------------------------------------------");	
		System.out.println("*****CUBICULO DISPONIBLE*****");
		System.out.println("--Pasar al cubículo: #" + cubiculoLibre + "." + "\nAl servicio: " + servicio);
		System.out.println("__________________________________________");
	}
	
	
}
