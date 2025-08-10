package org.architect.contest.repository;


import java.util.List;
import java.util.Optional;

public interface GenericCrudRepository<E, K> {

    E save(E entity);                 // Create yoki Update
    Optional<E> findById(K id);       // Read (bitta obyekt)
    List<E> findAll();                // Read (hammasi)
    E update(E entity);               // Update
    void deleteById(K id);            // Delete (ID bo‘yicha)
    void delete(E entity);            // Delete (obyekt bo‘yicha)
}

