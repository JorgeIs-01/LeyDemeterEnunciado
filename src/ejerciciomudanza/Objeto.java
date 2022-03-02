package ejerciciomudanza;

public class Objeto {

	private Integer id;
	private String nombre;
	private String tipoObjeto;
	private Double precio;
	private Boolean necesitaMontaje;

	public Double getPrecio() {
		return precio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoObjeto() {
		return tipoObjeto;
	}

	public void setTipoObjeto(String tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}

	public Boolean getNecesitaMontaje() {
		return necesitaMontaje;
	}

	public void setNecesitaMontaje(Boolean necesitaMontaje) {
		this.necesitaMontaje = necesitaMontaje;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	

}
