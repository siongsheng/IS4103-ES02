package entities;

import entities.Line;
import entities.Station;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-11T11:59:55")
@StaticMetamodel(Block.class)
public class Block_ { 

    public static volatile SingularAttribute<Block, Integer> blockID;
    public static volatile SingularAttribute<Block, Line> line;
    public static volatile SingularAttribute<Block, Station> station;

}