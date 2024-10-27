package com.Practica3.service.impl;
import com.Practica3.dao.ArbolDao;
import com.Practica3.domain.Arbol;
import com.Practica3.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ArbolServiceImpl implements ArbolService{
    @Autowired
    private ArbolDao arbolDao;
    
    @Override
    public List<Arbol> getArboles(boolean activo) {
        List<Arbol> lista = arbolDao.findAll();
        
        if(activo){
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Arbol getArbol(Arbol arbol) {
        return arbolDao.findById(arbol.getId()).orElse(null);
    }
    @Override
    @Transactional
    public void save(Arbol arbol) {
        arbolDao.save(arbol);
    }
    @Override
    @Transactional
    public void delete(Arbol arbol) {
        arbolDao.delete(arbol);
    }
}