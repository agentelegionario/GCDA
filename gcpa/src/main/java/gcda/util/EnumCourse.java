package gcda.util;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EnumCourse {


	
	String courseSelected;
	OpcoesCourse[] course;
	
	public enum OpcoesCourse {	
		GRADUACAO("GRADUAÇÃO"), 
		EPECIALIZACAO("ESPECIALIZAÇÃO"), 
		MESTRADO("MESTRADO"), 
		DOUTORADO("DOUTORADO");
		
		private final String valor;
		OpcoesCourse(String valorOpcao){
			valor = valorOpcao;
		}
		public String getValor(){
			return valor;
		}
	}
	
	public String getCourseSelected() {
		return courseSelected;
	}
	
	public OpcoesCourse[] getCourse() {
		course = OpcoesCourse.values();
		return course;
	}
	public void setCourse(OpcoesCourse[] course) {
		this.course = course;
	}
	public void setCourseSelected(String courseSelected) {
		this.courseSelected = courseSelected;
	}
}