import java.util.Arraylist;
import java.util.emptystackexception;
import java.util.*;

public class ArbitaryQueueArray{
	
    private int arr[];
    private int size1;
    private int index= 0;
    private int queue[];
    private int front,rear,size2, len;

public  ArbitaryQueueArray(int n)


{
    this.size1=n;
    arr=new int[size1];
    this.size2=n;
    len=0;
    queue = new int [size2];
    front= -1;
    rear = -1;
    
}

public void push (int element){
    {
        if (isfull()){
            
            throw new stackoverflow("stack if full");
            
        }
    }
    
    arr[index]= element;
    index++;
}

public int pop(){
    
    if ( isEmpty(1)){
       throw new emptystackexception();
    }
    return arr[--index];
}

public boolean isEmpty()
{
    if (index==0)
    {
        return true;
    }
    return false;
}
public boolean isfull(){
    if (index==size)
    {
        return true;
    }
    
    return false;
    
}

public void insert (int i)
{
   if(rear==-1)
   {
      front=0;
      rear=0;
      queue[rear]=i;
   }
   
    else if (rear+1>= size)
    
    throw new IndexoutofBoundException("Overflow Exception");
    
    else if (rear+1 < size)
    {     queue [++rear]=i;
        len++;
    }
  
}

public int remove () {
    
    if (isEmpty())
    {throw new nosuchelemenetException ("Underflow Exception");}
    
    else
     {
        len--;
        int i= queue[front] ; 
        
        if (front == rear)
        { 
            front =-1;
            rear=-1;
        }
        else
        front++;
        return i;
        
    }
    
    
}

public boolean isEmpty()

    {
        
        
        return (front==-1);
        
        
    }

}







