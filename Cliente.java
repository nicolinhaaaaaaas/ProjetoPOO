package projeto;

import java.util.Scanner;

public class Cliente extends Hotel{
	
	Scanner scanner = new Scanner(System.in);

	Cliente(String nomeHotel, String enderecoHotel, String descricaoHotel, Integer quartoHotel, Boolean hotelExiste, String nomeCliente) {
		super(nomeHotel, enderecoHotel, descricaoHotel, quartoHotel, hotelExiste);
		this.nomeCliente = nomeCliente;
	}

	private String nomeCliente;
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void escolherHotel() {
		// so pra testar
		System.out.println(super.getQuarto());
		
		System.out.print("Quantos quartos deseja alugar? ");
		int alugarQuartos = scanner.nextInt();
		
		int quartosRestantes = super.getQuarto() - alugarQuartos;
		
		super.setQuarto(quartosRestantes);
		
		System.out.println("Aluguel bem sucedido!");
		
		// pra testar
		System.out.println(super.getQuarto());
	}
	
	// public void avaliacao(){
	
}
