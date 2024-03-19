package FabricaDeCarros;

public class FabricaCarrosPopulares implements FabricaDeCarros {
	// Fábrica concreta para carros de populares

	public static String Valor;
	public static String Nome;

	public static String getValor() {
		return Valor;
	}

	public static void setValor(String valor) {
		Valor = valor;
	}

	public static String getNome() {
		return Nome;
	}

	public static void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public Carros criarCarro() {
		return new CarrosPopulares();
	}
}
