package fr.diginamic.services;

import fr.diginamic.entites.Emprunt;
import jakarta.persistence.EntityManager;

public class EmpruntService {

    private EntityManager entityManager;

    public EmpruntService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Emprunt getEmpruntWithLivres(int empruntId) {
        return entityManager.find(Emprunt.class, empruntId);
    }
}
