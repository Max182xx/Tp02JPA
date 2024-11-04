package fr.diginamic;

public class App {
    public static void main(String[] args) {
        LivreService service = new LivreService();
        service.ajouterLivre("1984", "George Orwell");
        System.out.println("Livre ajouté avec succès !");
    }
}
