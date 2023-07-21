package projeto;
import java.util.*;

public class Hotel {

	private String nomeHotel;
	private String enderecoHotel;
	private String descricaoHotel;
	private Integer quartoHotel;
	private Boolean hotelExiste;
	
	Scanner scanner = new Scanner(System.in);
	
	
	Hotel(String nomeHotel, String enderecoHotel, String descricaoHotel, Integer quartoHotel, Boolean hotelExiste){
		this.nomeHotel = nomeHotel;
		this.enderecoHotel = enderecoHotel;
		this.descricaoHotel = descricaoHotel;
		this.quartoHotel = quartoHotel;
		this.setHotelExiste(hotelExiste);
	}
	
	public void setNomeHotel(String nomeHotel) {
		this.nomeHotel = nomeHotel;
	}
	public void setEndereco(String enderecoHotel) {
		this.enderecoHotel = enderecoHotel;
	}
	public void setDescricao(String descricaoHotel) {
		this.descricaoHotel = descricaoHotel;
	}
	public void setQuarto(Integer quartoHotel) {
		this.quartoHotel = quartoHotel;
	}
	public String getNomeHotel() {
		return nomeHotel;
	}
	public String getEndereco() {
		return enderecoHotel;
	}
	public String getDescricao() {
		return descricaoHotel;
	}
	public Integer getQuarto() {
		return quartoHotel;
	}
	
	public void adicionarHotel() {
		try {
			System.out.print("Digite o nome do Hotel: ");
			String novoNome = scanner.next();
			setNomeHotel(novoNome);
			System.out.print("Digite o endereco do Hotel: ");
			String novoEndereco = scanner.next();
			setEndereco(novoEndereco);
			System.out.print("Digite uma breve descricao do Hotel: ");
			String novaDescricao = scanner.next();
			setDescricao(novaDescricao);
			System.out.print("Digite a quantidade de quartos disponiveis no Hotel: ");
			Integer novoQuarto = scanner.nextInt();
			setQuarto(novoQuarto);
		} catch(InputMismatchException e) {
			e.printStackTrace();
		}
	}
	
	public void removerHotel() {
		System.out.print("Tem certeza que deseja remover este hotel? (1)-Sim ; (2)-Nao");
		Integer opcao = scanner.nextInt();
		if(opcao.equals(1)) {
			setNomeHotel(null);
			setEndereco(null);
			setDescricao(null);
			setQuarto(0);
			System.out.println("Hotel removido com sucesso");
		}
		else {
			System.out.println("Operacao cancelada.");
		}
	}
	
	public void modificarHotel() {
		System.out.print("Tem certeza que deseja remover este hotel? (1)-Sim ; (2)-Nao");
		Integer opcao = scanner.nextInt();
		if(opcao.equals(1)) {
			try {
				System.out.print("Digite o nome do Hotel: ");
				String novoNome = scanner.next();
				setNomeHotel(novoNome);
				System.out.print("Digite o endereco do Hotel: ");
				String novoEndereco = scanner.next();
				setEndereco(novoEndereco);
				System.out.print("Digite uma breve descricao do Hotel: ");
				String novaDescricao = scanner.next();
				setDescricao(novaDescricao);
				System.out.print("Digite a quantidade de quartos disponiveis no Hotel: ");
				Integer novoQuarto = scanner.nextInt();
				setQuarto(novoQuarto);
			} catch(InputMismatchException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Operacao cancelada.");
		}
	}
	
	public void listarHotel() {
		System.out.println("Nome: " + getNomeHotel() + "\t Endereco: "+ getEndereco()+ "\t Nmr de quartos: "+ getQuarto() + "\t Descricao: "+ getDescricao());
	}
	
	public String toString() {
		return nomeHotel + "\t" + enderecoHotel + "\t" + descricaoHotel + "\t" + quartoHotel;
	}

	public Boolean getHotelExiste() {
		return hotelExiste;
	}

	public void setHotelExiste(Boolean hotelExiste) {
		this.hotelExiste = hotelExiste;
	}
}
