package com.springapp.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Marianne on 10/12/14.
 */
@Entity
public class Debt {
    private int dId;
    private int dAmount;
    private boolean dState;

    @Id
    @Column(name = "dId", nullable = false, insertable = true, updatable = true)
    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    @Basic
    @Column(name = "dAmount", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getdAmount() {
        return dAmount;
    }

    public void setdAmount(int dAmount) {
        this.dAmount = dAmount;
    }

    @Basic
    @Column(name = "dState", nullable = false, insertable = true, updatable = true)
    public boolean isdState() {
        return dState;
    }

    public void setdState(boolean dState) {
        this.dState = dState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Debt debt = (Debt) o;

        if (dAmount != debt.dAmount) return false;
        if (dId != debt.dId) return false;
        if (dState != debt.dState) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dId;
        result = 31 * result + dAmount;
        result = 31 * result + (dState ? 1 : 0);
        return result;
    }
}
