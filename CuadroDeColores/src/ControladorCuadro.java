import java.awt.Color;


public class ControladorCuadro {
	
	private ClaseCuadro[] arreglo;
	private int maximo = 0;
	
	public ControladorCuadro(int elementos)
	{
		maximo = elementos;
		arreglo = new ClaseCuadro[elementos];
	}
	
	public void agregar(ClaseCuadro elemento)
	{
		for(int indice = 0; indice < maximo; indice ++)
		{
			if(arreglo[indice] == null)
			{
				arreglo[indice] = elemento;
				break;
			}
		}
	}
	
	public void mostrar()
	{
		for(int indice = 0; indice < maximo; indice++)
		{
			if(arreglo[indice] != null)
			{
				System.out.println("Color: "+arreglo[indice].getColor());
				System.out.println("X: "+arreglo[indice].getX());
				System.out.println("Y: "+arreglo[indice].getY());
			}
		}
	}
	
	public Color getColorArreglo(int pos)
	{
		return arreglo[pos].getColor();
	}
	
	public int getXArreglo(int pos)
	{
		return arreglo[pos].getX();
	}
	
	public int getYArreglo(int pos)
	{
		return arreglo[pos].getY();
	}
	
	public int getMaximoArreglo()
	{
		return this.maximo;
	}
}
