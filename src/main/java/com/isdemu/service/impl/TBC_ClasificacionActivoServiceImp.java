/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;


import com.isdemu.dao.TbcClasificacionActivoDao;

import com.isdemu.service.TBC_ClasificacionActivo_Service;
import java.io.Serializable;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Eduardo
 */
@Service
@Transactional
public class TBC_ClasificacionActivoServiceImp implements TBC_ClasificacionActivo_Service{
    
    @Autowired
	private TbcClasificacionActivoDao tbClasiActDao;
    
    @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		tbClasiActDao.save(obj);
	}
        
    
    @Override
	public List getAll() {
             System.out.println("service impl");
		// TODO Auto-generated method stub
		return tbClasiActDao.getAll();
	}
        
     @Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		return tbClasiActDao.findByKey(id);
	}
        
         @Override
         public List getTop(){
         return tbClasiActDao.getTop();
         }
         
          @Override
         public List getAllidClasi(Serializable id){
         return tbClasiActDao.getAllidClasi(id);
         }
        
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		tbClasiActDao.delete(id);
	}
        
                
        @Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		tbClasiActDao.update(obj);
	}
}
