package com.estudo.rest.api;

import com.estudo.rest.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource (
        path = "usuarios",
        collectionResourceRel = "usuarios"
)
public interface UsuarioRestRepository extends
        CrudRepository<Usuario, UUID>,
        PagingAndSortingRepository<Usuario, UUID> {

    List<Usuario> findByName(@Param("name") String name);

    @Override
    @RestResource(exported = false)
    void deleteById(UUID uuid);
}
