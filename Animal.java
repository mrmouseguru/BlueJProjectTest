
public class Animal
{
   //state
    protected float size;
    protected String color;
    protected boolean sex;
    
    //constructor
    public Animal(){}
    
    public Animal(float _size, String _color, boolean _sex)
    {
        //super();
        size = _size;
        color = _color;
        sex = _sex;
    }
    //behavior
    public void eat(){
        System.out.println("Eating ...");
    }
    
    public void sleep()
    {
        System.out.println("Sleeping ...");
    }
    
    public void makeSound()
    {
        System.out.println("Making sound ....");
    }
}