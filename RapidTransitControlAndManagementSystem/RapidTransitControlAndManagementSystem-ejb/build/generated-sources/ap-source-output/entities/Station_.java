package entities;

import entities.Block;
import entities.Depot;
import entities.Line;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-11T11:59:55")
@StaticMetamodel(Station.class)
public class Station_ { 

    public static volatile SingularAttribute<Station, Timestamp> lastMaintenanceDate;
    public static volatile SingularAttribute<Station, Depot> depot;
    public static volatile SingularAttribute<Station, Line> line;
    public static volatile ListAttribute<Station, Block> blocks;
    public static volatile SingularAttribute<Station, Integer> stationID;

}