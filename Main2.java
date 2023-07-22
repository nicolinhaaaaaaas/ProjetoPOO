package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main {
	
	static String opcoes = null;
	static Integer opcoes2 = 0;
	static Scanner scanner = new Scanner(System.in);
	static Boolean menu = true;

	public static void main(String[] args) {
		
		List<Hotel> Hoteis = new ArrayList<>();
		
		Hotel hotel1 = new Hotel(null, null, null, 0, false);
		Hotel hotel2 = new Hotel(null, null, null, 0, false);
		Hotel hotel3 = new Hotel(null, null, null, 0, false);
		Hotel hotel4 = new Hotel(null, null, null, 0, false);
		Hotel hotel5 = new Hotel(null, null, null, 0, false);
		
		Cliente cliente = new Cliente(null, null, null, 0, null, null);
		
		Login login = new Login();
		
		
		
		//Recuperando a lista dos hoteis salvos no sistema.
		List<Hotel> hoteisSalvos = null;
		
		try {
            FileInputStream fileIn = new FileInputStream("hotel.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            hoteisSalvos = (List<Hotel>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Objeto lido com sucesso!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } 
		
		if (hoteisSalvos != null) {
            for (Hotel hotel : hoteisSalvos) {
                //if(hotel1.getHotelExiste().equals(false)) {
                	hotel1.setNomeHotel(hotel.getNomeHotel());
                	hotel1.setEndereco(hotel.getEndereco());
                	hotel1.setDescricao(hotel.getDescricao());
                	hotel1.setQuarto(hotel.getQuarto());
                	hotel1.setHotelExiste(true);
               /* }
                if(hotel2.getHotelExiste().equals(false)) {
                	hotel2.setNomeHotel(hotel.getNomeHotel());
                	hotel2.setEndereco(hotel.getEndereco());
                	hotel2.setDescricao(hotel.getDescricao());
                	hotel2.setQuarto(hotel.getQuarto());
                	hotel2.setHotelExiste(true);
                }
                if(hotel3.getHotelExiste().equals(false)) {
                	hotel3.setNomeHotel(hotel.getNomeHotel());
                	hotel3.setEndereco(hotel.getEndereco());
                	hotel3.setDescricao(hotel.getDescricao());
                	hotel3.setQuarto(hotel.getQuarto());
                	hotel3.setHotelExiste(true);
                }
                if(hotel4.getHotelExiste().equals(false)) {
                	hotel4.setNomeHotel(hotel.getNomeHotel());
                	hotel4.setEndereco(hotel.getEndereco());
                	hotel4.setDescricao(hotel.getDescricao());
                	hotel4.setQuarto(hotel.getQuarto());
                	hotel4.setHotelExiste(true);
                }
                if(hotel5.getHotelExiste().equals(false)) {
                	hotel5.setNomeHotel(hotel.getNomeHotel());
                	hotel5.setEndereco(hotel.getEndereco());
                	hotel5.setDescricao(hotel.getDescricao());
                	hotel5.setQuarto(hotel.getQuarto());
                	hotel5.setHotelExiste(true);
                } */
            }
        }
		

		/*while(opcoes != "sair"){
			menu();
			opcoes = scanner.next();
			
			switch(opcoes) {
			
			case "administrador": */
				
				while(true) {
					opcoesAdm();
					opcoes2 = scanner.nextInt();
					
					switch(opcoes2) {
				
					case 1:
						
						try {
							FileOutputStream fileOut = new FileOutputStream("hotel.ser");
							ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
							
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
						
							objectOut.writeObject(Hoteis);
							objectOut.close();
							fileOut.close();
						}
						catch(IOException e){
							e.printStackTrace();
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
					break;
					
					case 0:
						System.out.println("Encerrando o sistema...");
					break;
					
					default:
						System.out.println("opcao invalida.");
					break;
					}
				}
				
		/*	break;	
				
			case "cliente":
				
				while(opcoes2 != 0) {
					opcoesCliente();
					opcoes2 = scanner.nextInt();
					
					switch(opcoes2) {
					
					case 1:
						
					break;
					
					case 2:
						
					break;
					
					case 3:
						
					break;
					
					case 4:
						
					break;
					
					case 0:
						
					break;
					
					default:
						System.out.println("Opcao invalida.");
					break;
					
					}
				}
			break;
				
			case "sair":
				System.out.println("Encerrando o sistema...");
			return;

			
			default:
				System.out.println("Opcao invalida");
			break;
			}
			
		}
*/	
		
	}
	
	public static void menu() {
		System.out.println("Seja bem vindo ao sistema de hoteis Marinho. Como voce se identifica?");
		System.out.println("(1)- Administrador");
		System.out.println("(2)- Cliente");
		System.out.println("\n(0)- Sair");
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
