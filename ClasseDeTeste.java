public class ClassDeTeste {
	
	public static void main(String[] args) {
		// configure seu personagem
		Personagem p = new Personagem("<seu nome aqui>", 100);
		
		// escolha sua(s) arma(s)
		Arma opc1 = new CorpoACorpo("adaga", 14, 20);
		Arma opc2 = new CorpoACorpo("espada curta", 16, 25);
		Arma opc3 = new AtaqueADistancia("arco", 18, 40);
		Arma opc4 = new AtaqueADistancia("mosquetão", 28, 12);
		
		p.equiparArma(opc1);
		
		//carregue uma poção
		Pocao pocaoDeCura = new Pocao("Poção Básica de Cura", 15);
		p.addPocao(pocaoDeCura);
		
		// cheque seus status
		System.out.println(p.status());
		
		//receba um ataque com uma das armas
		p.sofrerDano(opc3.atacar());
		p.recuperarVida();
		
		// cheque seus status para ver se a poção funcionou
		System.out.println(p.status());
		
		// agora, para dar gameover, tente sofrer vários ataques consecutivos
		try {
			while(true) {
				p.sofrerDano(opc4.atacar());
			}
		} catch (PersonagemFalecidoException e) {
			System.out.println(e.getMessage());
		}
	}

}
