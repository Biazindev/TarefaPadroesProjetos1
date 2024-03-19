package FabricaDeCarros;
//Cliente

public class Cliente {

    public static void main(String[] args) {
        
        // Criando uma fábrica de carros de luxo
        FabricaCarrosLuxo fabricaCarrosLuxo = new FabricaCarrosLuxo();
        fabricaCarrosLuxo.setNome("Audi A5");
        fabricaCarrosLuxo.setValor("R$ 130 mil");
        
        // Criando um carro de luxo
        Carros carroDeLuxo = fabricaCarrosLuxo.criarCarro();
        carroDeLuxo.assemble();
        
        System.out.println("Montando um " + fabricaCarrosLuxo.getNome() + " " + fabricaCarrosLuxo.getValor());
        System.out.println();


        // Criando uma fábrica de carros populares
        FabricaDeCarros fabricaDeCarrosPopulares = new FabricaCarrosPopulares();
        
        // Criando uma instância de FabricaCarrosPopulares
        FabricaCarrosPopulares fabricaCarrosPopulares = new FabricaCarrosPopulares();
        fabricaCarrosPopulares.setNome("Gol Trend");
        fabricaCarrosPopulares.setValor("R$ 90 mil");
        
        // Criando um carro popular
        Carros carroPopular = fabricaCarrosPopulares.criarCarro();
        carroPopular.assemble();
        
        System.out.println("Montando um " + fabricaCarrosPopulares.getNome()+ " " + "Valor: " + fabricaCarrosPopulares.getValor());
    }
}
