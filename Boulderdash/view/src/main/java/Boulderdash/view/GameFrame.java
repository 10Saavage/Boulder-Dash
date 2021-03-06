package Boulderdash.view;

import javax.swing.JFrame;

import Boulderdash.controller.KeyBoard;

/**
 * @author TOUSSI Manoel
 *
 */

public class GameFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int longFen=2000;
	public static int largFen=800;
	public final static int x=42;
	public final static int y=22;
	KeyBoard move=new KeyBoard();
	/**
	 *GRAPHIC INTERFACE
	 *
	 */
	public GameFrame() {
		GamePanel gamepanel=new GamePanel();
		this.setTitle("Boulder Dash");
		this.setSize(longFen, largFen);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(gamepanel);
		this.setVisible(true);
		this.addKeyListener(move);
	}
	
}
