package gcda.presentation;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.application.ViewExpiredException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import gcda.business.BusinessException;
import gcda.business.User;

@ManagedBean
@SessionScoped
public class Login {
	
	private User usuario;
	String url;
	
	public Login() {
		try {
			usuario = new User();
		} catch (ViewExpiredException e) {
			System.out.println("ViewExpiredException");
		}
		
	}
		
	public User getUsuario() {
		return usuario;
	}
	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	public void goToIndex(){
		try {
			FacesContext.getCurrentInstance().getExternalContext()  
			.redirect("/CavCar/faces/index.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String botaoLogin()
	{
		/*FacesMessage message = new FacesMessage();
		UsuarioController controller = new UsuarioController();
		
		try {
			usuario = controller.consultaUsuario(usuario);
			message.setSeverity(FacesMessage.SEVERITY_INFO);
			message.setSummary("Acesso Permitido!");
			goToIndex();
		} catch (BusinessException e) {
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			message.setSummary("Usuario ou senha não conferem");
			System.out.println(e.getMessage());
		} 
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, message);*/
		return null;
	}
	
	public void isLogged(){
		/*if (this.usuario.getNome() == null){
			try {
				FacesContext.getCurrentInstance().getExternalContext()  
				.redirect("/CavCar/faces/login.xhtml");
			} catch (IOException e) {
				e.printStackTrace();
			}  
		}*/
	}
	
	public void logout(){
		usuario = new User();
		isLogged();
	}
}
