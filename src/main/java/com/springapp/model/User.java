package com.springapp.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Marianne on 10/12/14.
 */
@Entity
public class User {
    private int uId;
    private String uPseudo;
    private String uPassword;
    private String uMail;
    private int uState;

    @Id
    @Column(name = "uId", nullable = false, insertable = true, updatable = true)
    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    @Basic
    @Column(name = "uPseudo", nullable = false, insertable = true, updatable = true, length = 255)
    public String getuPseudo() {
        return uPseudo;
    }

    public void setuPseudo(String uPseudo) {
        this.uPseudo = uPseudo;
    }

    @Basic
    @Column(name = "uPassword", nullable = false, insertable = true, updatable = true, length = 50)
    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    @Basic
    @Column(name = "uMail", nullable = false, insertable = true, updatable = true, length = 255)
    public String getuMail() {
        return uMail;
    }

    public void setuMail(String uMail) {
        this.uMail = uMail;
    }

    @Basic
    @Column(name = "uState", nullable = false, insertable = true, updatable = true)
    public int getuState() {
        return uState;
    }

    public void setuState(int uState) {
        this.uState = uState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (uId != user.uId) return false;
        if (uState != user.uState) return false;
        if (uMail != null ? !uMail.equals(user.uMail) : user.uMail != null) return false;
        if (uPassword != null ? !uPassword.equals(user.uPassword) : user.uPassword != null) return false;
        if (uPseudo != null ? !uPseudo.equals(user.uPseudo) : user.uPseudo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uId;
        result = 31 * result + (uPseudo != null ? uPseudo.hashCode() : 0);
        result = 31 * result + (uPassword != null ? uPassword.hashCode() : 0);
        result = 31 * result + (uMail != null ? uMail.hashCode() : 0);
        result = 31 * result + uState;
        return result;
    }
}
