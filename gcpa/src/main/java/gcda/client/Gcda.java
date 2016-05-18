package gcda.client;

import retrofit.http.GET;
import retrofit.http.Path;
import gcda.business.OrgMilitar;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
import retrofit.http.Query;

public interface Gcda {
	
	@GET("/oms")
	public String  getOM(Integer id);
		
}
