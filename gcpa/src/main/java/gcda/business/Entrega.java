package gcda.business;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="GCPA_ENTREGA")
public class Entrega {

	private Integer id;
	private Date dataManancial;
	private Date dataPA;
	private Rota rota;
	private CaminhaoPipa pipa;
	
	@Id
	@Column(name="ENTREGA_ID")
	public Integer getId() {
		return id;
	}
	@Column(name="ENTREGA_DT_MAN")
	public Date getDataManancial() {
		return dataManancial;
	}
	@Column(name="ENTREGA_DT_PA")
	public Date getDataPA() {
		return dataPA;
	}
	@ManyToOne
	public Rota getRota() {
		return rota;
	}
	@ManyToOne
	public CaminhaoPipa getPipa() {
		return pipa;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setDataManancial(Date dataManancial) {
		this.dataManancial = dataManancial;
	}
	public void setDataPA(Date dataPA) {
		this.dataPA = dataPA;
	}
	public void setRota(Rota rota) {
		this.rota = rota;
	}
	public void setPipa(CaminhaoPipa pipa) {
		this.pipa = pipa;
	}
	
	
}
