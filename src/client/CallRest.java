package client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class CallRest {

	public static WebTarget getRequestRest (Client client, String URL){
		return client.target(URL);
	}
	
	public static void main(String[] args){
		Client client = ClientBuilder.newClient();
		
		/*Se for JSON*/
		WebTarget target1 = getRequestRest(client, "http://developers.agenciaideias.com.br/cotacoes/json");
		System.out.println(target1.request(MediaType.APPLICATION_JSON).get(String.class));
		
		/*Se for XML*/
		WebTarget target2 = getRequestRest(client, "http://developers.agenciaideias.com.br/cotacoes/xml");
		System.out.println(target2.request(MediaType.APPLICATION_XML).get(String.class));
	}
}
