/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_6.ComposerApp;

import java.util.List;

/**
 * GenericDao - Generic interface for data access using an Entity type and Key
 * type
 */
public interface GenericDao<E, K> {
    // find every entity
    List<E> findAll();

    // find one entity by key value
    E findBy(K key);

    // add a new entity to the store
    void insert(E entity);
}
