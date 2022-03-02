package ejerciciomudanza;

import java.util.List;

public class Cliente {
	
	private String id; 
	private String nombre; 
	private String email; 
	private Boolean suscrito; 
	private String razonDesuscrito; 
	private List<Mudanza> mudanzas; 
	
	public Double getTotalCost() { 
	
		Double total = 0.0; 
		for (Mudanza m : mudanzas) { 
			List<Objeto> items = m.getObjetos(); 
			for (Objeto i : items) { 
				total += i.getPrecio(); 
			}
			Empresa c = m.getEmpresa();
			total += m.getDistancia()* c.getPrecioKM(); 
			if(m instanceof MultiplesDias) { 
			  Integer extraDays = m.getFechaFinal() - m.getFechaInicio();       
			  total += extraDays * m.getExtraPerDay(); 
			}
		} 
		return total; 
	}

}
