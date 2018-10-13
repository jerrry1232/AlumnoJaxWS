package org.ceertificatic.service;

import java.util.List;

import javax.jws.WebService;

import org.ceertificatic.entity.Alumno;
@WebService
public interface AlumnoService {
	Alumno guardarAlumno(Alumno alumno);
	List<Alumno> obtenerAlumnos();
}
