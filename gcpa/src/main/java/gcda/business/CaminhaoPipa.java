package gcda.business;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GCDA_CAMI_PIPA")
public class CaminhaoPipa {

	private Integer placa;
	private String marca;
	private String modelo;
	private Integer capacidade;
	private Cidade cidade;
	private List<Entrega> entregas;
	
	@Id
	@Column(name="PIPA_PLA")
	public Integer getPlaca() {
		return placa;
	}
	@Column(name="PIPA_MARC")
	public String getMarca() {
		return marca;
	}
	@Column(name="PIPA_MOD")
	public String getModelo() {
		return modelo;
	}
	@Column(name="PIPA_CAP")
	public Integer getCapacidade() {
		return capacidade;
	}
	@ManyToOne
	public Cidade getCidade() {
		return cidade;
	}
	@OneToMany(mappedBy="pipa")
	public List<Entrega> getEntregas() {
		return entregas;
	}
	public void setEntregas(List<Entrega> entregas) {
		this.entregas = entregas;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public void setPlaca(Integer placa) {
		this.placa = placa;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	
	
}
