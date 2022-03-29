package rinhaDeHumano;

public class main {

	public static void main(String[] args) {
		Lutadores l[] = new Lutadores[6];
		
		l[0] = new Lutadores("ratatouille", "frança", 31, 1.75, 68.9, 11, 2 , 1);
		
		l[1] = new Lutadores("gostosão", "Brasil", 29, 1.68, 57.8, 14, 2 , 3);
		
		l[2] = new Lutadores("Misterlombalomba", "EUA", 35, 1.65, 80.2, 12, 2 , 1);
		
		l[3] = new Lutadores("Aranha", "Australia", 28, 1.93, 81.5, 13, 0 , 2);
		
		l[4] = new Lutadores("Teixeira", "Brasil", 37, 1.72, 74.4, 8, 0 , 0);
		
		l[5] = new Lutadores("Pimenta", "México", 30, 1.78, 105.8, 10, 4 , 1);
		
		//l[4].status();
		
		Luta RDH = new Luta();
		
		RDH.marcarluta(l[0], l[1]);
		RDH.lutar();
		
	}

}
