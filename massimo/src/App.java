public class App 
{
    public static void main(String[] args) throws Exception {
        int risultato = max(5, 10);
        System.out.println("Il valore massimo è: " + risultato);
    }

    public static int max(int a, int b) 
    {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
