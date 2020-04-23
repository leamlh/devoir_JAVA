import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.color.*;

// applet qui place le texte bonjour a l'endroit ou on clique et qui change de couleur

public class Dessin extends Applet implements MouseListener, MouseMotionListener{

	String msg = "Bonjour";
	int posX = 20;
	int posY = 20;

	public void init() {
		setSize(400, 400);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(posX, posY, 100, 100);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		posX = e.getX();
		posY = e.getY();
		repaint(); 

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent arg0) { // déplace le texte si la souri
		// TODO Auto-generated method stub
		posX = arg0.getX();
		posY = arg0.getY();
		repaint(); 
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}