/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import javax.ejb.Remote;

/**
 *
 * @author User
 */
@Remote
public interface commonInterfaceBeanRemote {
    public boolean employeeLogin(String username, String password);
    
    public boolean findEmployee(String username); 
}
