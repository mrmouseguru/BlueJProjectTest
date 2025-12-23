
public class Cow extends Animal
{
    //state
    private float milk;
    
    //constructor
    public Cow(){}
    
      public Cow(float _size, String _color, boolean _sex, float _milk)
    {
       super(_size, _color, _sex);
        milk = _milk;
    }
    
    public void reChew()
    {
        System.out.println("Rechewing ....");
    }
    
    @Override
    public void makeSound()
    {
        System.out.println("Ụm bò ....");
    }
}