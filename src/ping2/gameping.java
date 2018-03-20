package ping2;

import java.awt.Canvas;

public class gameping extends Canvas implements Runnable{

	private static final long serialVersionUID = -1816202236570615784L;
	
	public static final int WIDTH=640, HEIGHT=WIDTH/12*9;
	
	private Thread thread;
	private boolean running=false;
	
	public static boolean paused=false;
	
	private handlerping handler;
	private menuping menu;
	//private spawn spawner;
	
	public enum STATE{
		Menu,
		Help,
		Game,
		End
	};
	
	public static STATE gamestate=STATE.Menu;
	
	
	public gameping() {
		
		handler=new handlerping();
		menu=new menuping(this);
		
		new windowsping(WIDTH, HEIGHT, "Ping",this);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public synchronized void start() {
		thread=new Thread(this);
		thread.start();
		running=true;
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			running=false;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		new gameping();
	}
	

}
