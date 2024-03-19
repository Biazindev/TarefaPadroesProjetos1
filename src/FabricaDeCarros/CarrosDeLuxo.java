package FabricaDeCarros;

//Classe concreta para Carro de Luxo

public class CarrosDeLuxo implements Carros {

	private Double Audi;
	private String nome;
	private String valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	@Override
		public void assemble() {
	        System.out.println("Audi Montando carro de luxo:");
	        System.out.println();
	        }
	public Double getAudi() {
		return Audi;
	}
	public void setAudi(Double audi) {
		Audi = audi;
	}
		
	}


