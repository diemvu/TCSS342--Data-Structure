/**
 * 
 */

package structures;

/**
 * @author Diem Vu
 * @version Winter 2019
 * @param <E> generics type
 */
public class LinkedOutputRestrictedDeque<E> extends LinkedQueue<E>
                implements OutputRestrictedDequeADT<E> {
    /**
     * 
     */
    public LinkedOutputRestrictedDeque() {
        super();
    }

    @Override
    public void enqueAtFront(final E theElement) {
        if (isEmpty()) {
            myFront = new Node<E>(theElement);
            myRear = myFront;
        } else {
            myFront = new Node<E>(theElement, myFront);
        }
        mySize++;
    }
}
