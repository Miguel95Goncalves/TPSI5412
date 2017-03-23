package controller;

import java.util.ArrayList;

import model.Restaurante;

public class GestaoRestaurante {
	
	public void addRestaurante(ArrayList<Restaurante> listaRest,String nome,String morada,String telefone,String especialidade){ //Adicionar Restaurante
		int id = listaRest.size()+1;
		
		listaRest.add(new Restaurante(id,nome, morada, telefone, especialidade));
	}
	
	public void remRestaurante(ArrayList<Restaurante> listaRest,int id){ //Remover Restaurante
		id--;
		
		listaRest.remove(id);
	}
	
	public void listarRestaurante(ArrayList<Restaurante> listaRest){ //Listar Restaurantes
		for(Restaurante r : listaRest)
		{
			System.out.println("ID: "+r.getId());
			System.out.println("Nome: "+r.getNome());
			System.out.println("Morada: "+r.getMorada());
			System.out.println("Telefone: "+r.getTelefone());
			System.out.println("Especialidade: "+r.getEspecialidade());
		}
	}
	
	public Restaurante procurarRestaurante(ArrayList<Restaurante> listaRest, int id){ //Procurar Restaurante por ID
		
		for(Restaurante r : listaRest)
		{
			if(r.getId() == id) return r;
		}
		
		return null;
	}
	
}
