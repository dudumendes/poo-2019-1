package vp2.solucao;

public class AvaliacaoController {
	private AvaliacaoService avaliacaoService =
						new AvaliacaoServiceImpl();
	
	public void media(double vp1, double vp2, double vf) {
		avaliacaoService.media(vp1, vp2, vf);
	}

}
