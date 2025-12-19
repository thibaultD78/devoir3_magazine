package sio.devoir2magazine.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PossederId implements Serializable {
    private static final long serialVersionUID = -4034096765292308470L;
    @Column(name = "numSpe", nullable = false)
    private Integer numSpe;

    @Column(name = "numPig", nullable = false)
    private Integer numPig;

    public Integer getNumSpe() {
        return numSpe;
    }

    public void setNumSpe(Integer numSpe) {
        this.numSpe = numSpe;
    }

    public Integer getNumPig() {
        return numPig;
    }

    public void setNumPig(Integer numPig) {
        this.numPig = numPig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PossederId entity = (PossederId) o;
        return Objects.equals(this.numPig, entity.numPig) &&
                Objects.equals(this.numSpe, entity.numSpe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numPig, numSpe);
    }

}