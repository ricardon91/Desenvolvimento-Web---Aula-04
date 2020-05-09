package service;

import java.util.ArrayList;

import dao.PaisDAO;
import model.Pais;

public class UsuarioService {
	
	PaisDAO dao;
	
	public UsuarioService() {
		dao = new PaisDAO();
	}
	
	public ArrayList<Pais> listarPaises(){
		return dao.listarPaises();
	}
	
	public ArrayList<Pais> listarPaises(String chave){
		return dao.listarPaises(chave);
	}
}
