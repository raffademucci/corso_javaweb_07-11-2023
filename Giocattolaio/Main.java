package Giocattolaio;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        List <Vendita> vendita = new ArrayList<>();
        
        Giocattolo g1=new Giocattolo(1, "macchinina", 12, 12);
        Giocattolo g2=new Giocattolo(2, "pallone", 15, 18);
        Giocattolo g3=new Giocattolo(3, "puzzle", 6, 6);
        
        Cliente c1=new Cliente(1, "Raffaele", "raffaeledemucci2020@gmail.com");
        Cliente c2=new Cliente(1, "Nicola", "nicola.balducci@gmail.com");
        Cliente c3=new Cliente(1, "Mirko", "Mirko2021@gmail.com");
    }
}
