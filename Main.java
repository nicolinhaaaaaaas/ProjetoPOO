package prototipoPOO;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int opcao = 1;
		
		do {
			
			System.out.println("\nSistema de Hoteis Marinho\n");
			System.out.println("(1)- Administrador do Sistema");
			System.out.println("(2)- Cliente do Sistema");
			System.out.println("(0)- Sair\n");
			int opcao2 = 1;
			opcao = scanner.nextInt();
			
			switch(opcao) {
				
			case 1:
				while(opcao2 != 0) {
					System.out.println("\nMENU DE AMNISTRADOR\n");
					System.out.println("(1)- Cadastrar novo Hotel");
					System.out.println("(2)- Editar Hotel do sistema");
					System.out.println("(3)- Remover Hotel do sistema");
					System.out.println("(4)- Listar Hoteis cadastrados");
					System.out.println("(0)- Voltar\n");
					
					opcao2 = scanner.nextInt();
					
					Menu.clearBuffer(scanner);
					
					switch(opcao2) {
					
					case 1:
						Menu.cadastrarHotel();
					break;
					
					case 2:
						Menu.editarHotel();
					break;
					
					case 3:
						Menu.removerHotel();
					break;
					
					case 4:
						Menu.listarHotel();
					break;
					
					case 0:
						System.out.println("\nRetornando ao menu principal\n");
					break;
					}
				}
			break;
			
			case 2:
				
				while(opcao2 !=0) {
					
					System.out.println("\nMENU DO CLIENTE\n");
					System.out.println("(1)- Ver Hoteis disponiveis do sistema");
					System.out.println("(2)- Alugar um quarto");
					System.out.println("(3)- Ir embora do quarto");
					System.out.println("(0)- Voltar");
					
					opcao2 = scanner.nextInt();
					
					Menu.clearBuffer(scanner);
					
					switch(opcao2) {
					
					case 1:
						Menu.hoteisDisponiveis();
					break;
					
					case 2:
						Menu.alugarQuarto();
					break;
					
					case 3:
						Menu.irEmboraQuarto();
					break;
					
					case 0:
						System.out.println("\nRetornando ao menu principal\n");
					break;
					}
				}
				
			break;
			
			case 0:
				System.out.println("\nENCERRANDO O SISTEMA...\n");
			break;
			
			default:
				System.out.println("\nOpcao invalida...");
			break;
			}
			
		}
		
		while(opcao != 0);

	}

}
