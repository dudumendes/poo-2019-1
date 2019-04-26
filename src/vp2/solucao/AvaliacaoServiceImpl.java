package vp2.solucao;

public class AvaliacaoServiceImpl 
					implements AvaliacaoService {
	
	private AvaliacaoRepository repository =
			new AvaliacaoRepositoryImpl();
	
	public void media(double vp1, double vp2, double vf) {
		repository.media(vp1, vp2, vf);
	}

}
