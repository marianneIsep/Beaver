package com.springapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Marianne on 10/12/14.
 */
@Entity
public class Participant {
    private int pId;

    @Id
    @Column(name = "pId", nullable = false, insertable = true, updatable = true)
    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Participant that = (Participant) o;

        if (pId != that.pId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return pId;
    }
}
