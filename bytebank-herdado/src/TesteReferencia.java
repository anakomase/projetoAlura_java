
public class TesteReferencia {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("marcos");
		g1.setSalario(5000.0);
		
	
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		
		
	}

}
