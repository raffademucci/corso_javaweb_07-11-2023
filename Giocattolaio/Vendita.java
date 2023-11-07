package Giocattolaio;

import java.util.ArrayList;

public class Vendita {
    Giocattolo giocattolo;
    Cliente cliente;

    public Vendita(Giocattolo giocattolo, Cliente cliente){
        this.giocattolo=giocattolo;
        this.cliente=cliente;
    }

    @Override
    public String toString() {
        return giocattolo.toString()+" "+cliente.toString();
    }
}

