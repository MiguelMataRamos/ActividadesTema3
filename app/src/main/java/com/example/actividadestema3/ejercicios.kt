package com.example.actividadestema3


fun main(){
    println(esPar(20));


}


//1. Escribe una función llamada esPar que tome un número como argumento y devuelva true si es
//par y false si es impar.
fun esPar(numero:Int):Boolean{
    if (){
        return numero%2 == 0;
    }
    return false;

}

//2. Crea una función llamada compararTexto que tome dos cadenas de texto como argumentos y
//determine si son iguales utilizando tanto equals() como el operador ==.
fun compararTexto(t1 : String, t2: String){
    if (t1.equals(t2)){
        println("SON IGUALES");
    }else{
        println("NO SON IGUALES");
    }
}

//3. Implementa una función llamada esMayorQue10YMenorQue20 que tome dos números como
//argumentos y devuelva true si ambos números son mayores que 10 y menores que 20, y false en
//caso contrario.
fun esMayorQue10YMenorQue20(n1:Int, n2: Int):Boolean{
    if (n1 in 11..19 && n2 in 11..19){
        return true;
    }
    return false;
}




