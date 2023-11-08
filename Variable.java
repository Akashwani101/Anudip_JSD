import javax.sql.rowset.spi.SyncResolver;

public class Variable {

    static class car{
        int a = 20;
        String name = "lala";
    } 
    public static void main(String[] args) {
        
        car refVar = new car();
        System.out.println(refVar.name);
    }
    void run(){
        class num{
            int aa = 20;
        System.out.println(aa);
        }
    }
    
}
