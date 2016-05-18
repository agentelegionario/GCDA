package gcda.util;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class StatusEnum {
	
	String statusSelected;
	OpcoesStatus[] status;
	
	public enum OpcoesStatus {	
		ATIVO("ATIVO"), INATIVO("INATIVO");
		
		private final String valor;
		OpcoesStatus(String valorOpcao){
			valor = valorOpcao;
		}
		public String getValor(){
			return valor;
		}
	}
	
	public String getStatusSelected() {
		return statusSelected;
	}
	
	public OpcoesStatus[] getStatus() {
		status = OpcoesStatus.values();
		return status;
	}
	public void setStatus(OpcoesStatus[] status) {
		this.status = status;
	}
	public void setStatusSelected(String statusSelected) {
		this.statusSelected = statusSelected;
	}
}