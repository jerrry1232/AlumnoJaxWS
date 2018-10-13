package org.ceertificatic.dao;

import java.util.List;

import org.ceertificatic.entity.Alumno;

public interface AlumnoDao {
	/*
	 * metodos abstractos
	 */
	Alumno guardarAlumno(Alumno alumno);
	List<Alumno> obtenerAlumnos();
}
