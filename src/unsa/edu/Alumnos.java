package unsa.edu;

import java.util.*;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Alumnos {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String cui;

	@Persistent
	private String semestre;
	
	@Persistent
	private String nombre;
	
	@Persistent
	private String apellidoPaterno;
	
	@Persistent
	private String apellidoMaterno;
	
	@Persistent
	private String nombreAp;
	
	@Persistent
	private String direccionAp;
	@Persistent
	private String telefonoAp;
	
	@Persistent
	private String dni;
	
	@Persistent
	private String direccion;
	
	@Persistent
	private String ciudad;
	
	@Persistent
	private String distrito;
	
	@Persistent
	private String nacimiento;
	
	@Persistent
	private String numTelefono;
	
	@Persistent
	private String sexo;
	
	@Persistent
	private ArrayList<Curso> cursos=new ArrayList<Curso>();
	
	public Alumnos(String cui, String nombre, String apellidoPaterno,
			String apellidoMaterno, String nombreAp, String direccionAp,
			String telefono, String dni, String direccion, String ciudad,
			String distrito, String nacimiento, String numTelefono, String sexo,String semestre) {
		super();
		this.cui = cui;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombreAp = nombreAp;
		this.direccionAp = direccionAp;
		this.telefonoAp = telefono;
		this.dni = dni;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.distrito = distrito;
		this.nacimiento = nacimiento;
		this.numTelefono = numTelefono;
		this.sexo = sexo;
		this.semestre=semestre;
	}

	public String getCui() {
		return cui;
	}

	public void setCui(String cui) {
		this.cui = cui;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombreAp() {
		return nombreAp;
	}

	public void setNombreAp(String nombreAp) {
		this.nombreAp = nombreAp;
	}

	public String getDireccionAp() {
		return direccionAp;
	}

	public void setDireccionAp(String direccionAp) {
		this.direccionAp = direccionAp;
	}

	public String getTelefonoAp() {
		return telefonoAp;
	}

	public void setTelefonoAp(String telefonoAp) {
		this.telefonoAp = telefonoAp;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	
	
}