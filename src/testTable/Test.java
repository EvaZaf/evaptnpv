/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testTable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author cgntuser
 */
@Entity
@Table(name = "test", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Test.findAll", query = "SELECT t FROM Test t")
    , @NamedQuery(name = "Test.findByUsername", query = "SELECT t FROM Test t WHERE t.username = :username")
    , @NamedQuery(name = "Test.findByArxkostos", query = "SELECT t FROM Test t WHERE t.arxkostos = :arxkostos")
    , @NamedQuery(name = "Test.findByEpitokio", query = "SELECT t FROM Test t WHERE t.epitokio = :epitokio")
    , @NamedQuery(name = "Test.findByXronia", query = "SELECT t FROM Test t WHERE t.xronia = :xronia")
    , @NamedQuery(name = "Test.findByResult", query = "SELECT t FROM Test t WHERE t.result = :result")
    , @NamedQuery(name = "Test.findByDate", query = "SELECT t FROM Test t WHERE t.date = :date")
    , @NamedQuery(name = "Test.findByTime", query = "SELECT t FROM Test t WHERE t.time = :time")})
public class Test implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "arxkostos")
    private int arxkostos;
    @Column(name = "epitokio")
    private String epitokio;
    @Basic(optional = false)
    @Column(name = "xronia")
    private String xronia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "result")
    private Double result;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;

    public Test() {
    }

    public Test(String username) {
        this.username = username;
    }

    public Test(String username, int arxkostos, String xronia) {
        this.username = username;
        this.arxkostos = arxkostos;
        this.xronia = xronia;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public int getArxkostos() {
        return arxkostos;
    }

    public void setArxkostos(int arxkostos) {
        int oldArxkostos = this.arxkostos;
        this.arxkostos = arxkostos;
        changeSupport.firePropertyChange("arxkostos", oldArxkostos, arxkostos);
    }

    public String getEpitokio() {
        return epitokio;
    }

    public void setEpitokio(String epitokio) {
        String oldEpitokio = this.epitokio;
        this.epitokio = epitokio;
        changeSupport.firePropertyChange("epitokio", oldEpitokio, epitokio);
    }

    public String getXronia() {
        return xronia;
    }

    public void setXronia(String xronia) {
        String oldXronia = this.xronia;
        this.xronia = xronia;
        changeSupport.firePropertyChange("xronia", oldXronia, xronia);
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        Double oldResult = this.result;
        this.result = result;
        changeSupport.firePropertyChange("result", oldResult, result);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test)) {
            return false;
        }
        Test other = (Test) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testTable.Test[ username=" + username + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
