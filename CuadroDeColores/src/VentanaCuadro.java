import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;


public class VentanaCuadro extends JFrame{
	
	ControladorCuadro cc = new ControladorCuadro(3);
	
	
	public VentanaCuadro()
	{
		this.setSize(800, 700);
		this.setVisible(true);
		this.setTitle("Cuadro de Colores");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cc.agregar(new ClaseCuadro(50,50,Color.blue));
		cc.agregar(new ClaseCuadro(110,50,Color.cyan));
		cc.agregar(new ClaseCuadro(170,50,Color.darkGray));
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D.Double rect;
		
		for(int indice = 0; indice < cc.getMaximoArreglo(); indice++)
		{
			rect = new Rectangle2D.Double(cc.getXArreglo(indice), cc.getYArreglo(indice), 50, 50);
			g2.setPaint(cc.getColorArreglo(indice));
			g2.draw(rect);
		}
	}

}
