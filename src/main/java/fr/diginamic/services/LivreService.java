package fr.diginamic.services;

import fr.diginamic.entites.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LivreService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tp02Jpa");

    public void ajouterLivre(String titre, String auteur) {
        EntityManager em = emf.createEntityManager();

        Livre livre = new Livre(titre, auteur);

        em.getTransaction().begin();
        em.persist(livre);
        em.getTransaction().commit();

        em.close();
    }
}
