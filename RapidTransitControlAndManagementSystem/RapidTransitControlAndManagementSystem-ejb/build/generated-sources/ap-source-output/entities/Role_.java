package entities;

import entities.Employee;
import java.sql.Time;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-13T11:12:50")
@StaticMetamodel(Role.class)
public class Role_ { 

    public static volatile SingularAttribute<Role, Time> reportingTime;
    public static volatile SingularAttribute<Role, String> roleName;
    public static volatile SingularAttribute<Role, Integer> id;
    public static volatile ListAttribute<Role, Employee> employees;

}