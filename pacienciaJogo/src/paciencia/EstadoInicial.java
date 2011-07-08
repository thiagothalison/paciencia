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

}