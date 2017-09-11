package entities;

import entities.Car;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-11T11:39:22")
@StaticMetamodel(Train.class)
public class Train_ { 

    public static volatile ListAttribute<Train, Car> cars;
    public static volatile SingularAttribute<Train, Integer> TrainID;
    public static volatile SingularAttribute<Train, String> status;

}