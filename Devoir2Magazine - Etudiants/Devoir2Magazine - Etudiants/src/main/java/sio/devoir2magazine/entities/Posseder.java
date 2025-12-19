package sio.devoir2magazine.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "posseder", schema = "bddMagazine")
public class Posseder {
    @EmbeddedId
    private PossederId id;

    @MapsId("numSpe")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numSpe", nullable = false)
    private Specialite numSpe;

    @MapsId("numPig")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "numPig", nullable = false)
    private Pigiste numPig;

    public PossederId getId() {
        return id;
    }

    public void setId(PossederId id) {
        this.id = id;
    }

    public Specialite getNumSpe() {
        return numSpe;
    }

    public void setNumSpe(Specialite numSpe) {
        this.numSpe = numSpe;
    }

    public Pigiste getNumPig() {
        return numPig;
    }

    public void setNumPig(Pigiste numPig) {
        this.numPig = numPig;
    }

}