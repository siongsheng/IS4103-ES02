package entities;

import entities.Station;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-11T11:59:55")
@StaticMetamodel(Depot.class)
public class Depot_ { 

    public static volatile SingularAttribute<Depot, String> depotName;
    public static volatile SingularAttribute<Depot, Integer> id;
    public static volatile SingularAttribute<Depot, Integer> capacity;
    public static volatile SingularAttribute<Depot, Station> nearestStation;

}