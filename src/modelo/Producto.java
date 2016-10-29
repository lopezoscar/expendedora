package modelo;

public class Producto {

	private String marca;
	
	private String modelo;
	
	private int fichas;
	
	public Producto(String marca, String modelo, int fichas){
		this.marca = marca;
		this.modelo = modelo;
		this.fichas = fichas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getFichas() {
		return fichas;
	}

	public void setFichas(int fichas) {
		this.fichas = fichas;
	}

	@Override
	public String toString() {
		return "Producto [marca=" + marca + ", modelo=" + modelo + ", fichas=" + fichas + "]";
	}
	
	
	
}
