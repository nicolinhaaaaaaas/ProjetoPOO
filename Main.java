package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		
		ArrayList<Object> Hoteis = new ArrayList<>();
		ArrayList<String> Clientes = new ArrayList<>();
		
		Integer opcoes = 1;
		Integer opcoes2 = 1;
		Scanner scanner = new Scanner(System.in);
		
		Cliente cliente = new Cliente(null, null, null, 0, false, null, false);
		
		Login login = new Login();
		
		Hotel hotel1 = new Hotel(null, null, null, 0, false);
		Hotel hotel2 = new Hotel(null, null, null, 0, false);
		Hotel hotel3 = new Hotel(null, null, null, 0, false);
		Hotel hotel4 = new Hotel(null, null, null, 0, false);
		Hotel hotel5 = new Hotel(null, null, null, 0, false);

		while (opcoes != 7) {
			menu();
			opcoes = scanner.nextInt();
			switch(opcoes) {
			case 1:
				
				while(opcoes != 0) {
					opcoesAdm();
					opcoes = scanner.nextInt();
					
					switch(opcoes) {
				
					case 1:
						if(hotel1.getHotelExiste().equals(false)) {
							hotel1.adicionarHotel();
							
							Hoteis.add(hotel1);
							hotel1.setHotelExiste(true);
							
							System.out.println(hotel1.toString());
						}
						else if(hotel2.getHotelExiste().equals(false)) {
							hotel2.adicionarHotel();
							
							Hoteis.add(hotel2);
							hotel2.setHotelExiste(true);
							
							System.out.println(hotel2.toString());
						}
						else if(hotel3.getHotelExiste().equals(false)) {
							hotel3.adicionarHotel();
							
							Hoteis.add(hotel3);
							hotel3.setHotelExiste(true);
							
							System.out.println(hotel3.toString());
						}
						else if(hotel4.getHotelExiste().equals(false)) {
							hotel4.adicionarHotel();
							
							Hoteis.add(hotel4);
							hotel4.setHotelExiste(true);
							
							System.out.println(hotel4.toString());
						}
						else if(hotel5.getHotelExiste().equals(false)) {
							hotel5.adicionarHotel();
							
							Hoteis.add(hotel1);
							hotel5.setHotelExiste(true);
						}
						else {
							System.out.println("Nao ha espaco disponivel para um novo hotel no sistema.");
						}
					break;
					
					case 2:
						System.out.println("Qual hotel deseja remover do sistema?");
						System.out.println(hotel1.getNomeHotel() + "\t" + hotel2.getNomeHotel() + "\t" + hotel3.getNomeHotel() + "\t" + hotel4.getNomeHotel() + "\t" + hotel5.getNomeHotel());
						System.out.print("Digite o nome do hotel que deseja remover: ");
						String hotelRemover = scanner.next();
						
						if(hotelRemover.equals(hotel1.getNomeHotel())) {
							hotel1.removerHotel();
							hotel1.setHotelExiste(false);
						}
						else if(hotelRemover.equals(hotel2.getNomeHotel())) {
							hotel2.removerHotel();
							hotel2.setHotelExiste(false);
						}
						else if(hotelRemover.equals(hotel3.getNomeHotel())) {
							hotel3.removerHotel();
							hotel3.setHotelExiste(false);
						}
						else if(hotelRemover.equals(hotel4.getNomeHotel())) {
							hotel4.removerHotel();
							hotel4.setHotelExiste(false);
						}
						else if(hotelRemover.equals(hotel5.getNomeHotel())) {
							hotel5.removerHotel();
							hotel5.setHotelExiste(false);
						}
						else {
							System.out.println("Operacao cancelada");
						}
						
					break;
					
					case 3:
						System.out.println("Qual hotel deseja modificar sistema?");
						System.out.println(hotel1.getNomeHotel() + "\t" + hotel2.getNomeHotel() + "\t" + hotel3.getNomeHotel() + "\t" + hotel4.getNomeHotel() + "\t" + hotel5.getNomeHotel());
						System.out.print("Digite o nome do hotel que deseja modificar: ");
						String hotelModificar = scanner.next();
						
						if(hotelModificar.equals(hotel1.getNomeHotel())) {
							hotel1.modificarHotel();
						}
						else if(hotelModificar.equals(hotel2.getNomeHotel())) {
							hotel2.modificarHotel();
						}
						else if(hotelModificar.equals(hotel3.getNomeHotel())) {
							hotel3.modificarHotel();
						}
						else if(hotelModificar.equals(hotel4.getNomeHotel())) {
							hotel4.modificarHotel();
						}
						else if(hotelModificar.equals(hotel5.getNomeHotel())) {
							hotel5.modificarHotel();
						}
						else {
							System.out.println("Operacao cancelada");
						}
						
					break;
					
					case 4:
						
						if(Hoteis != null) {
							System.out.println("Estes sao os hoteis disponiveis no sistema:");
							if(hotel1.getHotelExiste() == true) {
								System.out.println(hotel1.toString());
							}
							if(hotel2.getHotelExiste() == true) {
								System.out.println(hotel2.toString());
							}
							if(hotel3.getHotelExiste() == true) {
								System.out.println(hotel3.toString());
							}
							if(hotel4.getHotelExiste() == true) {
								System.out.println(hotel4.toString());
							}
							if(hotel5.getHotelExiste() == true) {
								System.out.println(hotel5.toString());
							}
						}
						else {
							System.out.println("Nao ha nenhum hotel no sistema.");
						}
					break;
					
					case 0:
						System.out.println("Voltando para o menu...");
					break;

					}
				}
			break;	
			
			case 2:
				
				login.loginCliente();
				Clientes.add(login.getUsuario());
				
				while(opcoes != 0) {
					opcoesCliente();
					opcoes = scanner.nextInt();
					
					switch(opcoes) {
					
					case 1:
						if(Hoteis != null) {
							System.out.println("Estes sao os hoteis disponiveis no sistema:");
							if(hotel1.getHotelExiste() == true) {
								System.out.println(hotel1.toString());
							}
							if(hotel2.getHotelExiste() == true) {
								System.out.println(hotel2.toString());
							}
							if(hotel3.getHotelExiste() == true) {
								System.out.println(hotel3.toString());
							}
							if(hotel4.getHotelExiste() == true) {
								System.out.println(hotel4.toString());
							}
							if(hotel5.getHotelExiste() == true) {
								System.out.println(hotel5.toString());
							}
						}
					break;
					
					case 2:
						System.out.println("Qual dos hoteis disponiveis voce deseja alugar 1 quarto?");
						System.out.println(hotel1.getNomeHotel() + "\t"+hotel2.getNomeHotel() + "\t"+hotel3.getNomeHotel() 
																+ "\t"+hotel4.getNomeHotel() + "\t"+hotel5.getNomeHotel());
						System.out.print("Digite o nome do hotel que deseja ir: ");
						String escolherHotel = scanner.next();
						
						if(escolherHotel.equals(hotel1.getNomeHotel())) {
							cliente.escolherHotel();
							cliente.setNomeHotel(escolherHotel);
						}
						else if(escolherHotel.equals(hotel2.getNomeHotel())) {
							cliente.escolherHotel();
							cliente.setNomeHotel(escolherHotel);
						}
						else if(escolherHotel.equals(hotel3.getNomeHotel())) {
							cliente.escolherHotel();
							cliente.setNomeHotel(escolherHotel);
						}
						else if(escolherHotel.equals(hotel4.getNomeHotel())) {
							cliente.escolherHotel();
							cliente.setNomeHotel(escolherHotel);
						}
						else if(escolherHotel.equals(hotel5.getNomeHotel())) {
							cliente.escolherHotel();
							cliente.setNomeHotel(escolherHotel);
						}
						else {
							System.out.println("Opcao invalida");
						}
					break;
					
					case 3:
						if(cliente.getNomeHotel() == hotel1.getNomeHotel()) {
							cliente.irEmbora();
						}
						else if(cliente.getNomeHotel() == hotel2.getNomeHotel()) {
							cliente.irEmbora();
						}
						else if(cliente.getNomeHotel() == hotel3.getNomeHotel()) {
							cliente.irEmbora();
						}
						else if(cliente.getNomeHotel() == hotel4.getNomeHotel()) {
							cliente.irEmbora();
						}
						else if(cliente.getNomeHotel() == hotel5.getNomeHotel()) {
							cliente.irEmbora();
						}
					break;
					
					case 0:
						System.out.println("Voltando ao menu principal...");
					break;
					}
				}
			break;
			
			case 9:
				return;
				
			}
		}		
	}	
	
	public static void menu() {
		System.out.println("Seja bem vindo ao sistema de hoteis Marinho. Como voce se identifica?");
		System.out.println("(1)- Administrador");
		System.out.println("(2)- Cliente");
		System.out.println("\n(9)- Sair");
	}
	
	public static void opcoesAdm() {
		System.out.println("Voce escolheu a opcao de Administrador. O que deseja fazer?");
		System.out.println("(1)- Adicionar um hotel ao sistema.");
		System.out.println("(2)- Remover um hotel do sistema.");
		System.out.println("(3)- Modificar um hotel do sistema.");
		System.out.println("(4)- Listar os hoteis do sistema.");
		System.out.println("\n(0)- Voltar ao menu principal");		
	}
	
	public static void opcoesCliente() {
		System.out.println("O que deseja fazer?");
		System.out.println("(1)- Ver hoteis disponiveis.");
		System.out.println("(2)- Alugar quartos.");
		System.out.println("(3)- Ir embora.");
		System.out.println("(4)- Sair da conta.");
		System.out.println("\n(0)- Voltar ao menu principal");
	}
}
