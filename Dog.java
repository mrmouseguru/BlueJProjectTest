
public class Dog extends Animal
{    
    //constructor
    public Dog(){}
    
    public Dog(float _size, String _color, boolean _sex)
    {
        super(_size, _color, _sex);
        
    }
    //thay đổi hành vi của cha tại con
    @Override
    public void makeSound()
    {
        //override code
        System.out.println("Gâu gâu");
    }
     
    
    
}