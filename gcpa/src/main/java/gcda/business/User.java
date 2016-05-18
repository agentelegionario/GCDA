package gcda.business;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Email;


@Entity
@Table(name="USE_USER")
public class User {
	
	private Integer siap;
	private String name;
	private String password;
	private String email;
	private String phone;
	private Date timeStamp;
	

	@Id
	@Column(name="USE_SIAP")
	public Integer getSiap() {
		return siap;
	}
	@Column(name="USE_NM", unique=true)
	public String getName() {
		return name;
	}
	
	@Column(name="USE_SENHA")
	public String getPassword() {
		return password;
	}
	@Column(name="USE_EMAIL", unique=true)
	@Email(message="Informe um email v�lido.")
	public String getEmail() {
		return email;
	}
	@Column(name="USE_TEL")
	public String getPhone() {
		return phone;
	}
	@Column(name="USER_DATA_CAD")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getTimeStamp() {
		return timeStamp;
	}
	
	public void setSiap(Integer siap) {
		this.siap = siap;
	}
	public void setName(String nome) {
		this.name = nome;
	}
	public void setPassword(String senha) {
		this.password = senha;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String tel) {
		this.phone = tel;
	}
	public void setTimeStamp(Date dataCadastro) {
		this.timeStamp = dataCadastro;
	}
	@Override
	public String toString() {
		return "Usuario [siap=" + siap + ", nome=" + name + ", senha=" + password
				+ ", email=" + email + ", tel=" + phone + ", dataCadastro="
				+ timeStamp + "]";
	}
	

}
