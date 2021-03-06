package br.com.client;

import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class WsClient {

	public static void main(String[] args) {
		testeGetSimples();
		testePassagemParametro();
	}

	public static void testeGetSimples() {
		try {

			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/rest-json/json/service/get");
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);
			System.out.println("Saida do Servidor Server .... \n");
			System.out.println(output);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void jsonManipula(String output) {
		
		 JSONObject my_obj = new JSONObject(output); 
		 int codigo = my_obj.getInt("codigo");
		 String nome = my_obj.getString("nome"); 
		 String informaçãoAvulsa = my_obj.getString("informaçãoAvulsa");
		 
		 System.out.println("codigo: " + codigo); 
		 System.out.println("nome: " + nome); 
		 System.out.println("informaçãoAvulsa: " + informaçãoAvulsa); 
	 }


	public static void testePassagemParametro() {
		try {

			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/rest-json/json/service/retorno/Wylliam");
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);
			jsonManipula(output);
			System.out.println("Saida do Servidor Server .... \n");
			System.out.println(output);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
