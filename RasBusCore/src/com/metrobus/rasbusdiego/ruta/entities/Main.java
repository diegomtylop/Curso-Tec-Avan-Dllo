package com.metrobus.rasbusdiego.ruta.entities;

public class Main {
	
	public static void main( String[] args ){
		Recorrido r = new Recorrido();
		
		System.out.println( "Empezamos");
		int numLineas = 10;
		
		for( int i = 0; i <= numLineas; i++ ){
			Linea l = crearLinea();
			r.addLinea(l);
		}
		
		System.out.println( r );
	}

	private static Linea crearLinea() {
		// TODO Auto-generated method stub
		
		
		Punto p1 = crearPunto();
		Punto p2 = crearPunto();
		
		double distancia = Math.random()*1000;
		Linea l = new Linea(p1,p2, distancia);
			
		return l;
	}

	private static Punto crearPunto() {
		// TODO Auto-generated method stub
		Punto p = new Punto((long)(Math.random()*1000), (long)(Math.random()*1000));
		return p;
	}
}
