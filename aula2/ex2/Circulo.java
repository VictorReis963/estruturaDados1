package aula2.ex2;

public class Circulo {
    private float raio;

    public float getRaio(){
        return raio;
    }

    public void setRaio(float raio){
        this.raio=raio;
    }

    public class met{

        public void atualizar_raio(float novo_raio){
            if (novo_raio >=1){
                setRaio(novo_raio);
                System.out.println("Novo raio: "+ getRaio()+"\n");
            }
            else{
                System.out.println("Valor inserido inválido\n");
            }

        }


        public double calculaArea(){
            float r=getRaio();

            return Math.PI*Math.pow(r,2);
        }

    }


}
