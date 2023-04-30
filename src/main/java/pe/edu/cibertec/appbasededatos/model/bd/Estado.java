package pe.edu.cibertec.appbasededatos.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Estado {
	
	@Id
	@Column(name= "idestado")
	private Integer idEstado;
	@Column(name= "descestado")
	private String descEstado;

}
