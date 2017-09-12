/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Employee;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class commonInterfaceBean implements commonInterfaceBeanLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public boolean employeeLogin(String username, String password){
        Employee employee = em.find(Employee.class, username);
        if (employee != null) {
            if(employee.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean findEmployee(String username){
        Employee employee = em.find(Employee.class, username);
        if(employee!=null) return true;
        return false;
    }
    
    @Override
    public boolean addEmployee (String username, String name, String password, int salary, String jobRole, int yearsOfExp, String NRIC, String email, String contact, String address, int age){
        Employee employee = em.find(Employee.class, username);
        if (employee == null) {
            Employee newEmployee = new Employee();
            try{
                newEmployee.create(username, name, password, salary, jobRole, yearsOfExp, NRIC, email, contact, address, age);
            }catch(Exception e){
                System.out.println(e);
            }
            em.persist(newEmployee);
            return true;
        }
        return false;
    }
}
