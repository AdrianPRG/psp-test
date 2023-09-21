class ClienteRegistrado(Nombre:String,Apellidos:String,DNI:String,Telefono:String,Saldo:Double,Descuento:Int):Cliente {


    var nombre=""
    var apellidos=""
    var dni=""
    var telefono=""
    var saldo=0.0
    var descuento=0

    init {
        nombre=Nombre
        apellidos=Apellidos
        dni=DNI
        telefono=Telefono
        saldo=Saldo
        descuento=Descuento
    }

    override fun aplicadescuento(producto: Producto): Int {
        return super.aplicadescuento(producto)
    }

    override fun pagar(cantidad: Double): Boolean {
        TODO("Not yet implemented")
    }

    override fun infocliente() {
        println("CLIENTE NOMBRE $nombre APELLIDOS $apellidos DNI $dni TELEFONO $telefono SALDO $saldo DESCUENTO $descuento")
    }


}