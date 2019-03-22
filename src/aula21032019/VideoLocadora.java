package aula21032019;

import java.util.ArrayList;

public class VideoLocadora {
	private String nomeFantasia, ultimoFilmeAlugado;
	public ArrayList<String> catalogoDeFilmes;
	public ArrayList<String> videosAlugados;
	public int diasDeCarencia = 2;

	public void sugerirOutroItemAoCliente() {
		int indice = sortearIndiceCatalogo();

		System.out.println("Este filme tambem eh muito bom: " + catalogoDeFilmes.get(indice));
	}

	public void alugarItem(String nome) {
		if (videosAlugados.contains(nome)) {
			System.out.println("Nao ha copias disponiveis para alugar");
		} else {
			videosAlugados.add(nome);
			ultimoFilmeAlugado = nome;
			System.out.println("Filme alugado com sucesso");
		}
	}

	public void receberItem(String filme, int diasLocado) {
		if(videosAlugados != null
				&& !videosAlugados.isEmpty()
				&& videosAlugados.contains(filme)) {
			
			if(diasLocado > diasDeCarencia) {
				System.out.println("Pague 100 paus");
			}
			videosAlugados.remove(filme);
			System.out.println("Filme alugado com sucesso");
		}
	}
	
	public void inicilizarListas() {
		videosAlugados = new ArrayList<String>();
		catalogoDeFilmes = new ArrayList<String>();
	}
	
	public int sortearIndiceCatalogo() {
		int indice = (int) Math.random() * catalogoDeFilmes.size();
		return indice;
	}
}
