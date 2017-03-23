package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestaoCliente;
import model.Cliente;

public class MenuCliente {
	
	Scanner read=(new Scanner(System.in));
	
	public void menuCliente(ArrayList<Cliente> listaCli){
		int opc,id;
		String nome,morada,telefone,email;
		
		do
		{
			System.out.println("1 - Inserir Cliente\n2 - Remover Cliente\n3 - Listar Clientes\n4 - Procurar Cliente\n0 - Voltar\nInsira a opção: ");
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
				
				System.out.println("Email: ");
				email = read.nextLine();
				
				new GestaoCliente().addCliente(listaCli, nome, morada, email, telefone);
				break;
				
			case 2:
				System.out.println("Insira o ID: ");
				id = read.nextInt();
				
				if(id>0 && id<=listaCli.size())
				{
					new GestaoCliente().remCliente(listaCli, id);
				}
				else
				{
					System.out.println("ID Inválido!");
				}
				break;
				
			case 3:
				new GestaoCliente().listarCliente(listaCli);
				break;
				
			case 4:
				System.out.println("Insira o ID: ");
				id = read.nextInt();
				
				if(id>0 && id<=listaCli.size())
				{
					System.out.println(new GestaoCliente().procurarCliente(listaCli, id).getNome());
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
