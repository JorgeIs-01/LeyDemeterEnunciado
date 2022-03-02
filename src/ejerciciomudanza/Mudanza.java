package ejerciciomudanza;
import java.util.List;

public class Mudanza {

	private Empresa empresa;
	private Double distancia;
	private Integer fechaFinal;
	private Integer fechaInicio;
	private Double extraPerDay;
	private List<Objeto> objetos;
	private List<Operario> operarios;
	private List<Lugar> lugar;
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

	public Integer getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Integer fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Integer getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Integer fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Double getExtraPerDay() {
		return extraPerDay;
	}

	public void setExtraPerDay(Double extraPerDay) {
		this.extraPerDay = extraPerDay;
	}

	public List<Objeto> getObjetos() {
		return objetos;
	}

	public void setObjetos(List<Objeto> objetos) {
		this.objetos = objetos;
	}

	public List<Operario> getOperario() {
		return operarios;
	}

	public void setOperario(List<Operario> operarios) {
		this.operarios = operarios;
	}

	public List<Lugar> getLugar() {
		return lugar;
	}

	public void setLugar(List<Lugar> lugar) {
		this.lugar = lugar;
	}
	
	
	
	
}
