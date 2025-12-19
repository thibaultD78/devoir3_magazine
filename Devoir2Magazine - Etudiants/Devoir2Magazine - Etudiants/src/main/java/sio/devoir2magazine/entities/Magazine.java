package sio.devoir2magazine.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "magazine", schema = "bddMagazine")
public class Magazine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMag", nullable = false)
    private Integer id;

    @Column(name = "nomMag", nullable = false, length = 100)
    private String nomMag;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numSpecialite", nullable = false)
    private Specialite numSpecialite;

    @OneToMany(mappedBy = "numMag")
    private Set<Article> articles = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomMag() {
        return nomMag;
    }

    public void setNomMag(String nomMag) {
        this.nomMag = nomMag;
    }

    public Specialite getNumSpecialite() {
        return numSpecialite;
    }

    public void setNumSpecialite(Specialite numSpecialite) {
        this.numSpecialite = numSpecialite;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

}