/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbDescargo;
import com.isdemu.service.TB_Descargo_Service;
import com.isdemu.service.TB_Inventario_Service;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author AlejandroPC
 */

@Controller 
 @RequestMapping(value="/Descargo")
//@Configuration
//@ComponentScan("com.isdemu.service")
public class TB_DescargoController 
{
    
//    @Autowired
//      private TB_Descargo_Service tbdescargoService;
//   @Autowired
//      private TB_Inventario_Service tbInventarioService;
//    
////    @RequestMapping(value="/consultarDescargo")
////	public ModelAndView consultarDescargo() {
////		ModelAndView modelAndView = new ModelAndView("consultar_descargo");
////
////		List descargo = tbDescargoService.getAll();
////		modelAndView.addObject("descargo", descargo);
////
////		return modelAndView;
////	}
//        
//         @RequestMapping(value="/insertarDescargo", method=RequestMethod.GET)
//	public ModelAndView addDescargo() {
//              System.out.println("esntra aqui GETT descargo");
//		//ModelAndView modelAndView = new ModelAndView("inventario");
//               Map<String, Object> myModel = new HashMap<String, Object>();
//		
//                 
//                 List descar = tbDescargoService.getAll();
//                
//                  
//                 myModel.put("descargo", new TbDescargo());
//                
//                 myModel.put("inventario",descar );
//                  
//               
//                
//		return new ModelAndView("descargo",myModel);
//	}
//        
//        
//        @RequestMapping(value="/insertarDescargo", method=RequestMethod.POST)
//	public ModelAndView addingDescargo(@ModelAttribute TbDescargo des) {
//		ModelAndView modelAndView = new ModelAndView("home");
//		 System.out.println("esntra aquiPOST movimiento"+des);
//
//
//               des.setFecha(new Date());
//                des.setIdNumeroDescargo(2);
//                 des.setComentario("asdfasf");
//                  
//                
//              
//            
//		tbDescargoService.save(des);
//		String message = "descargo was successfully added.";
//		modelAndView.addObject("message", message);
//		return modelAndView;
//	}
        
//         @RequestMapping(value="/deleteDescargo/{id}", method=RequestMethod.GET)
//	public ModelAndView deleteDes(@PathVariable Integer id) 
//        {
//		ModelAndView modelAndView = new ModelAndView("home");
//		tbDescargoService.delete(id);
//		String message = "descargo was successfully deleted.";
//		modelAndView.addObject("message", message);
//		return modelAndView;
//	}
        
        
    
}