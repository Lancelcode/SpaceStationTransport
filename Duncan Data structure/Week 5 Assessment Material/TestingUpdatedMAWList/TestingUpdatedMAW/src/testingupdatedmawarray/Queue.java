package testingupdatedmawarray;
// Queue interface UPDATED September 2021
//
//
// ******************PUBLIC OPERATIONS*********************
// int size()             --> returns size of queue zero if empty
// void push( x )         --> Insert x
// void add( x )          --> Insert x
// AnyType peek( )        --> Return least recently inserted item
// void pop( )            --> Remove least recently inserted item
// void remove( )         --> Remove least recently inserted item
// boolean empty( )       --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// remove, pop, or peek on empty queue


 // Protocol for queue.
 // Modified September 2021


// ******************PUBLIC OPERATIONS*********************

/**
 * Protocol for queues.
 * updated September 2021
 */
public interface Queue<AnyType>
{
    /**
     * Insert a new item into the queue.
     * @param x the item to insert.
     */
    public void  add( AnyType x );
	
	// Insert a new item into the queue.
    // @param x the item to insert.
    public void  push( AnyType x );
	
    /**
     * Get the least recently inserted item in the queue.
     * Does not alter the queue.
     * @return the least recently inserted item in the queue.
     * @exception UnderflowException if the queue is empty.
     */
    public AnyType peek( );

    /**
     * Return and remove the least recently inserted item
     * from the queue.
     * @return the least recently inserted item in the queue.
     * @exception UnderflowException if the queue is empty.
     */
    public AnyType remove( );
	
	// Return and remove the least recently inserted item
    // from the queue.
    // @return the least recently inserted item in the queue.
    // @exception UnderflowException if the queue is empty.
	
    public AnyType pop( );
   
   // returns size of queue zero if empty
     public int size();             
   
   
   /**
     * Test if the queue is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean empty( );

    
     // Make the queue logically empty.
     public void makeEmpty( );
}