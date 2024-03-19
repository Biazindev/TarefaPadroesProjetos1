		package FabricaDeCarros;
		// Classe concreta para Carro de Luxo

		public class CarrosPopulares implements Carros {
			
			private Double Gol;
			
			@Override
			    public void assemble() {
			        System.out.println(" Volkswagem Montando carro popular:");
			        System.out.println();

			    }
	
			public Double getGol() {
				return Gol;
			}
	
			public void setGol(Double gol) {
				Gol = gol;
			}
	
			}
		
