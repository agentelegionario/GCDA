package gcda.presentation;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
@ManagedBean
public class MenuView {
     
    public void addVeiculo() {
        addMessage("Success data saved", "Data saved");
        System.out.println("Adicionar Veículo");
    }
     
    public void searchVeículo() {
        addMessage("Success", "Data updated");
        System.out.println("Editar Veículo");
    }
     
    public void delete() {
        addMessage("Success", "Data deleted");
        System.out.println("Delete");
    }
     
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
