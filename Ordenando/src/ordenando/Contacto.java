package ordenando;

public class Contacto {
    private Telefono telefon;
    private Nombre nomb;
    
    public Contacto (String n)
    {
        nomb= new Nombre (n);
        telefon= new Telefono();       
    }

    Contacto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setNomb(String n)
    {
        nomb.setNombre(n);
    }
    
    public String getNomb()
    {
        return nomb.getNombre();
    }
    
    public int getNumero()
    {
        return telefon.getTelefono();
    }
    
    public void setNumero()
    {
        telefon.setTelefono();
    }

    
}
