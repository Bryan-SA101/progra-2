package com;

public class OperadoraClaro {

	String nombre, apellido, cedula, servicio;
	int turnoAsignado;
	static int numTurno = 0;
	
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
	
	public void imprimirInfo() {
		System.out.println("__________________________________________");
		System.out.println("------------INFORMACION USUARIO-----------");
		System.out.println("---Nombre: " + nombre + " " + apellido +".");
		System.out.println("---Cedúla: " + cedula + ".");
		System.out.println("---#Turno: " + turnoAsignado + ".");
		System.out.println("---Tipo Servicio: " + servicio + ".");	
	}
	
	public void asignarCubiculo(int cubiculoLibre) {
		System.out.println("------------------------------------------");	
		System.out.println("*****CUBICULO DISPONIBLE*****");
		System.out.println("--Pasar al cubículo: #" + cubiculoLibre + ".");
		System.out.println("__________________________________________");
	}
	
}
