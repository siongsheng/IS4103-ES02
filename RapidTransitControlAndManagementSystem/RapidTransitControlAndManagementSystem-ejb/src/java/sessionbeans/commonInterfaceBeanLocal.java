/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface commonInterfaceBeanLocal {
    public boolean employeeLogin(String username, String password);
    
    public boolean findEmployee(String username);
    
    public boolean addEmployee (String username, String name, String password, int salary, String jobRole, int yearsOfExp, String NRIC, String email, String contact, String address, int age);
}
