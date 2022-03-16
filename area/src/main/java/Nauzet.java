public class Nauzet {
    String tipo;
    Integer valor1;
    Integer valor2;
    /**
     * Contructor por defecto
     */
    public Nauzet(){

    }

    /**
     * Constructor con un parametro
     * @param tipo
     */
    public Nauzet(String tipo){
    this.tipo=tipo;
    }

    /**
     * constructor con dos parametros
     * @param tipo
     * @param valor1
     */
    public Nauzet(String tipo,Integer valor1){
        this.tipo=tipo;
        this.valor1=valor1;
    }

    /**
     * constructor con tres parametros
     * @param tipo
     * @param valor1
     * @param valor2
     */
    public Nauzet(String tipo,Integer valor1,Integer valor2){
        this.tipo=tipo;
        this.valor1=valor1;
        this.valor2=valor2;
    }

    /**
     * Metodo con 2 parametros para calcular el area segun el tipo de figura
     * @param valor1
     * @param valor2
     */
    public void CalculoArea(Integer valor1,Integer valor2){

    }

}
