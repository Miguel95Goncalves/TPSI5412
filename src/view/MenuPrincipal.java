package view;

import java.util.Scanner;

import model.*;

import java.util.ArrayList;

public class MenuPrincipal {
	
	Scanner read=(new Scanner(System.in));
	
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
	ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	
	public void menuPrincipal(){
		int opc;
		
		do
		{
			System.out.println("1 - Cliente\n2 - Restaurante\n3 - Reserva\n0 - Sair\nInsira a opção: ");
			opc=read.nextInt();
			
			switch(opc)
			{
			case 1:
				new MenuCliente().menuCliente(clientes);;
				break;
				
			case 2:
				new MenuRestaurante().menuRestaurante(restaurantes);;
				break;
				
			case 3:
				new MenuReserva().menuReserva(reservas, clientes, restaurantes);;
				break;
			}
			
		}while(opc!=0);
	}
}
