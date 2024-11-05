package fr.diginamic.services;

import fr.diginamic.entites.Client;
import jakarta.persistence.EntityManager;

public class ClientService {

    private EntityManager entityManager;

    public ClientService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Client getClientWithEmprunts(int clientId) {
        return entityManager.find(Client.class, clientId);
    }
}
