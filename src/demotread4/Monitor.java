package demotread4;

public class Monitor {

    char [] buff = null;
    int tope = 0;

    private boolean lleno = false;
    private boolean vacío = true;
    
    
     
    String cadena;
   
    public Monitor (int capacidad)
    {
        buff = new char [capacidad]; 
    }
    

    
    public synchronized void poner (char c) throws Exception 
    {
        while (lleno)
        {
            wait();
        }
        buff [tope++] = c; //Sección Crítica
        vacío = false;
        lleno = tope >= buff.length;
        notifyAll();
        
    }
    
   
    public synchronized char sacar () throws Exception
    {
        while (vacío)
        {
            wait();
        }
        
        char c = buff [--tope];
        lleno = false;
        vacío = (tope <= 0);
        notifyAll();
        return c;
      
    }
    
    
  }
