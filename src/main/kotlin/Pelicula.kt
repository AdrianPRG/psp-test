class Pelicula(Titulo:String,Precio:Double,Fecha_publi:Int,Descuentoproducto:Int,Genero:String,Director:String):Producto(Titulo, Precio, Fecha_publi, Descuentoproducto) {

    var genero=""
        get(){
            return field
        }
        set(value){
            if (value==""){
                field="ACCION"
            }
            else field=value
        }
    var director=""
        get(){
            return field
        }
        set(value){
            if (value==""){
                field="ADRI-DIRECTIONS"
            }
            else field=value
        }
    init {
        genero=Genero
        director=Director
    }

    override fun imprimir() {
        println("PELICULA $titulo PRECIO $precio FECHA PUBLICACION $fecha DESCUENTO $descuento GENERO $genero DIRECTOR $director")
    }
}