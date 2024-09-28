package testingupdatedmawarray;

// Stack interface  UPDATED September 2021
//
// ******************PUBLIC OPERATIONS*********************
// void push( x )         --> Insert x
// void add x )           --> Insert x
// void pop( )            --> Remove most recently inserted item
// void remove( )         --> Remove most recently inserted item
// AnyType peek( )        --> Return most recently inserted item
// boolean empty( )       --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// int size()             --> returns size of stack zero if empty
//
// ******************ERRORS********************************
// pop or peek on empty stack


 // Protocol for stacks.
 // Modified September 2021
 
public interface Stack<AnyType>
{
   
    // Insert a new item into the stack. 
    public void  push( AnyType x );
  
   // Insert a new item into the stack. 
    public void  add( AnyType x );
	 
    //  Remove the most recently inserted item from the stack.
    //  @exception UnderflowException if the stack is empty.     
    public AnyType  pop( );
	 
    //  Remove the most recently inserted item from the stack.
    //  @exception UnderflowException if the stack is empty.     
    public AnyType  remove( );
	
	
    /**
     * Get the most recently inserted item in the stack.
     * Does not alter the stack.
     * @return the most recently inserted item in the stack.
     * @exception UnderflowException if the stack is empty.
     */
    public AnyType  peek( );

 
    /**
     * Test if the stack is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean empty( );

    /**
     * Make the stack logically empty.
     */
    public void    makeEmpty( );
	
    // returns size of stack zero if empty
     public int size();   
}