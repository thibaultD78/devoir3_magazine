package sio.devoir2magazine.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "specialite", schema = "bddMagazine")
public class Specialite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSpe", nullable = false)
    private Integer id;

    @Column(name = "nomSpe", nullable = false, length = 100)
    private String nomSpe;

    @OneToMany(mappedBy = "numSpecialite")
    private Set<Magazine> magazines = new LinkedHashSet<>();

    @ManyToMany
    private Set<Pigiste> pigistes = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomSpe() {
        return nomSpe;
    }

    public void setNomSpe(String nomSpe) {
        this.nomSpe = nomSpe;
    }

    public Set<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(Set<Magazine> magazines) {
        this.magazines = magazines;
    }

    public Set<Pigiste> getPigistes() {
        return pigistes;
    }

    public void setPigistes(Set<Pigiste> pigistes) {
        this.pigistes = pigistes;
    }

}