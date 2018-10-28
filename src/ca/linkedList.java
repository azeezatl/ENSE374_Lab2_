/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca;
import com.*;
/**
 *
 * @author lawal28a
 */
public class linkedList 
{
      
    private ListElement head;
    private ListElement tail;
    
    public linkedList()
    {
        this.head = null;
        this.tail = null ;
    }
     
    public void addElement(ListElement le)
    {
        ListElement listTemp = new ListElement(le.getData(), null, null);
        
        if(isEmpty())
        {
            head = listTemp;
            tail = head;
        }
        else
        {
            head.setNext(listTemp);    
            listTemp.setPrevious(head);
            head = listTemp;
        }
    }
    
    public ListElement getElement(int index)
    {
        if (index < 0)
            return null;
        ListElement ListCurrent = null;
        if (tail != null)
        {
            ListCurrent = tail;
            for (int i = 0; i < index; i++) 
            {
                if (ListCurrent.getNext() == null)
                    return null;

                ListCurrent = ListCurrent.getNext();
            }
            return ListCurrent;
        }
        return null;
    }
     
    public ListElement deleteElement(int index)
    {
        ListElement location = tail;
        ListElement tempLocation = null;

        if (!isEmpty())
        {// Delete first  node 
            if (index == 0)
            {
                location = location.getNext();
                location.setNext(location.getNext());
                tail = location;
            }
            else
            {
                int i = 1;
                while (i < index) 
                {
                    location = location.getNext();
                    i++;
                } 
                // Delete node at location->next
                tempLocation = location.getNext();
                location.setNext(location.getNext().getNext());
            }
        }
        return null;
    }
    
    public void printLinkedListTail()
    {
        ListElement ListCurrent = new ListElement();
        ListCurrent = tail;
        while (ListCurrent != null)
        {
            ListCurrent.display();
            ListCurrent = ListCurrent.getNext(); 
        }
    }
    
    public void printLinkedListHead()
    {
        ListElement ListCurrent = new ListElement();
        ListCurrent = head;
        while (ListCurrent != null)
        {
            ListCurrent.display();
            ListCurrent = ListCurrent.getPrevious();
        }
    }
    
    public boolean isEmpty()
    {
        return head == null && tail == null;
    }
}
