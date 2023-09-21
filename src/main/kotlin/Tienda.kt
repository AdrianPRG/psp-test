class Tienda {

    var listaproductos= mutableListOf<Producto>()
    var listaclientes= mutableListOf<Cliente>()

    fun buscaproducto(titulo:Producto){

    }

    fun buscadisco(Disco:Disco){
        for (disco in listaproductos){
            if (Disco==disco){
                println("SE HA ENCONTRADO EL DISCO ${disco.titulo}, a continuacion su informacion")
                disco.imprimir()
            }
            else continue
        }
    }

    fun buscapeli(Peli:Pelicula){
        for (peli in listaproductos){
            if (Peli==peli){
                println("SE HA ENCONTRADO LA PELICULA ${peli.titulo}, a continuacion su informacion")
                peli.imprimir()
            }
            else continue
        }
    }

    fun comprapelicula(numejemplares:Int):Double{
        return 1.0
    }

    fun compradisco(numejemplares:Int):Double{
        return 1.0
    }

    fun listarcliente(){
        for (cliente in listaclientes){
            cliente.infocliente()
        }
    }

    fun Listarproducto(){
        for (producto in listaproductos){
            producto.imprimir()
        }
    }

}