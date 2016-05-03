package ordenando;

public class Telefono {
    private int tlf;
    
    public Telefono()
    {
        tlf=telef();
    }
    
    private int telef()
    {
        return (int) (Math.random()*600000+100000);
    }
    
    public int getTelefono()
    {
        return tlf;
    }
    
    public void setTelefono()
    {
        tlf=telef();
    }
}
