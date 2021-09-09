package interfaces;

public class Oficina implements Manutencao{

	@Override
	public void trocaPneu() {
		
		
	}

	@Override
	public void trocaOleo() {
	
	}

	public void abastecer(String combustivel) {
       System.out.println("abastecido com:" + combustivel);
    }
	
	public static void main(String[] args) { 
		 Oficina o = new Oficina();
	   o.abastecer("Gasolina");
	}
	
}

	
