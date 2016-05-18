package gcda.business;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GCPA_ROTA")
public class Rota {
	
	private Integer id;
	private PAbastecimento pa;
	private Manancial manancial;
	private Double distancia;
	private Date dataCadastro;
	private List<Entrega> entregas;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ROTA_ID")
	public Integer getId() {
		return id;
	}
	@ManyToOne(cascade=CascadeType.ALL)
	public PAbastecimento getPa() {
		return pa;
	}
	@ManyToOne(cascade=CascadeType.ALL)
	public Manancial getManancial() {
		return manancial;
	}
	@Column(name="ROTA_DIST")
	public Double getDistancia() {
		return distancia;
	}
	@Column(name="ROTA_DT_CAD")
	public Date getDataCadastro() {
		return dataCadastro;
	}
	@OneToMany(mappedBy="rota")
	public List<Entrega> getEntregas() {
		return entregas;
	}
	public void setEntregas(List<Entrega> entregas) {
		this.entregas = entregas;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setPa(PAbastecimento pa) {
		this.pa = pa;
	}
	public void setManancial(Manancial manancial) {
		this.manancial = manancial;
	}
	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	

}
