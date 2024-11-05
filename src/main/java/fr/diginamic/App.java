package fr.diginamic;

import fr.diginamic.entites.Client;
import fr.diginamic.services.ClientService;
import fr.diginamic.services.EmpruntService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        // Initialiser l'EntityManagerFactory et l'EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nom_de_persistence_unit");
        EntityManager em = emf.createEntityManager();

        try {
            // Instancier les services avec l'EntityManager
            ClientService clientService = new ClientService(em);
            EmpruntService empruntService = new EmpruntService(em);

            // Extraire un client et ses emprunts
            Client client = clientService.getClientWithEmprunts(1); // 1 = ID du client
            System.out.println("Client: " + client.getNom());
            client.getEmprunts().forEach(emprunt -> System.out.println("Emprunt ID: " + emprunt.getId()));


        } finally {
            // Fermer l'EntityManager et l'EntityManagerFactory
            em.close();
            emf.close();
        }
    }
}
