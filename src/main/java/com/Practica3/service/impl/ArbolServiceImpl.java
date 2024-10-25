
package com.Practica3.service.impl;


import com.Practica3.dao.ArbolDao;
import com.Practica3.domain.Arbol;
import com.Practica3.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dques
 */
@Service
public class ArbolServiceImpl implements ArbolService{

    @Autowired
    private ArbolDao arbolDao;
    
    @Override
    public List<Arbol> getArboles(boolean activos) {
        List<Arbol> lista = arbolDao.findAll();
        
        if(activos){
            lista.removeIf(e -> !e.isActivos());
        }
        return lista;
    }

}