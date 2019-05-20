package demotread4;

public class Consumidor extends Thread {

    private Monitor buff;
    private int n;
    private int sleep;
    String historial = "";
    DemoTread4 obj = new DemoTread4();

    public Consumidor (Monitor b, int n, int s) {
        this.buff = b;
        this.n = n;
        this.sleep = s;

    }
    
   public void run () 
   {
       try 
       {
           char c;
           for (int i = 0; i < n; i++) {
               c = buff.sacar();
               buffer();
               System.out.println("Consumí: " + c);
               historial = historial + "  Consumí " + c;
                obj.historial += historial;
               sleep((int) (Math.random() * sleep));
           }
           System.out.println(historial);
           obj.actualizar();
       }catch (Exception ex)
       {
           ex.printStackTrace();
           throw new RuntimeException(ex);
       }
   }
   
 public Monitor buffer () {
        return buff;
    }
 
}
