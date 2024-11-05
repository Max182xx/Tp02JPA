package fr.diginamic.entites;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToMany
    @JoinTable(
            name = "emprunt_livre",
            joinColumns = @JoinColumn(name = "emprunt_id"),
            inverseJoinColumns = @JoinColumn(name = "livre_id")
    )
    private Set<Livre> livres;

    // Constructeurs, getters, setters et toString()
    public Emprunt() {}

    public Emprunt(Client client, Set<Livre> livres) {
        this.client = client;
        this.livres = livres;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public Set<Livre> getLivres() { return livres; }
    public void setLivres(Set<Livre> livres) { this.livres = livres; }

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id +
                ", client=" + client +
                ", livres=" + livres +
                '}';
    }
}
