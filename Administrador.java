package projeto;
import java.util.*;
import java.io.*;

public class Administrador{
	
	ArrayList<String> hotelNomes = new ArrayList<>();
	ArrayList<String> hotelEnderecos = new ArrayList<>();
	ArrayList<String> hotelDescricoes = new ArrayList<>();
	ArrayList<Integer> hotelQuartos = new ArrayList<>();
	
	Scanner scanner =  new Scanner(System.in);
	int opcao;
	String nomeHotel;
	String enderecoHotel;
	String descricaoHotel;
	Integer quartosHotel;
	
	
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
				hotelNomes.add(nomeHotel);
				hotelEnderecos.add(enderecoHotel);
				hotelDescricoes.add(descricaoHotel);
				hotelQuartos.add(quartosHotel);
				
				System.out.println("Muito bem, o Hotel "+nomeHotel+" foi adicionado a rede de Hoteis.");
			} else {
				System.out.println("Transacao cancelada");
			}
		} else {
			System.out.println("Acao cancelada.");
		}
	}
	
	void removerHotel() {
		
	}
	
	void modificarHotel() {
		
	}
	
	void verificarHotel() {
		
	}
	
	public String toString() {
		for() {
			return;
		}
		
	}
	
	
	
	
	
}
