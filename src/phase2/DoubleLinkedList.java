package phase2;
import lab2_ense374.*;

public class DoubleLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListElement le = new ListElement(); 
		LinkedList info = new LinkedList();
		le.setData(0);
		info.addElement(le);
		le.setData(1);
		info.addElement(le);
		le.setData(2);
		info.addElement(le);
		le.setData(3);
		info.addElement(le);
		le.setData(4);
		info.addElement(le);
	}

}
