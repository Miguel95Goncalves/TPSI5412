package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestaoRestaurante;
import model.Restaurante;

public class MenuRestaurante {
	
	Scanner read=(new Scanner(System.in));
	
	public void menuRestaurante(ArrayList<Restaurante> listaRest){
		int opc,id;
		String nome,morada,telefone,especialidade;
		
		do
		{
			System.out.println("1 - Inserir Restaurante\n2 - Remover Restaurante\n3 - Listar Restaurantes\n4 - Procurar Restaurante\n0 - Voltar\nInsira a opção: ");
			opc = read.nextInt();
			
			switch(opc)
			{
			case 1:
				
				read.nextLine();
				
				System.out.println("Nome: ");
				nome = read.nextLine();
				
				System.out.println("Morada: ");
				morada = read.nextLine();
				
				System.out.println("Telefone: ");
				telefone = read.nextLine();
				
				System.out.println("Especialidade: ");
				especialidade = read.nextLine();
				
				new GestaoRestaurante().addRestaurante(listaRest, nome, morada, telefone, especialidade);
				break;
				
			case 2:
				System.out.println("Insira o ID");
				id = read.nextInt();
				
				if(id>0 && id<=listaRest.size())
				{
					new GestaoRestaurante().remRestaurante(listaRest, id);
				}
				else
				{
					System.out.println("ID Inválido!");
				}
				break;
				
			case 3:
				new GestaoRestaurante().listarRestaurante(listaRest);
				break;
				
			case 4:
				System.out.println("Insira o ID");
				id = read.nextInt();
				
				if(id>0 && id<=listaRest.size())
				{
					System.out.println(new GestaoRestaurante().procurarRestaurante(listaRest, id).getNome());
				}
				else
				{
					System.out.println("ID Inválido!");
				}
				break;
			}
			
		}while(opc!=0);
	}
}
