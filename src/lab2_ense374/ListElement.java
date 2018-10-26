/**
 * 
 */
package lab2_ense374;

/**
 * @author lawal28a
 *
 */
public class ListElement {


	/**
	 * @param args
	 */
	private ListElement next ; 
	private ListElement previous ; 
	private int data ;

	public ListElement () 
	{ 
		this . data = 0; 
		this . next = null ; 
		this . previous = null ; 
	}

	/** @param data 
	* an integer to be stored in the node 
	* @return 
	* * None
	**/ 
	public void setData ( int data) { 
		this . data = data ; 
	} 
	public int getData () { 
		return this . data ; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListElement le = new ListElement(); 
		//create an object of the class, and access the members
		le.setData(5);
	}
	
	public void addElement(ListElement le) {
		 if (this.next == null)
	        {
	            this.next = le;
	        }
	}
	

}
