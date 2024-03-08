package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.employeemanager.model.ListaReproduccion;

public interface ListaRepo extends JpaRepository<ListaReproduccion, Long> {
	ListaReproduccion findListaByNombre(String nombre);
	void deleteListByNombre(String nombre);
}
