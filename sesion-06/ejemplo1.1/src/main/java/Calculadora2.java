public class Calculadora2 {
    private CalculadoraDAO calculadoraDAO;

    public int suma(int a, int b){
        return a+b+calculadoraDAO.findValorConstante();
    }

    public int resta(int a, int b){
        return a-b-calculadoraDAO.findValorConstante();
    }

    public int multiplica(int a, int b){
        return a*b*calculadoraDAO.findValorConstante();
    }
}
