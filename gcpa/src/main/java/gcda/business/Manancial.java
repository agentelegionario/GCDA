package gcda.business;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GCPA_MANANCIAL")
public class Manancial {

	private Integer id;
	private String nome;
	private Double longitude;
	private Double Latitude;
	private String tipo;
	private Cidade cidade;
	private List<Rota> rotas;
	
	@Id
	@Column(name="MAN_ID")
	public Integer getId() {
		return id;
	}
	@Column(name="MAN_NM")
	public String getNome() {
		return nome;
	}
	@Column(name="MAN_LON")
	public Double getLongitude() {
		return longitude;
	}
	@Column(name="MAN_LAT")
	public Double getLatitude() {
		return Latitude;
	}
	@Column(name="MAN_TIP")
	public String getTipo() {
		return tipo;
	}
	@ManyToOne
	@JoinColumn(name="MAN_CID")
	public Cidade getCidade() {
		return cidade;
	}
	@OneToMany(mappedBy="manancial")
	public List<Rota> getRotas() {
		return rotas;
	}
	public void setRotas(List<Rota> rotas) {
		this.rotas = rotas;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public void setLatitude(Double latitude) {
		Latitude = latitude;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "Manancial [id=" + id + ", nome=" + nome + ", longitude=" + longitude + ", Latitude=" + Latitude
				+ ", tipo=" + tipo + ", cidade=" + cidade + ", rotas=" + rotas + "]";
	}
	
	
}
