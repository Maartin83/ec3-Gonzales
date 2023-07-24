package idat.ec3.Repositories;

import idat.ec3.Entities.Instrumento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "instrumentos", path = "instrumentos")
public interface InstrumentoRepository extends PagingAndSortingRepository<Instrumento, Long> , CrudRepository<Instrumento, Long> {
    List<Instrumento> findByNombre(@Param("nombre") String nombre);
}
