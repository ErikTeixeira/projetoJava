package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class AlunoBO {
	
	AlunoDAO alunoDao;
	
	// Selecionar
	public ArrayList<Aluno> selecionarBo() throws ClassNotFoundException, SQLException {
		
		alunoDao = new AlunoDAO();
		
		return (ArrayList<Aluno>) alunoDao.selecionar();
		
	}
	
	// Inserir
	public void inserirBo( Aluno aluno ) throws ClassNotFoundException, SQLException {
		
		AlunoDAO alunoDao = new AlunoDAO();
		
		alunoDao.inserir(aluno);
		
	}
	
	// Atualizar
	public void atualizarBo( Aluno aluno ) throws SQLException, ClassNotFoundException {
		
		AlunoDAO alunoDao = new AlunoDAO();
		
		alunoDao.atualizar(aluno);
		
	}
	
	// Deletar
	public void deletarBo( int rm ) throws ClassNotFoundException, SQLException {
		
		AlunoDAO alunoDao = new AlunoDAO();
		
		alunoDao.deletar(rm);
		
	}
	
	

}
