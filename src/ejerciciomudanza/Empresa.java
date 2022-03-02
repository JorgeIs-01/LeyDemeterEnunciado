package ejerciciomudanza;
import java.util.List;

public class Empresa {
	
	private String id; 
	private String nombre; 
	private Double precioKM; 
	private Double comisionOperario; 
	private List<Operario> operarios; 
	private List<Mudanza> mudanzas; 

	public Double getPrecioKM() {
	 return precioKM; 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getComisionOperario() {
		return comisionOperario;
	}

	public void setComisionOperario(Double comisionOperario) {
		this.comisionOperario = comisionOperario;
	}

	public List<Operario> getOperarios() {
		return operarios;
	}

	public void setOperarios(List<Operario> operarios) {
		this.operarios = operarios;
	}

	public List<Mudanza> getMudanzas() {
		return mudanzas;
	}

	public void setMudanzas(List<Mudanza> mudanzas) {
		this.mudanzas = mudanzas;
	}

	public void setPrecioKM(Double precioKM) {
		this.precioKM = precioKM;
	}
	
	
	

}
