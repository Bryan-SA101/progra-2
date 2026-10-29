package com;

public class Principal {
	
	public static void main(String[] args) {
		
		OperadoraClaro op = new OperadoraClaro();
		
		//op.IngresarServicios("Ismael", "Sanchez", "1729097062");
		op.IngresarServicios("Luis", "Pichuco", "20405078952", "Cierre de línea");
		//op.generarServicio("Cambio de Línea");
		op.imprimirInfo();
		op.asignarCubiculo(5, "Cierre de línea"); //METODO 1
		
		OperadoraClaro op1 = new OperadoraClaro("A","B","C","D"); //CONSTRUCTOR PERSONALIZADO
		
	
		
		/*op.IngresarServicios("Brayan", "Albarracín", "1729094058");
		op.generarServicio("Servicio al cliente");
		op.imprimirInfo();
		op.asignarCubiculo(9);
		
		op.IngresarServicios("Shirley", "Campaña", "1729153069");
		op.generarServicio("Renovación de Línea");
		op.imprimirInfo();
		op.asignarCubiculo(2);*/
		
	}
}
