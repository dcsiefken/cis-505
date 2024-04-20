/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_6.ComposerApp;

import java.util.List;

public interface GenericDao<E, K> {
    List<E> findAll();

    E findBy(K key);

    void insert(E entity);
}
