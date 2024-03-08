package tech.getarrays.employeemanager.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.getarrays.employeemanager.model.ListaReproduccion;
import tech.getarrays.employeemanager.repo.ListaRepo;


@Service
@Transactional
public class ListaService {
	 private final ListaRepo listaRepo;
	 
	    @Autowired
	    public ListaService(ListaRepo listaRepo) {
	        this.listaRepo = listaRepo;
	    }
	    
	    public ListaReproduccion addCancion(ListaReproduccion lista) {
	        return listaRepo.save(lista);
	    }
	    
	    public List<ListaReproduccion> findAllListas() {
	        return listaRepo.findAll();
	    }
	    
	    
	    public ListaReproduccion findListaByNombre(String nombre) {
	        return listaRepo.findListaByNombre(nombre);
	    }
	    
	    
	    public void deleteListByNombre(String nombre){
	    	listaRepo.deleteListByNombre(nombre);
	    }
}
