package gcda.business;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="GCDA_CIDADE")
@Entity
public class Cidade {

	private Integer id;
	private String nome;
	private String estado;
	private OrgMilitar orgMilitar;
	
	private List<Manancial> mananciais;
	private List<PAbastecimento> PAs;
	private List<CaminhaoPipa> pipas;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CIDADE_ID")
	public Integer getId() {
		return id;
	}
	@Column(name="CIDADE_NM")
	public String getNome() {
		return nome;
	}
	@Column(name="CIDADE_EST")
	public String getEstado() {
		return estado;
	}
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	public OrgMilitar getOrgMilitar() {
		return orgMilitar;
	}
	@OneToMany(mappedBy="cidade")
	public List<Manancial> getMananciais() {
		return mananciais;
	}
	@OneToMany(mappedBy="cidade")
	public List<PAbastecimento> getPAs() {
		return PAs;
	}
	@OneToMany(mappedBy="cidade")
	public List<CaminhaoPipa> getPipas() {
		return pipas;
	}
	public void setPipas(List<CaminhaoPipa> pipas) {
		this.pipas = pipas;
	}
	public void setPAs(List<PAbastecimento> pAs) {
		PAs = pAs;
	}
	public void setOrgMilitar(OrgMilitar orgMilitar) {
		this.orgMilitar = orgMilitar;
	}
	public void setMananciais(List<Manancial> mananciais) {
		this.mananciais = mananciais;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
