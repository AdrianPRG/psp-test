fun main(args: Array<String>) {

    var listaproductosmain= mutableListOf<Producto>()

    var tienda=Tienda()


    /**AQUI VAN LOS PRODUCTOS*/

    var disco1=Disco("Barricades",30.0,2020,15,"EPIC","Hiyoru Swano",20000)
    listaproductosmain.add(disco1)
    var disco2=Disco("Buleria",40.0,2010,30,"Buleria","David Bibal",15000)
    listaproductosmain.add(disco2)
    var disco3=Disco("Si la calle llama",30.0,2023,10,"Rap","Eladio Carrion",5000)
    listaproductosmain.add(disco3)
    var pelicula1=Pelicula("DBZ BROLY",50.0,2019,20,"ACCION","TOYORATO")
    listaproductosmain.add(pelicula1)
    var pelicula2=Pelicula("EL GATO CON BOTA",25.0,2023,10,"ACCION","YOMIS-MO")
    listaproductosmain.add(pelicula2)

    /**CLIENTES*/

    var clienteregistrado1:ClienteRegistrado=ClienteRegistrado("Adrian","LOPEZ","139042424","6332103",2900.0,20)
    var clienteregistrado2:ClienteRegistrado=ClienteRegistrado("Elmoi","Brene","421577190","86937583",6200.0,5)

    /*AÑADIR PRODUCTOS A LISTA DE TIENDA*/
    //Lo hice con un for para no poner el add a la lista uno por uno

    for (producto in listaproductosmain){
        tienda.listaproductos.add(producto)
    }

    /*Añadir productos a lista cliente*/

    tienda.listaclientes.add(clienteregistrado1)
    tienda.listaclientes.add(clienteregistrado2)

    /*LISTAR CLIENTES*/

    tienda.listarcliente()

    /*LISTAR PRODUCTO*/

    tienda.Listarproducto()

    /*PROBAREMOS BUSCAR UN DISCO */

    tienda.buscadisco(disco1)

    /*PROBAREMOS BUSCAR UNA PELICULA*/

    tienda.buscapeli(pelicula2)






}