package vp2.solucao;

public class Media {
	private double vp1, vp2, vf;
	
	public Media(double vp1, double vp2, double vf) {
		this.vp1 = vp1;
		this.vp2 = vp2;
		this.vf = vf;
	}
	
	public double media() {
		return (vp1 + vp2 + vf)/3;
	}
}
