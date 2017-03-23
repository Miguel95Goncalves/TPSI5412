package controller;

import java.util.ArrayList;

import model.Cliente;

public class GestaoCliente {
	
	public void addCliente(ArrayList<Cliente> listaCli,String nome,String morada,String email,String telefone){ //Adicionar Cliente
		int id = listaCli.size()+1;
		
		listaCli.add(new Cliente(id,nome, morada, email, telefone));
	}
	
	public void remCliente(ArrayList<Cliente> listaCli,int id){ //Remover Cliente
		id--;
		
		listaCli.remove(id);
	}
	
	public void listarCliente(ArrayList<Cliente> listaCli){ //Listar Clientes
		for(Cliente c : listaCli)
		{
			System.out.println("ID: "+c.getId());
			System.out.println("Nome: "+c.getNome());
			System.out.println("Email: "+c.getEmail());
			System.out.println("Morada: "+c.getMorada());
			System.out.println("Telefone: "+c.getTelefone());
		}
	}
	
	public Cliente procurarCliente(ArrayList<Cliente> listaCli, int id){ //Procurar Cliente por ID
		
		for(Cliente c : listaCli)
		{
			if(c.getId() == id) return c;
		}
		
		return null;
	}
}
