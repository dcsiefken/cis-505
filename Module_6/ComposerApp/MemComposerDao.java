/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_6.ComposerApp;

import java.util.ArrayList;
import java.util.List;

/**
 * MemComposerDao - implementation of the ComposerDao interface using memory as
 * its backing store
 */
public class MemComposerDao implements ComposerDao {
    // internal store of composer objects
    private List<Composer> composers;

    /**
     * Default constructor
     */
    public MemComposerDao() {
        // set up the list
        composers = new ArrayList<Composer>();
        // add 5 default (arbitrary) composer objects
        composers.add(new Composer(1, "Aphex Twin", "EDM"));
        composers.add(new Composer(2, "Tchaikovsky", "Classical"));
        composers.add(new Composer(3, "Taylor Swift", "Pop"));
        composers.add(new Composer(4, "Johnny Cash", "Country"));
        composers.add(new Composer(5, "Barry White", "Soul"));
    }

    /**
     * Return all objects in the list
     */
    @Override
    public List<Composer> findAll() {
        return composers;
    }

    /**
     * Return the composer object that matches by id#, if one exists
     */
    @Override
    public Composer findBy(Integer key) {
        // loop through all composer objects
        for (int index = 0; index < composers.size(); index++) {
            // check for match by id field
            if (key.equals(composers.get(index).getId())) {
                // return matching object
                return composers.get(index);
            }
        }
        // return null if no matches exist
        return null;
    }

    /**
     * Add a new composer to the list
     */
    @Override
    public void insert(Composer composer) {
        composers.add(composer);
    }
}
