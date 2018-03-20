package ping2;

import java.awt.Graphics;
import java.util.LinkedList;

public class handlerping {
	
	LinkedList<gameobjectping> object=new LinkedList<gameobjectping>();
	
	public void tick() {
		for(int i=0; i<object.size(); i++) {
			gameobjectping tempobject=object.get(i);
			tempobject.tick();
		}
	}
	
	public void render(Graphics g) {
		for(int i=0; i<object.size(); i++) {
			gameobjectping tempObject = object.get(i);
			
			tempObject.render(g);			
		}
	}

	
	

}
