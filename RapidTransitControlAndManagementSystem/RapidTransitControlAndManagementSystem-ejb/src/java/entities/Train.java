/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Julian as admin
 */
@Entity
public class Train implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer TrainID;
    
    private String status;

    @OneToMany(mappedBy = "train")
    private List<Car> cars;

    public Train() {
        this.cars = new ArrayList<Car>();
    }

    
    
    
    
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    
    /**
     * Get the value of status
     *
     * @return the value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the value of status
     *
     * @param status new value of status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTrainID() {
        return TrainID;
    }

    public void setTrainID(Integer TrainID) {
        this.TrainID = TrainID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (TrainID != null ? TrainID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the TrainID fields are not set
        if (!(object instanceof Train)) {
            return false;
        }
        Train other = (Train) object;
        if ((this.TrainID == null && other.TrainID != null) || (this.TrainID != null && !this.TrainID.equals(other.TrainID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Train[ id=" + TrainID + " ]";
    }
    
}
