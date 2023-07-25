package projeto;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Hotel implements Serializable{

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
		this.hotelExiste = hotelExiste;
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
	
	public static void salvarHotel(Hotel hotel) {
		try {
            FileOutputStream fileOut = new FileOutputStream("hoteis.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(hotel);
            objectOut.close();
            fileOut.close();
            System.out.println("Hotel salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static Hotel carregarHotel() {
		 Hotel hotel = null;

	        try {
	            FileInputStream fileIn = new FileInputStream("hoteis.ser");
	            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
	            hotel = (Hotel) objectIn.readObject();
	            objectIn.close();
	            fileIn.close();
	            System.out.println("Hotel carregado com sucesso!");
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	        return hotel;
		}

	}
