package br.com.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.entidade.Pessoa;


@Path("/json/service")
public class WsServico 
{
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public String retornaStringSemParametro(){
		return "wylliam";
	}

	@GET
	@Path("/retorno/{nome}")
	@Produces(MediaType.APPLICATION_JSON)
	public Pessoa retornaStringComParametro(@PathParam("nome") String nome){
		Pessoa pessoa = new Pessoa(1, nome, "Qualquer coisa");
		return pessoa;
	}
	
}
