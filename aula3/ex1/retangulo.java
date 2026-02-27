package ex1;


public class retangulo{
   private float largura= 1;
   private float altura=1;

    // getter e setters

    public float getAltura(){ return altura;  }
    public void setAltura(float altura){ this.altura= altura; }

    public float getLargura(){return largura;}
    public void setLargura(float largura){this.largura = largura;}

    public void retangulo(){
        retangulo r = new retangulo();
        r.setAltura(altura);
        r.setLargura(largura);
        r.close();



    }
    public retangulo(float altura, float largura){
        retangulo r = new retangulo();
        r.setAltura(altura);
        r.setLargura(largura);

        r.close();

    }

}




