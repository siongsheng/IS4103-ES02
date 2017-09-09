package entities;

import entities.Role;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-09T15:07:10")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> address;
    public static volatile SingularAttribute<Employee, Integer> yearsOfExp;
    public static volatile ListAttribute<Employee, Role> roles;
    public static volatile SingularAttribute<Employee, Integer> salary;
    public static volatile SingularAttribute<Employee, Long> userID;
    public static volatile SingularAttribute<Employee, String> password;
    public static volatile SingularAttribute<Employee, String> contact;
    public static volatile SingularAttribute<Employee, String> name;
    public static volatile SingularAttribute<Employee, String> jobRole;
    public static volatile SingularAttribute<Employee, String> NRIC;
    public static volatile SingularAttribute<Employee, String> email;
    public static volatile SingularAttribute<Employee, Integer> age;
    public static volatile SingularAttribute<Employee, String> username;

}