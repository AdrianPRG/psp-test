abstract class Producto(Titulo:String,Precio:Double,Fecha_publi:Int,Descuentoproducto:Int) {

    var titulo=""
        get(){
            return field
        }
        set(value){
            if (value==""){
                field="Disco"
            }
        }

    var precio=0.0
        get(){
            return field
        }
        set(value){
            if (value<1){
                field=10.00
            }
            else field=value
        }
    var fecha=0
        get(){
            return field
        }
        set(value){
            if (value<1980 || value>2023){
                field=2019
            }
            else field=value
        }
    var descuento=0
        get(){
            return field
        }
        set(value){
            if (value<1){
                field=10
            }
            else field=value
        }


    init {
        titulo=Titulo
        precio=Precio
        fecha=Fecha_publi
        descuento=Descuentoproducto
    }

    fun obtenerdescuento(producto: Producto):Int{
        return producto.descuento
    }

   abstract fun imprimir()


}