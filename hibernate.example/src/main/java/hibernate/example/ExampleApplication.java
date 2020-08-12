package hibernate.example;

import hibernate.example.dao.AlumnoDao;
import hibernate.example.entity.Alumno;

public class ExampleApplication {
	
	public static void main(String[] args) {
	
		AlumnoDao alumnoDao = new AlumnoDao();
		
		alumnoDao.createAlumno(new Alumno(1, "Jose", "Perez"));
		alumnoDao.createAlumno(new Alumno(2, "Esteban", "Quito"));
		alumnoDao.createAlumno(new Alumno(3, "Ulrica", "Godofreda"));
		
		alumnoDao.updateAlumno(new Alumno(2, "Estefano", "Quito"));
		
		alumnoDao.removeAlumno(new Alumno(1, "Jose", "Perez"));
		
		System.out.println(alumnoDao.getAlumnos());
		

	}

}
