/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author Miranda
 */
public interface TB_PrestamoDao {
    
    public void save(Object obj); 
    public List getAll();
    public void delete(Serializable id);
    public Object findByKey(Serializable id);
    public void update(Object obj);
    public List getPreInv(Serializable id);
    public List LastIdPrestamo();
}
