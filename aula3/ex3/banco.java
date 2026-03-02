import java.until.scanner;

public  class banco(double value){
    private double saldo;
    private int id;
    private String name;
    private String tipoConta;

    public class detalhesConta(){
        System.out.println("nome do bendito: "+name);
        System.out.println("/n id do bendito: "+id);
        System.out.println("/n aldo do bendito: "+saldo);
        System.out.println("/n tipo de conta do abençoado: "+tipoConta);
    }

    public class depositar(double add){
        this.saldo=this.saldo+add;
        System.out.println("saldo atual do consagrado: "+ saldo);
    }

    public class sacar(double value){
        this.saldo=this.saldo-add;
        System.out.println("saldo atual do consagrado: "+ saldo);

    }

    



}