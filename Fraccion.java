public class Fraccion{
    //Atributos
    int numerador = 0;
    int denominador = 1;

    //Métodos
    
    //Constructor
    public Fraccion(int n, int d){
        this.numerador = n;
        this.denominador = d;
    }


    Fraccion dividir(int num, int denom){
        int nuevoNumerador = this.numerador * denom;
        int nuevoDenominador = this.denominador * num;

       Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);

       return fraccionResultado;
    } //dividir
    
    Fraccion Multiplicar(int num, int denom){
        int nuevoNumerador = this.numerador * num;
        int nuevoDenominador = this.denominador * denom;

       Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);

       return fraccionResultado;
    } //multiplicar

    Fraccion Suma(int num, int denom){
        int nuevoNumerador = (this.numerador * denom)+(this.denominador * num);
        int nuevoDenominador = this.denominador * denom;
            
    Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);
    return fraccionResultado;
    }//suma
        
    Fraccion Resta(int num, int denom){
        int nuevoNumerador = (this.numerador * denom)-(this.denominador * num);
        int nuevoDenominador = this.denominador * denom;
            
    Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);
    return fraccionResultado;
    }//Resta
    
    Fraccion raizCuadrada(){
        int nuevoNumerador = this.numerador * this.numerador;
        int nuevoDenominador = this.denominador * this.denominador;

       Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);

       return fraccionResultado;
    }//Raiz

    

/*Definir las operaciones definidas en el TDA
    


    restar()


    potencia()*/
}