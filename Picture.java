/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Square campo;
    private Person juanito;
    private Circle circulo1;
    private Circle circulo2;
    private Circle circulo3;
    private Square tronco;
    private Circle copa;
    private Person juanita;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        tronco = new Square();
        tronco.moveHorizontal(-400);
        tronco.moveVertical(10);
        tronco.changeSize(120);

        campo = new Square();
        campo.changeColor("green");
        campo.moveHorizontal(-350);
        campo.moveVertical(130);
        campo.changeSize(1500);
        campo.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-20);
        sun.changeSize(80);
        sun.makeVisible();
        
        juanito = new Person();
        juanito.moveHorizontal(-230);
        juanito.moveVertical(20);
        juanito.changeColor("black");
        
        juanita = new Person();
        juanita.moveHorizontal(-230);
        juanita.moveVertical(20);
        juanita.changeColor("magenta");
        
        copa = new Circle();
        copa.changeColor("green");
        copa.moveHorizontal(-280);
        copa.moveVertical(-50);
        copa.changeSize(120);
        
        circulo1 = new Circle();
        circulo1.changeColor("green");
        circulo1.moveHorizontal(-190);
        circulo1.moveVertical(-20);
        circulo1.changeSize(10);
        
        circulo2 = new Circle();
        circulo2.changeColor("green");
        circulo2.moveHorizontal(-200);
        circulo2.moveVertical(40);
        circulo2.changeSize(10);
        
        circulo3 = new Circle();
        circulo3.changeColor("green");
        circulo3.moveHorizontal(-220);
        circulo3.moveVertical(0);
        circulo3.changeSize(10);
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            campo.changeColor("black");
            circulo1.changeColor("black");
            circulo2.changeColor("black");
            circulo3.changeColor("black");
            tronco.changeColor("black");
            copa.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            campo.changeColor("green");
            tronco.changeColor("red");
            copa.changeColor("green");
            circulo1.changeColor("red");
            circulo2.changeColor("red");
            circulo3.changeColor("red");
        }
    }
    /**
     * Change this picture to use color display
     */
    public void puestaDeSol()
    {
        if (sun != null)   // only if it's painted already...
        {
            juanito.makeVisible();
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            sun.slowMoveVertical(1);
            juanito.slowMoveHorizontal(1);
            juanito.makeInvisible();
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            campo.changeColor("black");
            circulo1.changeColor("black");
            circulo2.changeColor("black");
            circulo3.changeColor("black");
            tronco.changeColor("black");
            copa.changeColor("black");
        }
    }
    /**
     * Change this picture to use color display
     */
    public void amanecer()
    {
        if (sun != null)   // only if it's painted already...
        {
            sun.slowMoveVertical(-30);
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            campo.changeColor("green");
            tronco.changeColor("red");
            copa.changeColor("green");
            circulo1.changeColor("red");
            circulo2.changeColor("red");
            circulo3.changeColor("red");
            juanita.moveHorizontal(30);
            juanita.makeVisible();
            juanito.makeVisible();
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            sun.slowMoveVertical(-1);
            juanito.slowMoveHorizontal(-2);
            juanita.slowMoveHorizontal(-2);
            juanito.makeInvisible();
            juanita.makeInvisible();
            sun.slowMoveVertical(-20);
            
        }
    }
    /**
     * Change this picture to use color display
     */
    public void paseo()
    {
        if (juanita != null)   // only if it's painted already...
        {
            juanita.makeVisible();
            juanita.slowMoveHorizontal(100);   
            juanita.makeInvisible();
        }
    }
    /**
     * Change this picture to use color display
     */
    public void arbol()
    {
        if (circulo1 != null)
        if (circulo2 != null)
        if (circulo3 != null)// only if it's painted already...
        {
            tronco.makeVisible();
            copa.makeVisible();
            circulo1.makeVisible();
            circulo2.makeVisible();
            circulo3.makeVisible();
        }
    }
    /**
     * Change this picture to use color display
     */
    public void cerezas()
    {
        if (circulo1 != null)
        if (circulo2 != null)
        if (circulo3 != null)// only if it's painted already...
        {
            circulo1.changeColor("red");
            circulo2.changeColor("red");
            circulo3.changeColor("red");
        }
    }
}

     