package com.java;

public class Profesor extends Persona {

	private String IdProfesor;
	
	public Profesor(String nombre, String apellidos,int edad,String id) {
		super(nombre,apellidos,edad);
		IdProfesor=id;
	}

	public String getIdProfesor() {
		return IdProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		IdProfesor = idProfesor;
	}
	public void mostrarNombreApellidoYCarnet() {
		System.out.println("Profesor "+getNombre()+" "+getApellidos()+"con el id profesor"+" "+getIdProfesor());
	}
	
}
