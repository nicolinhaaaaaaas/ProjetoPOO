package projeto;
import java.util.*;

public class Hotel {

	private String nomeHotel;
	private String enderecoHotel;
	private String descricaoHotel;
	private Integer quartoHotel;
	
	
	Hotel(String nomeHotel, String enderecoHotel, String descricaoHotel, Integer quartoHotel){
		this.nomeHotel = nomeHotel;
		this.enderecoHotel = enderecoHotel;
		this.descricaoHotel = descricaoHotel;
		this.quartoHotel = quartoHotel;
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
		
		
	}
	
	public void removerHotel() {
		
	}
	
	public void modificarHotel() {
		
	}
	
	public String toString() {
		return nomeHotel + enderecoHotel + descricaoHotel + quartoHotel;
	}
}
