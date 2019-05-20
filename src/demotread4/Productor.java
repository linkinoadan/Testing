package demotread4;

public class Productor extends Thread {
  
DemoTread4 obj = new DemoTread4();
    private Monitor buff;
    private int n;
    private int sleep;
    String historial = "";
    char c;


    public Productor(Monitor b, int n, int s, char c) {
        this.buff = b;
        this.n = n;
        this.sleep = s;
        this.c = c;
    }

    public void star() {
        try {
            String frase = "Produje: ";
            for (int i = 0; i < n; i++) {
                   c = (char) (c + i);
                   buff.poner(c);
                   buffer();                    
                System.out.println("Produje: " + c); 
                this.historial = this.historial + "  Produje: " + c;
                obj.historial += this.historial;
                sleep((int) (Math.random() * sleep));
             }
            obj.actualizar();
           System.out.println(obj.historial);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
       
    }
    
    public Monitor buffer () {
        return buff;
    }

}