package org.ceertificatic.dao;

import java.util.ArrayList;
import java.util.List;
import org.ceertificatic.entity.Alumno;


public class AlumnoDaoImpl  implements AlumnoDao{

	static List <Alumno> alumnos = new ArrayList<>();
	
	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		alumnos.add(alumno);
		return alumno;
	}

	@Override
	public List<Alumno> obtenerAlumnos() {
		return alumnos;
	}

}
