/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBT_VerificarInventarioDao;
import com.isdemu.model.TbInventario;
import com.isdemu.model.TbtVerificarInventario;
import java.io.Serializable;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose Eduardo
 */
@Repository
public class TBT_VerificarInventarioDaoImpl implements TBT_VerificarInventarioDao {
    @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
        
        @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		
		TbtVerificarInventario Vinventario =(TbtVerificarInventario)obj;
	        getCurrentSession().save(Vinventario);
	}
        
        @Override
	public List<TbtVerificarInventario> getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbInventario.class);
           
            List<TbtVerificarInventario> Vinventario = dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
            return Vinventario;
	}
        
          @Override
	public void delete(Serializable id) {
		 System.out.println("ingresa al ELIMINAR");
            Session session = null;
            session = sessionFactory.getCurrentSession();
            SQLQuery query = session.createSQLQuery("DELETE FROM TBT_VERIFICAR_INVENTARIO");
            query.executeUpdate();
	}
        
          @Override
	public List<TbtVerificarInventario> getInventarioSobrante() {
		// TODO Auto-generated method stub
            System.out.println("ingresa al inventario sobrante");
            Session session = null;
            session = sessionFactory.getCurrentSession();
            SQLQuery query = session.createSQLQuery("SELECT TBT_VERIFICAR_INVENTARIO.CODIGO_INVENTARIO FROM TBT_VERIFICAR_INVENTARIO EXCEPT SELECT TB_INVENTARIO.CODIGO_INVENTARIO FROM TB_INVENTARIO");
            List<TbtVerificarInventario> Vinventario = query.list();
            
            return Vinventario;
	}
        
           @Override
	public List<TbtVerificarInventario> getInventarioFaltante() {
		// TODO Auto-generated method stub
               System.out.println("ingresa al inventario faltante");
            Session session = null;
            session = sessionFactory.getCurrentSession();
            SQLQuery query = session.createSQLQuery("SELECT TB_INVENTARIO.CODIGO_INVENTARIO FROM TB_INVENTARIO EXCEPT SELECT TBT_VERIFICAR_INVENTARIO.CODIGO_INVENTARIO FROM TBT_VERIFICAR_INVENTARIO");
            List<TbtVerificarInventario> Vinventario = query.list();
            
            return Vinventario;
	}
}
