package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Integer opcoes;
	static Integer opcoes2;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Object> Hoteis = new ArrayList<>();
		
		
		Hotel hotel1 = new Hotel(null, null, null, 0, false);
		Hotel hotel2 = new Hotel(null, null, null, 0, false);
		Hotel hotel3 = new Hotel(null, null, null, 0, false);
		Hotel hotel4 = new Hotel(null, null, null, 0, false);
		Hotel hotel5 = new Hotel(null, null, null, 0, false);

		while(true) {
			opcoesAdm();
			int opcao = scanner.nextInt();
			
			switch(opcao) {
		
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
				
				if(hotel1.getNomeHotel() != null) {
					hotel1.listarHotel();
					if(hotel2.getNomeHotel() != null) {
						hotel2.listarHotel();
						if(hotel3.getNomeHotel() != null) {
							hotel3.listarHotel();
							if(hotel4.getNomeHotel() != null) {
								hotel4.listarHotel();
								if(hotel5.getNomeHotel() != null) {
									hotel5.listarHotel();
								}else {}
							}else {}
						}else {}
					}else {}
				}
				else {
					System.out.println("Nao ha nenhum hotel no sistema.");
				}

			}
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
	
	static void opcoesAdm() {
		System.out.println("Voce escolheu a opcao de Administrador. O que deseja fazer?");
		System.out.println("(1)- Adicionar um hotel ao sistema.");
		System.out.println("(2)- Remover um hotel do sistema.");
		System.out.println("(3)- Modificar um hotel do sistema.");
		System.out.println("(4)- Listar os hoteis do sistema.");
		System.out.println("(0)- Sair");		
	}
}
