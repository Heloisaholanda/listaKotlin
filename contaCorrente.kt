class ContaCorrente (val numeroConta: Inte, var saldo: Double,){
    
    fun imprimir (){
        println( "conta: $numeroConta \nSaldo")
    }
    
    fun depositar(valor: Double){ 
        saldo = saldo + valor 
        
        
    }
    
    fun sacar ( valor: Double)} 

     saldo = saldo - valor
   }
   
}
