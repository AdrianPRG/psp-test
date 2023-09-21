class Disco(Titulo:String,Precio:Double,Fecha_publi:Int,Descuentoproducto:Int,Genero:String,Grupo:String,Stock:Int):Producto(Titulo,Precio,Fecha_publi, Descuentoproducto) {

    var genero=""
        get(){
            return field
        }
        set(value){
            if (value==""){
                field="DEFECTO: ROCK"
            }
            else field=value
        }
    var grupo=""
        get(){
            return field
        }
        set(value){
            if (value==""){
                field="SiM"
            }
            else field=value
        }
    var stock=0
        get(){
            return field
        }
        set(value){
            if (value<1){
                field=100
            }
            else field=value
        }

    init {
        genero=Genero
        grupo=Grupo
        stock=Stock
    }

    override fun imprimir() {
        println("DISCO $titulo PRECIO $precio FECHA PUBLICACION $fecha DESCUENTO $descuento GENERO $genero GRUPO $grupo STOCK $stock")
    }

}