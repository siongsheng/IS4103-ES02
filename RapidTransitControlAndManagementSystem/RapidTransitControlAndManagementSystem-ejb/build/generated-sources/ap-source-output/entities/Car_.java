package entities;

import entities.Train;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-09T15:07:10")
@StaticMetamodel(Car.class)
public class Car_ { 

    public static volatile SingularAttribute<Car, String> carType;
    public static volatile SingularAttribute<Car, Integer> carID;
    public static volatile SingularAttribute<Car, Integer> capacity;
    public static volatile SingularAttribute<Car, Train> train;

}