package gcda.business;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Table(name="GCDA_OM")
@Entity
@XmlRootElement
public class OrgMilitar {

	private Integer id;
	private String nome;
	private String sigla;
	private List<Cidade> cidades;
	
	@Id
	@Column(name="OM_ID")
	public Integer getId() {
		return id;
	}
	@Column(name="OM_NM")
	public String getNome() {
		return nome;
	}
	@Column(name="OM_SIGL")
	public String getSigla() {
		return sigla;
	}
	@OneToMany(mappedBy="orgMilitar", fetch=FetchType.EAGER)
	public List<Cidade> getCidades() {
		return cidades;
	}
	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	@Override
	public String toString() {
		return "OrgMilitar [id=" + id + ", nome=" + nome + ", sigla=" + sigla + ", cidades=" + cidades + "]";
	}
	
	
}
