package testingupdatedmaw;

// Queue interface UPDATED OCTOBER 2018
//
// ******************PUBLIC OPERATIONS*********************
// void add( x ) --> Insert x
// AnyType peek( ) --> Return least recently inserted item
// AnyType remove( )  --> Return and remove least recent item
// boolean Empty( )  --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// peek or remove on empty queue

/**
 * Protocol for queues.
 * @author Mark Allen Weiss  updated OCTOBER 2018
 */
public interface Queue<AnyType>
{
    /**
     * Insert a new item into the queue.
     * @param x the item to insert.
     */
    void  add( AnyType x );
    
    /**
     * Get the least recently inserted item in the queue.
     * Does not alter the queue.
     * @return the least recently inserted item in the queue.
     * @exception UnderflowException if the queue is empty.
     */
    AnyType peek( );

    /**
     * Return and remove the least recently inserted item
     * from the queue.
     * @return the least recently inserted item in the queue.
     * @exception UnderflowException if the queue is empty.
     */
    AnyType remove( );

    /**
     * Test if the queue is logically empty.
     * @return true if empty, false otherwise.
     */
    boolean empty( );

    /**
     * Make the queue logically empty.
     */
    void makeEmpty( );
}