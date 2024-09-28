package testingupdatedmawarray;

// ListStack class
//
// CONSTRUCTION: with no initializer
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

/**
 * List-based implementation of the stack.
 * @author Mark Allen Weiss Updated Sept 2021
 */
public class ListStack<AnyType> implements Stack<AnyType>
{
  private ListNode<AnyType> topOfStack; 
  private int size;
    
 /**
  * Construct the stack.
  */
 public ListStack( )
 {
  topOfStack = null;
 }
 
  /**
     * returns the size of the Stack.
     */
  public int size( )
   {
    return size;
   }

 /**
  * Test if the stack is logically empty.
  * @return true if empty, false otherwise.
  */
 public boolean empty( )
 {
  return topOfStack == null;
 }

 /**
  * Make the stack logically empty.
  */
 public void makeEmpty( )
 {
  topOfStack = null;
 }

 /**
  * Insert a new item into the stack.
  * @param x the item to insert.
  */
 public void push( AnyType x )
 {
  topOfStack = new ListNode<AnyType>( x, topOfStack );
  size++;
 }

 /**
  * Insert a new item into the stack.
  * @param x the item to insert.
  */
 public void add( AnyType x )
 {
  topOfStack = new ListNode<AnyType>( x, topOfStack );
  size++;
 }

 /**
  * Remove the most recently inserted item from the stack.
  * @throws UnderflowException if the stack is empty.
  */
 public AnyType peek( )
 {
  if(  empty( ) )
   throw new UnderflowException( "Stack is empty" );
  return topOfStack.element;
 }

 
 /**
  * Return and remove the most recently inserted item
  * from the stack.
  * @return the most recently inserted item in the stack.
  * @throws UnderflowException if the stack is empty.
  */
 public AnyType pop( )
 {
  if(  empty( ) )
   throw new UnderflowException( "ListStack topAndPop" );

  AnyType topItem = topOfStack.element;
  topOfStack = topOfStack.next;
  size--;
  return topItem;
 }

 /**
  * Return and remove the most recently inserted item
  * from the stack.
  * @return the most recently inserted item in the stack.
  * @throws UnderflowException if the stack is empty.
  */
 public AnyType remove( )
 {
  if(  empty( ) )
   throw new UnderflowException( "Empty stack" );

  AnyType topItem = topOfStack.element;
  topOfStack = topOfStack.next;
  size--;
  return topItem;
 }
 
 
}