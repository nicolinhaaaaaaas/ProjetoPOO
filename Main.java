package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Integer opcoes;
	static Integer opcoes2;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Object> Hoteis = new ArrayList<>();
		
		Hotel hotel1 = new Hotel(null, null, null, 0);
		Hotel hotel2 = new Hotel(null, null, null, 0);
		Hotel hotel3 = new Hotel(null, null, null, 0);
		Hotel hotel4 = new Hotel(null, null, null, 0);
		Hotel hotel5 = new Hotel(null, null, null, 0);

		

		if(hotel1.equals(null)) {
			System.out.print("Digite o nome do Hotel: ");
			String novoNome = scanner.next();
					hotel1.setNomeHotel(novoNome);
					System.out.print("Digite o endereco do Hotel: ");
					String novoEndereco = scanner.next();
					hotel1.setEndereco(novoEndereco);
					System.out.print("Digite uma breve descricao do Hotel: ");
					String novaDescricao = scanner.next();
					hotel1.setDescricao(novaDescricao);
					System.out.print("Digite a quantidade de quartos disponiveis no Hotel: ");
					Integer novoQuarto = scanner.nextInt();
					hotel1.setQuarto(novoQuarto);
					
					Hoteis.add(hotel1);
					
					System.out.println(hotel1.toString());
				}
				else if(hotel2.equals(null)) {
					System.out.print("Digite o nome do Hotel: ");
					String novoNome = scanner.next();
					hotel2.setNomeHotel(novoNome);
					System.out.print("Digite o endereco do Hotel: ");
					String novoEndereco = scanner.next();
					hotel2.setEndereco(novoEndereco);
					System.out.print("Digite uma breve descricao do Hotel: ");
					String novaDescricao = scanner.next();
					hotel2.setDescricao(novaDescricao);
					System.out.print("Digite a quantidade de quartos disponiveis no Hotel: ");
					Integer novoQuarto = scanner.nextInt();
					hotel2.setQuarto(novoQuarto);
					
					Hoteis.add(hotel2);
					
					System.out.println(hotel2.toString());
				}
				else if(hotel3.equals(null)) {
					System.out.print("Digite o nome do Hotel: ");
					String novoNome = scanner.next();
					hotel3.setNomeHotel(novoNome);
					System.out.print("Digite o endereco do Hotel: ");
					String novoEndereco = scanner.next();
					hotel3.setEndereco(novoEndereco);
					System.out.print("Digite uma breve descricao do Hotel: ");
					String novaDescricao = scanner.next();
					hotel3.setDescricao(novaDescricao);
					System.out.print("Digite a quantidade de quartos disponiveis no Hotel: ");
					Integer novoQuarto = scanner.nextInt();
					hotel3.setQuarto(novoQuarto);
					
					Hoteis.add(hotel3);
					
					System.out.println(hotel3.toString());
				}
				else if(hotel4.equals(null)) {
					System.out.print("Digite o nome do Hotel: ");
					String novoNome = scanner.next();
					hotel4.setNomeHotel(novoNome);
					System.out.print("Digite o endereco do Hotel: ");
					String novoEndereco = scanner.next();
					hotel4.setEndereco(novoEndereco);
					System.out.print("Digite uma breve descricao do Hotel: ");
					String novaDescricao = scanner.next();
					hotel4.setDescricao(novaDescricao);
					System.out.print("Digite a quantidade de quartos disponiveis no Hotel: ");
					Integer novoQuarto = scanner.nextInt();
					hotel4.setQuarto(novoQuarto);
					
					Hoteis.add(hotel4);
					
					System.out.println(hotel4.toString());
				}
				else if(hotel5.equals(null)) {
					System.out.print("Digite o nome do Hotel: ");
					String novoNome = scanner.next();
					hotel5.setNomeHotel(novoNome);
					System.out.print("Digite o endereco do Hotel: ");
					String novoEndereco = scanner.next();
					hotel5.setEndereco(novoEndereco);
					System.out.print("Digite uma breve descricao do Hotel: ");
					String novaDescricao = scanner.next();
					hotel5.setDescricao(novaDescricao);
					System.out.print("Digite a quantidade de quartos disponiveis no Hotel: ");
					Integer novoQuarto = scanner.nextInt();
					hotel5.setQuarto(novoQuarto);
					
					Hoteis.add(hotel1);
				}
		
		
		
		
		//Administrador adm = new Administrador();
		//Login login = new Login();
		
		//login.loginAdministrador();
		
		
		/*
		System.out.println("Bem vindo a rede de hoteis Marinho!");
		System.out.println("Por favor, se identifique: ");
		System.out.println("(1)- Administrador");
		System.out.println("(2)- Cliente");
		opcoes = scanner.nextInt();
		
		if(opcoes.equals(1)) {
			adm.escolhaAdm();
		}
		
		else if(opcoes.equals(2)) {
			
		}
		
		else {
			System.out.println("Opcao invalida");
		}
		*/
	}
}
