/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_6.ComposerApp;

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {
    private List<Composer> composers;

    public MemComposerDao() {
        composers = new ArrayList<Composer>();
        composers.add(new Composer(1, "Aphex Twin", "EDM"));
        composers.add(new Composer(2, "Tchaikovsky", "Classical"));
        composers.add(new Composer(3, "Taylor Swift", "Pop"));
        composers.add(new Composer(4, "Johnny Cash", "Country"));
        composers.add(new Composer(5, "Barry White", "Soul"));
    }

    @Override
    public List<Composer> findAll() {
        return composers;
    }

    @Override
    public Composer findBy(Integer key) {
        for (int index = 0; index < composers.size(); index++) {
            if (key.equals(composers.get(index).getId())) {
                return composers.get(index);
            }
        }
        return null;
    }

    @Override
    public void insert(Composer composer) {
        composers.add(composer);
    }
}
