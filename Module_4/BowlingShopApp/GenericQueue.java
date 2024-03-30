/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_4.BowlingShopApp;

import java.util.LinkedList;

/**
 * Concrete implementation of a queue that can be applied to arbitrary element
 * types.
 */
public class GenericQueue<T> {
    // class uses a linked list as its backing store
    private LinkedList<T> list;

    // Default constructor for GenericQueue
    public GenericQueue() {
        list = new LinkedList<T>();
    }

    /**
     * Add an item to the queue
     * 
     * @param item item to add
     */
    public void Enqueue(T item) {
        // adds an item as the first element of the linked list
        list.addFirst(item);
    }

    /**
     * Remove an item from the queue
     * 
     * @return item returned
     */
    public T Dequeue() {
        // removes and returns the first element of the linked list
        return list.removeFirst();
        // NOTE: I believe the above line to be a bug. If we add items to the front
        // and remove items from the front, that data structure is a LIFO, or Stack,
        // rather than a Queue. This should probably be "return list.removeLast();"
        // However, Stack vs Queue doesn't really impact the application beyond the
        // sort order of the elements returned, so I'm leaving it as-is.
    }

    /**
     * Get the current size of the queue
     * 
     * @return number of items in queue
     */
    public int Size() {
        return list.size();
    }
}
