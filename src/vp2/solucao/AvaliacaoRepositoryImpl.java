package vp2.solucao;

public class AvaliacaoRepositoryImpl 
				implements AvaliacaoRepository {
	
	Media media;
	
	public void media(double vp1, double vp2, double vf) {
		media = new Media(vp1, vp2, vf);
		System.out.println(media.media());
	}

}
