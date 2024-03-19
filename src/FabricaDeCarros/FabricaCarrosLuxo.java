package FabricaDeCarros;
//Fábrica concreta para carros de luxo

public class FabricaCarrosLuxo implements FabricaDeCarros {
	public static String Valor;
	public static String Nome;

	public Carros criarCarro() {
        return new CarrosDeLuxo();
    }

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

}