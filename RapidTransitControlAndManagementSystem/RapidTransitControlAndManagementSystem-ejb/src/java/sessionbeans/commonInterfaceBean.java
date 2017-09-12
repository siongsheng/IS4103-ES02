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
}
