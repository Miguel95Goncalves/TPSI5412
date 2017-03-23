package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestaoReserva;
import model.*;

public class MenuReserva {
	
	Scanner read = (new Scanner(System.in));
	
	public void menuReserva(ArrayList<Reserva> listaReser,ArrayList<Cliente> listaCli,ArrayList<Restaurante> listaRest){
		int opc,idCli,idRest;
		String prato;
		
		do
		{
			System.out.println("1 - Inserir Reserva\n2 - Listar Reservas\n0 - Voltar\nInsira a opção: ");
			opc = read.nextInt();
			
			switch(opc)
			{
			case 1:
				
				System.out.println("Insira o id do Cliente: ");
				idCli = read.nextInt();
				
				System.out.println("Insira o id do Restaurante: ");
				idRest = read.nextInt();
				
				read.nextLine();
				
				System.out.println("Insira o nome do Prato: ");
				prato = read.nextLine();
				
				new GestaoReserva().addReserva(listaReser, listaCli, listaRest, idCli, idRest, prato);
				break;
				
			case 2:
				new GestaoReserva().listarReservas(listaReser);
				break;
			}
			
		}while(opc!=0);
		
	}
	
}
