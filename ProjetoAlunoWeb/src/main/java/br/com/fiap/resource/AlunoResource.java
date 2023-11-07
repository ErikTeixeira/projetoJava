package br.com.fiap.resource;


import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.beans.Aluno;
import br.com.fiap.bo.AlunoBO;

@Path("/aluno")
public class AlunoResource {

	// teste
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	
//	public String buscar() {
//		
//		return "------------------- Teste 1TDSPF -------------------";
//		
//	}
	
	
	private AlunoBO alunoBo = new AlunoBO();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Aluno> selecionarRs() throws ClassNotFoundException, SQLException {
		
		return (ArrayList<Aluno>) alunoBo.selecionarBo();
		
	}
	
	
}
