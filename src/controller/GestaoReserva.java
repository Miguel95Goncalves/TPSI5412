package controller;

import java.util.ArrayList;

import model.*;

public class GestaoReserva {
	
	public void addReserva(ArrayList<Reserva> listaReser,ArrayList<Cliente> listaCli,ArrayList<Restaurante> listaRest, int idCli,int idRest,String prato){
		//Adicionar Reserva
		
		if(new GestaoCliente().procurarCliente(listaCli, idCli)!=null && new GestaoRestaurante().procurarRestaurante(listaRest, idRest)!=null)
		{
			// Se o cliente e o restaurante selecionados existirem
			
			Cliente cliente = new GestaoCliente().procurarCliente(listaCli, idCli);
			Restaurante restaurante = new GestaoRestaurante().procurarRestaurante(listaRest, idRest);
			
			listaReser.add(new Reserva(cliente,restaurante,prato));
			
		}
		else System.out.println("Cliente ou Restaurante Inexistentes!");
		
	}
	
	public void listarReservas(ArrayList<Reserva> listaReser){ //Listar Reservas
		for(Reserva r : listaReser)
		{
			System.out.println("Cliente: "+r.getCliente().getNome());
			System.out.println("Restaurante: "+r.getRestaurante().getNome());
			System.out.println("Prato: "+r.getPrato());
		}
	}
	
}
