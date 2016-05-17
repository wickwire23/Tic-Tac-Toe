import java.awt.*;

import javax.swing.JFrame;
public class TicCanvas extends Canvas
	{

		public static void main(String[] args)
			{
				TicCanvas canvas = new TicCanvas();
			        JFrame frame = new JFrame();
			        frame.setSize(315, 330);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.white);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);
			}

		public void paint(Graphics graphics) 
    		{
    		
    			int collum;
    			int row;
    			for(row=0;row<3;row++)
    				{
    					for(collum =0;collum<3;collum++)
    						{
    							int col = collum*100;
    							int ro = row*100;
    							if((row%2)==(collum % 2))
    								{
    									graphics.setColor(Color.green);
    									graphics.fillRect(col, ro, 100, 100);
    								}
    							else
    								{
    									graphics.setColor(Color.blue);
    									graphics.fillRect(col, ro, 100, 100);
    								}
    	
    	
    						}
    				}
    			String[] arguments = new String[] {"123"};
        		TicTacToe.main(arguments);
    			if(TicTacToe.a1=true)
    				{
    					//Draws X on A1
    	    			graphics.setColor(Color.black);
    	    			graphics.drawLine(0, 0,100,100);
    	    			graphics.drawLine(0, 100, 100,0);
    	    			repaint();
    				}
    			
//    			//Draws X on A2
//    			graphics.setColor(Color.black);
//    			graphics.drawLine(100, 0,200,100);
//    			graphics.drawLine(100, 100, 200,0);
//    			//Draws X on A3
//    			graphics.setColor(Color.black);
//    			graphics.drawLine(200, 0,300,100);
//    			graphics.drawLine(200, 100, 300,0);
//    			//Draws X on B1
//    			graphics.setColor(Color.black);
//    			graphics.drawLine(0, 100,100,200);
//    			graphics.drawLine(0, 200, 100,100);
//    			//Draws X on B2
//    			graphics.setColor(Color.black);
//    			graphics.drawLine(100, 100,200,200);
//    			graphics.drawLine(200, 100, 100,200);
//    			//Draws X on B3
//    			graphics.setColor(Color.black);
//    			graphics.drawLine(200, 100,300,200);
//    			graphics.drawLine(200, 200, 300,100);
//    			//Draws X on C1
//    			graphics.setColor(Color.black);
//    			graphics.drawLine(0, 200,100,300);
//    			graphics.drawLine(0, 300, 100,200);
//    			//Draws X on C2
//    			graphics.setColor(Color.black);
//    			graphics.drawLine(100, 200,200,300);
//    			graphics.drawLine(200, 200, 100,300);
//    			// Draws X on C3
//    			graphics.setColor(Color.black);
//    			graphics.drawLine(200, 200,300,300);
//    			graphics.drawLine(300, 200, 200,300);
    			
    		}
	
    				    	
    		
    		}
	

	
