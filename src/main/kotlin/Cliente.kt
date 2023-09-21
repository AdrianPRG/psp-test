interface Cliente {

    fun aplicadescuento(producto: Producto):Int{
        return 0
    }

    fun pagar(cantidad:Double):Boolean

    fun infocliente()

}