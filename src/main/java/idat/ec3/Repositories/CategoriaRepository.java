package idat.ec3.Repositories;

import idat.ec3.Entities.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "categorias", path = "categorias")
public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Long>, CrudRepository<Categoria, Long> {
    List<Categoria> findByNombre(@Param("nombre") String nombre);
}
