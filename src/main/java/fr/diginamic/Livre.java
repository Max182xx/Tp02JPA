package fr.diginamic;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String auteur;

    // Constructeurs, getters et setters
    public Livre() {}

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }
}

