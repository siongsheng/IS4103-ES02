package entities;

import entities.Block;
import entities.Station;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-09T15:07:10")
@StaticMetamodel(Line.class)
public class Line_ { 

    public static volatile ListAttribute<Line, Block> blocks;
    public static volatile SingularAttribute<Line, String> lineID;
    public static volatile ListAttribute<Line, Station> stations;

}