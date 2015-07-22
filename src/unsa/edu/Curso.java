package unsa.edu;
import java.util.*;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Curso {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String semestre;
	
	@Persistent
	private String nomcurso;
	
	@Persistent
	private int creditos;
	
	@Persistent
	private String codigo;
	
	@Persistent
	private String profesor;
	
	@Persistent
	private String deptacademico;
	
	@Persistent
	private int horas;
	
	
	@Persistent
		private ArrayList<Alumnos> alumnos=new ArrayList<Alumnos>();
	


	public Curso(String semestre, String nomcurso, int creditos, String codigo,
			String profesor, String deptacademico, int horas) {
		super();
		this.semestre = semestre;
		this.nomcurso = nomcurso;
		this.creditos = creditos;
		this.codigo = codigo;
		this.profesor = profesor;
		this.deptacademico = deptacademico;
		this.horas = horas;
	}

	public String getNomcurso() {
		return nomcurso;
	}

	public void setNomcurso(String nomcurso) {
		this.nomcurso = nomcurso;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public String getDeptacademico() {
		return deptacademico;
	}

	public void setDeptacademico(String deptacademico) {
		this.deptacademico = deptacademico;
	}
	
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	

	
	public Key getKey() {
		return key;
	}
	
	
	
	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public ArrayList<Alumnos> getAlumno() {
				return alumnos;
			}
		
			public void setAlumnos(ArrayList<Alumnos> alumnos) {
				this.alumnos = alumnos;
			}
	
	@Override
	public String toString() {
		String resp = nomcurso + " : " + creditos + " : " +codigo + " : " + profesor  +  " : " + deptacademico + " : " + horas + " : " ;  
		return resp;
	}
}
