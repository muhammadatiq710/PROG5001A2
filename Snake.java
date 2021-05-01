/**
 * Write a description of class Snake here.
 *
  * @author (Muhammad Atiq)
 * @date (02-May-21)
 */
 abstract class Snake //abstract snake class
{
    /**
     * Constructor for objects of class Snake
     */
    
    public Snake() {
        // initialise instance variables        
    }

    abstract void drawSnake(); //abstract method to draw snake
    abstract void moveSnake();    //abstract method to move snake
    abstract void increaseSnakeSize(); //abstract method to incease snake size
    abstract void customizeSnakeColor(); //abstract method to customize snake color
}
