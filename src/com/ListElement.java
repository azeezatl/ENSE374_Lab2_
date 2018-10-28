/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;


/**
 *
 * @author lawal28a
 */
        
public class ListElement 
{
    private ListElement next;
    private ListElement previous;
    private int data;
       
    public ListElement ()
    {
        this.next = null;
        this.previous = null ;
        this.data = 0;
    }
    
    public ListElement(int dataValue) 
    {
      next = null;
      data = dataValue;
    }

    public void display()
    {
        System.out.print("Data: " + data + "\n");
    }
          
  // another Node constructor if we want to specify the node to point to.
    public ListElement(int dataValue, ListElement nextValue, ListElement previousValue)
    {
        next = nextValue;
        previous = previousValue;
        data = dataValue;
    }
    
    public int getData()
    {
        return this.data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public ListElement getNext() 
    {
        return next;
    }

    public void setNext(ListElement nextValue) 
    {
        next = nextValue;
    }
    
    public ListElement getPrevious() 
    {
        return previous;
    }

    public void setPrevious(ListElement previousValue) 
    {
        previous = previousValue;
    }
}
