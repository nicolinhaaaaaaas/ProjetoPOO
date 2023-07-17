package projeto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Administrador{
	
	String[] hotelNomes = new String[5];
	String[] hotelEnderecos = new String[5];
	String[] hotelDescricoes = new String[5];
	int[] hotelQuartos = new int[5];
	
	Scanner scanner =  new Scanner(System.in);
	
	int opcao;
	String nomeHotel;
	String enderecoHotel;
	String descricaoHotel;
	Integer quartosHotel;
	
	String[] hoteis = new String[5];
	
	void escolha() {
		System.out.println("Sistema do Administrador.");
		System.out.println("O que deseja fazer:");
		
	}
	
	void adicionarHotel() {
		System.out.println("Deseja adicionar um novo hotel ao sistema? (1)-Sim ; (2)-Nao ");
		opcao = scanner.nextInt();
		if(opcao == 1) {
			System.out.print("Qual o nome do Hotel que deseja adicionar: ");
			nomeHotel = scanner.next();
			System.out.print("Onde esse hotel sera localizado: ");
			enderecoHotel = scanner.next();
			System.out.print("Quantos quartos esse hotel disponibilizara: ");
			quartosHotel = scanner.nextInt();
			System.out.print("Digite uma breve descricao do hotel: ");
			descricaoHotel = scanner.next();
			System.out.println("Deseja confirmar a aquisicao deste hotel? (1)-Sim ; (2)-Nao");
			opcao = scanner.nextInt();
			if(opcao == 1) {

				toString();
				
				try {
					
					BufferedWriter writer = new BufferedWriter(new FileWriter("Hoteis.txt"));
					
				if(hoteis[0] == null) {
					hoteis[0] = toString();
					writer.write("\n"+ hoteis[0]);
					System.out.println("Muito bem, o Hotel "+nomeHotel+" foi adicionado a rede de Hoteis.");
				}
				else if(hoteis[1] == null) {
					hoteis[1] = toString();
					writer.write("\n"+ hoteis[1]);
					System.out.println("Muito bem, o Hotel "+nomeHotel+" foi adicionado a rede de Hoteis.");
				}
				else if(hoteis[2] == null) {
					hoteis[2] = toString();
					writer.write("\n"+ hoteis[2]);
					System.out.println("Muito bem, o Hotel "+nomeHotel+" foi adicionado a rede de Hoteis.");
				}
				else if(hoteis[3] == null) {
					hoteis[3] = toString();
					writer.write("\n"+ hoteis[3]);
					System.out.println("Muito bem, o Hotel "+nomeHotel+" foi adicionado a rede de Hoteis.");
				}
				else if(hoteis[4] == null) {
					hoteis[4] = toString();
					writer.write("\n"+ hoteis[4]);
					System.out.println("Muito bem, o Hotel "+nomeHotel+" foi adicionado a rede de Hoteis.");	
				} 
				else {
					System.out.println("Nao eh possivel adicionar nenhum hotel no momento.");
				}
				
				writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				/*for(int i = 0 ; i <= hoteis.length ; i++) {
					if(hoteis[i] != null) {
						hotelNomes[i] = nomeHotel;
						hotelEnderecos[i] = enderecoHotel;
						hotelQuartos[i] = quartosHotel;
						hotelDescricoes[i] = descricaoHotel;
					}
				}*/ 	
			} else {
				System.out.println("Transacao cancelada");
			}
		} else {
			System.out.println("Acao cancelada.");
		}
	}
	
	void listarHotel() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Hoteis.txt"));
		    String line;
		    //isso to puxando todas as linhas uma por uma
		    while((line = reader.readLine()) != null) {
		    	System.out.println(line);
		    }
		      	reader.close();
		    } 	
		catch (IOException e) {
		    	e.printStackTrace();
		    }
	}
	
	void removerHotel() {
		if(hoteis != null) {
			System.out.println("Qual hotel deseja remover do sistema: ");
			if(hoteis[0]!= null) {
				System.out.println("1- "+hotelNomes[0]);
				if(hoteis[1] != null) {
					System.out.println("2- "+hotelNomes[1]);
					if(hoteis[2] != null) {
						System.out.println("3- "+hotelNomes[2]);
						if(hoteis[3] != null) {
							System.out.println("4- "+hotelNomes[3]);
							if(hoteis[4] != null) {
								System.out.println("5- "+hotelNomes[4]);
							}
						} 
					} 
				} 
			}
			System.out.println("0- Cancelar operacao");
			opcao = scanner.nextInt();
			
			switch(opcao) {
			case 1:
				hoteis[0] = null;
				hotelNomes[0] = null;
				hotelDescricoes[0] = null;
				hotelQuartos[0] = 0;
				hotelEnderecos[0] = null;
			break;
			
			case 2:
				hoteis[1] = null;
				hotelNomes[1] = null;
				hotelDescricoes[1] = null;
				hotelQuartos[1] = 0;
				hotelEnderecos[1] = null;
			break;
			
			case 3:
				hoteis[2] = null;
				hotelNomes[2] = null;
				hotelDescricoes[2] = null;
				hotelQuartos[2] = 0;
				hotelEnderecos[2] = null;
			break;
			
			case 4:
				hoteis[3] = null;
				hotelNomes[3] = null;
				hotelDescricoes[3] = null;
				hotelQuartos[3] = 0;
				hotelEnderecos[3] = null;
			break;
			
			case 5:
				hoteis[4] = null;
				hotelNomes[4] = null;
				hotelDescricoes[4] = null;
				hotelQuartos[4] = 0;
				hotelEnderecos[4] = null;
			break;
			
			case 0:
				System.out.println("operacao cancelada");
			break;
			
			default:
				System.out.println("opcao invalida");
			break;
			}
		}
		else {
			System.out.println("Nao ha nenhum hotel para remover. ");
		}
		
	}
	
	void modificarHotel() {
		if(hoteis != null) {
			System.out.println("Qual hotel deseja Modificar no sistema: ");
			if(hoteis[0]!= null) {
				System.out.println("1- "+hotelNomes[0]);
				if(hoteis[1] != null) {
					System.out.println("2- "+hotelNomes[1]);
					if(hoteis[2] != null) {
						System.out.println("3- "+hotelNomes[2]);
						if(hoteis[3] != null) {
							System.out.println("4- "+hotelNomes[3]);
							if(hoteis[4] != null) {
								System.out.println("5- "+hotelNomes[4]);
							}
						} 
					} 
				} 
			}
			System.out.println("0- Cancelar operacao");
			opcao = scanner.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.print("Digite o novo nome do Hotel: ");
				nomeHotel = scanner.next();
				System.out.print("Digite o novo endereco do Hotel: ");
				enderecoHotel = scanner.next();
				System.out.print("Digite o novo numero de quartos do Hotel: ");
				quartosHotel = scanner.nextInt();
				System.out.print("Digite a nova descricao do Hotel: ");
				descricaoHotel = scanner.next();
				
				hotelNomes[0] = nomeHotel;
				hotelDescricoes[0] = descricaoHotel;
				hotelQuartos[0] = quartosHotel;
				hotelEnderecos[0] = enderecoHotel;
				System.out.println("Operacao concluida.");
			break;
			
			case 2:
				System.out.print("Digite o novo nome do Hotel: ");
				nomeHotel = scanner.next();
				System.out.print("Digite o novo endereco do Hotel: ");
				enderecoHotel = scanner.next();
				System.out.print("Digite o novo numero de quartos do Hotel: ");
				quartosHotel = scanner.nextInt();
				System.out.print("Digite a nova descricao do Hotel: ");
				descricaoHotel = scanner.next();
				
				hotelNomes[1] = nomeHotel;
				hotelDescricoes[1] = descricaoHotel;
				hotelQuartos[1] = quartosHotel;
				hotelEnderecos[1] = enderecoHotel;
				System.out.println("Operacao concluida.");
			break;
			
			case 3:
				System.out.print("Digite o novo nome do Hotel: ");
				nomeHotel = scanner.next();
				System.out.print("Digite o novo endereco do Hotel: ");
				enderecoHotel = scanner.next();
				System.out.print("Digite o novo numero de quartos do Hotel: ");
				quartosHotel = scanner.nextInt();
				System.out.print("Digite a nova descricao do Hotel: ");
				descricaoHotel = scanner.next();
				
				hotelNomes[2] = nomeHotel;
				hotelDescricoes[2] = descricaoHotel;
				hotelQuartos[2] = quartosHotel;
				hotelEnderecos[2] = enderecoHotel;
				System.out.println("Operacao concluida.");
			break;
			
			case 4:
				System.out.print("Digite o novo nome do Hotel: ");
				nomeHotel = scanner.next();
				System.out.print("Digite o novo endereco do Hotel: ");
				enderecoHotel = scanner.next();
				System.out.print("Digite o novo numero de quartos do Hotel: ");
				quartosHotel = scanner.nextInt();
				System.out.print("Digite a nova descricao do Hotel: ");
				descricaoHotel = scanner.next();
				
				hotelNomes[3] = nomeHotel;
				hotelDescricoes[3] = descricaoHotel;
				hotelQuartos[3] = quartosHotel;
				hotelEnderecos[3] = enderecoHotel;
				System.out.println("Operacao concluida.");
			break;
			
			case 5:
				System.out.print("Digite o novo nome do Hotel: ");
				nomeHotel = scanner.next();
				System.out.print("Digite o novo endereco do Hotel: ");
				enderecoHotel = scanner.next();
				System.out.print("Digite o novo numero de quartos do Hotel: ");
				quartosHotel = scanner.nextInt();
				System.out.print("Digite a nova descricao do Hotel: ");
				descricaoHotel = scanner.next();
				
				hotelNomes[4] = nomeHotel;
				hotelDescricoes[4] = descricaoHotel;
				hotelQuartos[4] = quartosHotel;
				hotelEnderecos[4] = enderecoHotel;
				System.out.println("Operacao concluida.");
			break;
			
			case 0:
				System.out.println("Operacao cancelada.");
			break;
			
			default:
				System.out.println("Opcao invalida.");
			break;
			
			}
		}
	}
	
	void verificarHotel() {
		if(hoteis != null) {
			System.out.println("Hoteis registrados no sistema: ");
			if(hoteis[0]!= null) {
				System.out.println("1- "+hoteis[0]);
				if(hoteis[1] != null) {
					System.out.println("2- "+hoteis[1]);
					if(hoteis[2] != null) {
						System.out.println("3- "+hoteis[2]);
						if(hoteis[3] != null) {
							System.out.println("4- "+hoteis[3]);
							if(hoteis[4] != null) {
								System.out.println("5- "+hoteis[4]);
							}
						} 
					} 
				} 
			}
		}
	}
	
	public String toString() {
		return nomeHotel + "\t" + enderecoHotel + "\t" + descricaoHotel + "\t" + quartosHotel;
	}
}
