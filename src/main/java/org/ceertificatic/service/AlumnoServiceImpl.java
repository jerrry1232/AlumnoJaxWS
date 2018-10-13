package org.ceertificatic.service;

import java.util.List;

import javax.jws.WebService;

import org.ceertificatic.dao.AlumnoDao;
import org.ceertificatic.dao.AlumnoDaoImpl;
import org.ceertificatic.entity.Alumno;

 
@WebService(endpointInterface="org.ceertificatic.service.AlumnoService")  
public class AlumnoServiceImpl implements AlumnoService {

	 AlumnoDao alumnoDao = new AlumnoDaoImpl();
	 
	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		
		return alumnoDao.guardarAlumno(alumno);
	}

	@Override
	public List<Alumno> obtenerAlumnos() {
		return alumnoDao.obtenerAlumnos();
	}

}
