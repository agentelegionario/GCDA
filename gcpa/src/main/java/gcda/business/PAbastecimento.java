package gcda.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="GCDA_PA")
@Entity
public class PAbastecimento {

	private Integer id;
	private Double longitude;
	private Double latitude;
	private Integer volume;
	private Integer numeroDePessoas;
	private String bairro;
	private String resposavel;
	private Cidade cidade;
	private List<Rota> rotas;
	
	public PAbastecimento() {
		rotas = new ArrayList<>();
	}
	@Id
	@Column(name="PA_ID")
	public Integer getId() {
		return id;
	}
	@Column(name="PA_LON")
	public Double getLongitude() {
		return longitude;
	}
	@Column(name="PA_LAT")
	public Double getLatitude() {
		return latitude;
	}
	@Column(name="PA_VOL")
	public Integer getVolume() {
		return volume;
	}
	@Column(name="PA_NUM_PESS")
	public Integer getNumeroDePessoas() {
		return numeroDePessoas;
	}
	@Column(name="PA_BAI")
	public String getBairro() {
		return bairro;
	}
	@Column(name="PA_RESP")
	public String getResposavel() {
		return resposavel;
	}
	@ManyToOne(cascade=CascadeType.ALL)
	public Cidade getCidade() {
		return cidade;
	}
	@OneToMany(mappedBy="pa", cascade=CascadeType.ALL)
	public List<Rota> getRotas() {
		return rotas;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public void setNumeroDePessoas(Integer numeroDePessoas) {
		this.numeroDePessoas = numeroDePessoas;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setResposavel(String resposavel) {
		this.resposavel = resposavel;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public void setRotas(List<Rota> rotas) {
		this.rotas = rotas;
	}
	@Override
	public String toString() {
		return "PAbastecimento [id=" + id + ", longitude=" + longitude + ", latitude=" + latitude + ", volume=" + volume
				+ ", numeroDePessoas=" + numeroDePessoas + ", bairro=" + bairro + ", resposavel=" + resposavel
				+ ", cidade=" + cidade + ", rotas=" + rotas + "]";
	}
	
	
}
