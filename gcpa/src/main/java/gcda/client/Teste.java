package gcda.client;

import gcda.business.OrgMilitar;
import retrofit.RestAdapter;

public class Teste {

	public static void main(String[] args) {
		Gcda gcda = new  RestAdapter.Builder()
				.setEndpoint("http://localhost:8080/gcpa/api")
				.build()
				.create(Gcda.class);
		
		gcda.getOM(123);
		System.out.println("Cliente foi");
	}
}
