package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Hotel{
	
	ArrayList<String> Avaliacoes = new ArrayList<>();
	
	Scanner scanner = new Scanner(System.in);

	Cliente(String nomeHotel, String enderecoHotel, String descricaoHotel, Integer quartoHotel, Boolean hotelExiste, String nomeCliente, Boolean ocupandoQuarto) {
		super(nomeHotel, enderecoHotel, descricaoHotel, quartoHotel, hotelExiste);
		this.nomeCliente = nomeCliente;
		this.ocupandoQuarto = ocupandoQuarto;
	}

	private String avaliacao;
	private String nomeCliente;
	private Boolean ocupandoQuarto = false;
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void irEmbora() {
		if(ocupandoQuarto.equals(true)) {
			System.out.print("Deseja mesmo parar de alugar este quarto? ");
			String resposta = scanner.next();
			if(resposta.equals("sim")) {
				System.out.println("Voce saiu do quarto");
				super.setQuarto(super.getQuarto() + 1);
			}
			else {
				System.out.println("operacao cancelada");
			}
		}
		else {
			System.out.println("Voce nao ta em nenhum quarto");
		}
	}
	
	public void escolherHotel() {
		// so pra testar
		System.out.println(super.getQuarto());
		
		if(ocupandoQuarto.equals(false)) {
			System.out.print("Deseja mesmo alugar um quarto desse hotel? ");
			String resposta = scanner.next();
			if(resposta.equals("sim")) {
				System.out.println("Voce alugou esse quarto");
				super.setQuarto(super.getQuarto() - 1);
			}
			else {
				System.out.println("Operacao cancelada");
			}
		}
		else {
			System.out.println("Voce ja esta alugando um quarto");
		}
		
		// pra testar
		System.out.println(super.getQuarto());
	}
	public Boolean getOcupandoQuarto() {
		return ocupandoQuarto;
	}
	public void setOcupandoQuarto(Boolean ocupandoQuarto) {
		this.ocupandoQuarto = ocupandoQuarto;
	}
	
	public void avaliacao(){
		System.out.print("Deseja deixar uma avaliacao sobre o quarto? ");
		String resposta = scanner.next();
		
		if(resposta.equals("sim")) {
			System.out.println("Por favor, digite sua avaliacao:");
			setAvaliacao(scanner.next());
			Avaliacoes.add(getAvaliacao());
			System.out.println("Sua review foi salva no sistema.");
		}
		else {
			System.out.println("Operacao cancelada");
		}
	}
	
	public String getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}
