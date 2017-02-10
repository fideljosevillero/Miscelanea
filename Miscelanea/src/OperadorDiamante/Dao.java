/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OperadorDiamante;

/**
 *
 * @author fidel.villero
 */
public interface Dao<F> {
    
    public Boolean save(F obj);
    public Boolean update(F obj);
    public F get(int id);
    
}
