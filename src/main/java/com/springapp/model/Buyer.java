package com.springapp.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Marianne on 10/12/14.
 */
@Entity
public class Buyer {
    private int bId;
    private int bValue;
    private String bTitle;
    private String bDescription;

    @Id
    @Column(name = "bId", nullable = false, insertable = true, updatable = true)
    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    @Basic
    @Column(name = "bValue", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getbValue() {
        return bValue;
    }

    public void setbValue(int bValue) {
        this.bValue = bValue;
    }

    @Basic
    @Column(name = "bTitle", nullable = false, insertable = true, updatable = true, length = 255)
    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }

    @Basic
    @Column(name = "bDescription", nullable = true, insertable = true, updatable = true, length = 255)
    public String getbDescription() {
        return bDescription;
    }

    public void setbDescription(String bDescription) {
        this.bDescription = bDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Buyer buyer = (Buyer) o;

        if (bId != buyer.bId) return false;
        if (bValue != buyer.bValue) return false;
        if (bDescription != null ? !bDescription.equals(buyer.bDescription) : buyer.bDescription != null) return false;
        if (bTitle != null ? !bTitle.equals(buyer.bTitle) : buyer.bTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bId;
        result = 31 * result + bValue;
        result = 31 * result + (bTitle != null ? bTitle.hashCode() : 0);
        result = 31 * result + (bDescription != null ? bDescription.hashCode() : 0);
        return result;
    }
}
