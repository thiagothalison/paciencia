package paciencia;

import java.util.ArrayList;
import java.util.Collection;

import br.ufsc.inf.leobr.cliente.*;
import paciencia.Regras.*;

public class EstadoInicial implements Jogada{

    public Collection<ArrayList<Pilha>> pilhas;
    public Collection<ArrayList<Bagaco>> bagacos;
    public Collection<ArrayList<Restrito>> restritos;
    public Collection<ArrayList<Sequencia>> sequencias;
    public Collection<ArrayList<Baralho>> baralhos;
    public int jogadorInicial;
	public Collection<ArrayList<Pilha>> getPilhas() {
		return pilhas;
	}
	public void setPilhas(Collection<ArrayList<Pilha>> pilhas) {
		this.pilhas = pilhas;
	}
	public Collection<ArrayList<Bagaco>> getBagacos() {
		return bagacos;
	}
	public void setBagacos(Collection<ArrayList<Bagaco>> bagacos) {
		this.bagacos = bagacos;
	}
	public Collection<ArrayList<Restrito>> getRestritos() {
		return restritos;
	}
	public void setRestritos(Collection<ArrayList<Restrito>> restritos) {
		this.restritos = restritos;
	}
	public Collection<ArrayList<Sequencia>> getSequencias() {
		return sequencias;
	}
	public void setSequencias(Collection<ArrayList<Sequencia>> sequencias) {
		this.sequencias = sequencias;
	}
	public Collection<ArrayList<Baralho>> getBaralhos() {
		return baralhos;
	}
	public void setBaralhos(Collection<ArrayList<Baralho>> baralhos) {
		this.baralhos = baralhos;
	}
	public int getJogadorInicial() {
		return jogadorInicial;
	}
	public void setJogadorInicial(int jogadorInicial) {
		this.jogadorInicial = jogadorInicial;
	}
    
    

}