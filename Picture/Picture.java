
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square windowLeft;
    private Square windowRight;
    private Triangle roof;
    private Triangle tree;
    private Triangle tree1;
    private Circle sun;
    private Rectangle1 door;
    private Rectangle1 frontMud;
    private Rectangle1 chimmney;

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
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        windowLeft = new Square();
        windowLeft.changeColor("black");
        windowLeft.moveHorizontal(10);
        windowLeft.moveVertical(100);
        windowLeft.makeVisible();
        
        windowRight = new Square();
        windowRight.changeColor("black");
        windowRight.moveHorizontal(60);
        windowRight.moveVertical(100);
        windowRight.makeVisible();

        door = new Rectangle1();
        door.changeColor("blue");
        door.moveHorizontal(35);
        door.moveVertical(140);
        door.makeVisible();
        
        frontMud = new Rectangle1();
        frontMud.changeSize(350,40);
        frontMud.changeColor("yellow");
        frontMud.moveHorizontal(-50);
        frontMud.moveVertical(180);
        frontMud.makeVisible();
        Square stem;
        stem = new Square();
        stem.changeSize(15);
        stem.changeColor("black");
        stem.moveHorizontal(190);
        stem.moveVertical(180);
        stem.makeVisible();
        
        tree = new Triangle();
        tree.changeSize(90, 30);
        tree.moveHorizontal(210);
        tree.moveVertical(135);
        tree.makeVisible();
        
        stem = new Square();
        stem.changeSize(15);
        stem.changeColor("black");
        stem.moveHorizontal(165);
        stem.moveVertical(180);
        stem.makeVisible();
        tree1 = new Triangle();
        tree1.changeSize(60, 30);
        tree1.moveHorizontal(180);
        tree1.moveVertical(165);
        tree1.makeVisible();
        
        chimmney = new Rectangle1();
        chimmney.changeSize(16,30);
        chimmney.changeColor("black");
        chimmney.moveHorizontal(75);
        chimmney.moveVertical(40);
        chimmney.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();


        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            windowLeft.changeColor("white");
            windowRight.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            windowLeft.changeColor("black");
            windowRight.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
