package com.springapp.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Marianne on 10/12/14.
 */
@Entity
public class Event {
    private int eId;
    private String eTitle;
    private String eDescription;
    private Timestamp eCreationDate;
    private Timestamp eBeginDate;
    private Timestamp eEndDate;

    @Id
    @Column(name = "eId", nullable = false, insertable = true, updatable = true)
    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    @Basic
    @Column(name = "eTitle", nullable = false, insertable = true, updatable = true, length = 25)
    public String geteTitle() {
        return eTitle;
    }

    public void seteTitle(String eTitle) {
        this.eTitle = eTitle;
    }

    @Basic
    @Column(name = "eDescription", nullable = true, insertable = true, updatable = true, length = 255)
    public String geteDescription() {
        return eDescription;
    }

    public void seteDescription(String eDescription) {
        this.eDescription = eDescription;
    }

    @Basic
    @Column(name = "eCreationDate", nullable = true, insertable = true, updatable = true)
    public Timestamp geteCreationDate() {
        return eCreationDate;
    }

    public void seteCreationDate(Timestamp eCreationDate) {
        this.eCreationDate = eCreationDate;
    }

    @Basic
    @Column(name = "eBeginDate", nullable = true, insertable = true, updatable = true)
    public Timestamp geteBeginDate() {
        return eBeginDate;
    }

    public void seteBeginDate(Timestamp eBeginDate) {
        this.eBeginDate = eBeginDate;
    }

    @Basic
    @Column(name = "eEndDate", nullable = true, insertable = true, updatable = true)
    public Timestamp geteEndDate() {
        return eEndDate;
    }

    public void seteEndDate(Timestamp eEndDate) {
        this.eEndDate = eEndDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (eId != event.eId) return false;
        if (eBeginDate != null ? !eBeginDate.equals(event.eBeginDate) : event.eBeginDate != null) return false;
        if (eCreationDate != null ? !eCreationDate.equals(event.eCreationDate) : event.eCreationDate != null)
            return false;
        if (eDescription != null ? !eDescription.equals(event.eDescription) : event.eDescription != null) return false;
        if (eEndDate != null ? !eEndDate.equals(event.eEndDate) : event.eEndDate != null) return false;
        if (eTitle != null ? !eTitle.equals(event.eTitle) : event.eTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eId;
        result = 31 * result + (eTitle != null ? eTitle.hashCode() : 0);
        result = 31 * result + (eDescription != null ? eDescription.hashCode() : 0);
        result = 31 * result + (eCreationDate != null ? eCreationDate.hashCode() : 0);
        result = 31 * result + (eBeginDate != null ? eBeginDate.hashCode() : 0);
        result = 31 * result + (eEndDate != null ? eEndDate.hashCode() : 0);
        return result;
    }
}
