package sio.devoir2magazine.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "pigiste", schema = "bddMagazine")
public class Pigiste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPigiste", nullable = false)
    private Integer id;

    @Column(name = "nomPigiste", nullable = false, length = 100)
    private String nomPigiste;

    @Column(name = "prixFeuillet", nullable = false)
    private Double prixFeuillet;

    @OneToMany(mappedBy = "numPig")
    private Set<Article> articles = new LinkedHashSet<>();

    @ManyToMany
    private Set<Specialite> specialites = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomPigiste() {
        return nomPigiste;
    }

    public void setNomPigiste(String nomPigiste) {
        this.nomPigiste = nomPigiste;
    }

    public Double getPrixFeuillet() {
        return prixFeuillet;
    }

    public void setPrixFeuillet(Double prixFeuillet) {
        this.prixFeuillet = prixFeuillet;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    public Set<Specialite> getSpecialites() {
        return specialites;
    }

    public void setSpecialites(Set<Specialite> specialites) {
        this.specialites = specialites;
    }

}