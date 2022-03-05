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
    
    Fraccion potencia(int num){
        
        double nuevoNumerador1 = Math.pow(this.numerador, num);
        double nuevoDenominador1 = Math.pow(this.denominador, num);
        int nuevoNumerador = (int) Math.round(nuevoNumerador1);
        int nuevoDenominador = (int) Math.round(nuevoDenominador1);
       Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);

       return fraccionResultado; 

    }//Potencia
    
    double Porcentaje(){

       return (double) this.numerador / (double) this.denominador * 100;
    }//Porcentaje
    
    double Decimal(){

       return (double) this.numerador / (double) this.denominador;

    }//Decimal

/*Definir las operaciones definidas en el TDA
    


    restar()


    potencia()*/
}