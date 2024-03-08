package tech.getarrays.employeemanager.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.getarrays.employeemanager.model.ListaReproduccion;
import tech.getarrays.employeemanager.service.ListaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/listas")
public class ListaResource {
	private final ListaService listaService;

	public ListaResource(ListaService listaservice) {
		this.listaService = listaservice;
	}

	@PostMapping("/lists")
	public ResponseEntity<ListaReproduccion> addLista(@RequestBody ListaReproduccion lista) {
		if ((lista.getNombre().equals(null)|| lista.getNombre().isEmpty())) {
	        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	    }
		ListaReproduccion newLista = listaService.addCancion(lista);
		return new ResponseEntity<>(newLista, HttpStatus.CREATED);
	}


	@GetMapping("/lists")
	public ResponseEntity<List<ListaReproduccion>> getAllListas() {
		List<ListaReproduccion> listas = listaService.findAllListas();
		return new ResponseEntity<>(listas, HttpStatus.OK);
	}

	@GetMapping("/lists/{listName}")
	public ResponseEntity<ListaReproduccion> findListaByNombre(@PathVariable("listName") String nombre) {
		ListaReproduccion lista = listaService.findListaByNombre(nombre);
		if (!lista.equals(null)) {
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(lista, HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/delete/{listName}")
    public ResponseEntity<?> deleteListByNombre(@PathVariable("listName") String listName) {
		listaService.deleteListByNombre(listName);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
	
	

}
