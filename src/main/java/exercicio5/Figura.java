package exercicio5;

public abstract class  Figura {
    private String cor;

    public Figura(String cor){
        super();
        this.cor = cor;
    }

    public Figura (){

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString(){
        return "Figura [cor=" + cor + "]";
    }

    public abstract double area();
}
