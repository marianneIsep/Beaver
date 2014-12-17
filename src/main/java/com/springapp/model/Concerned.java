package com.springapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Marianne on 10/12/14.
 */
@Entity
public class Concerned {
    private int cId;

    @Id
    @Column(name = "cId", nullable = false, insertable = true, updatable = true)
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Concerned concerned = (Concerned) o;

        if (cId != concerned.cId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return cId;
    }
}
