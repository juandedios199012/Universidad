package com.java;

public class Catedratico extends Profesor  {

	private String direccion;
	
	public Catedratico(String nombre, String apellidos,int edad,String id,String direccion) {
		super(nombre,apellidos,edad,id);
		this.direccion=direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void mostrarNombreApellidoYDireccion() {
		System.out.println("Catedratico"+getNombre()+"  "+getApellidos()+"con el id catedratico:"+" "+getIdProfesor()+" "+"Direccion  "+getDireccion());
	}
	
}
