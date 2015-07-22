package unsa.edu;
import java.util.ArrayList;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Profesor {
	@PrimaryKey
	
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String Nombre;
	@Persistent
	private String ApellidoPaterno;
	@Persistent
	private String ApellidoMaterno;
	@Persistent
	private String DNI;
	@Persistent
	private String Direccion;
	@Persistent
	private String Departamento;
	@Persistent
	private String Provincia;
	@Persistent
	private String Distrito;
	@Persistent
	private String FechaNacimiento;
	@Persistent
	private String Sexo;
	@Persistent
	private String Telefono;
	@Persistent
	private String GradoAcademico;
	@Persistent
	private String DepartamentoAcademico;
	@Persistent
	private ArrayList<Curso>cursos=new ArrayList<Curso>();
	
	public Profesor (String DNI, String Nombre,String ApellidoPaterno, String ApellidoMaterno,String FechaNacimiento,String Sexo, 
			String Direccion,String Departamento,String Provincia,String Distrito, String Telefono,
			String GradoAcademico, String DepartamentoAcademico){
		
		this.Nombre = Nombre;
		this.ApellidoPaterno =ApellidoPaterno;
		this.ApellidoMaterno =ApellidoMaterno;
		this.DNI = DNI;
		this.FechaNacimiento = FechaNacimiento;
		this.Sexo = Sexo;
		this.Direccion = Direccion;
		this.Departamento = Departamento;
		this.Provincia = Provincia;
		this.Distrito = Distrito;
		this.Telefono = Telefono;
		this.GradoAcademico = GradoAcademico;
		this.DepartamentoAcademico = DepartamentoAcademico;
		}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		ApellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		ApellidoMaterno = apellidoMaterno;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	public String getDistrito() {
		return Distrito;
	}
	public void setDistrito(String distrito) {
		Distrito = distrito;
	}
	public String getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getGradoAcademico() {
		return GradoAcademico;
	}
	public void setGradoAcademico(String gradoAcademico) {
		GradoAcademico = gradoAcademico;
	}
	public String getDepartamentoAcademico() {
		return DepartamentoAcademico;
	}
	public void setDepartamentoAcademico(String departamentoAcademico) {
		DepartamentoAcademico = departamentoAcademico;
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
}