package com.example.sprintmdulo5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sprintmdulo5.databinding.FragmentPrincipalBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PrincipalFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PrincipalFragment : Fragment() {
    private lateinit var binding: FragmentPrincipalBinding
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPrincipalBinding.inflate(layoutInflater, container, false)
        initAdapter()
        initData()
        return binding.root
    }


    private fun initAdapter() {
        var adapter = Adapter()
        var productoTienda = ProductoTienda()
        adapter.setData(productoTienda)
        binding.listaproductosRV.adapter = adapter

    }

    fun initData() {
        val productos = mutableListOf<ProductoTienda>().apply {
            add(ProductoTienda("Pasión de vaquerales", 200000, "Horrendas botas de vaquero, color café y detalles de dudosa procedencia. Si se siente parte del elenco de Pasión de Gavilanes, no deje pasar esta oportunidad.","https://images.unsplash.com/photo-1578847945588-d6c83689e3d2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=876&q=80"))
            add(ProductoTienda("Toy story", 500000, "Si creciste viendo Toy Story, este es el momento ideal para volver a transformarte en el jovenzuelo inocente que solías ser. Última unidad, rebajada al 80% por lo feas que son", "https://images.unsplash.com/photo-1635779503036-27cbbdcdbbd1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=774&q=80"))
            add(ProductoTienda("Otoño lovers", 273827, "Si al igual que yo, eres una otoño lover, entonces aquí tienes una oportunidad única e irrepetible de la vida. Estos zapatos horribles, con un tono café más horrible aún pasan desapercibidas ante la belleza de esta estación", "https://images.unsplash.com/photo-1528641638513-63e382072b5c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxjb2xsZWN0aW9uLXBhZ2V8MXw4ODUzMzA2fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60"))
            add(ProductoTienda("Saltando bajo la lluvia", 12343, "Con un descuentazo de 10000%, no puedes negarte a comprar estas preciosidades, qué importa la calidad si igual te vas a mojar bajo la lluvia", "https://images.unsplash.com/photo-1578422468716-450ac3abc077?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxjb2xsZWN0aW9uLXBhZ2V8MXw5NDkyMzE3fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60"))
            add(ProductoTienda("Te la vuelas", 929392, "No es necesario ser programador, ni ser amigo de las plantas mágicas, estas zapatillas te llevarán al cielo sin necesidad de tener alas", "https://images.unsplash.com/photo-1593010932917-92bd21088dee?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=465&q=80"))
            add(ProductoTienda("Botas carrete/perreo", 293828, "Este es el outfit que usaría una chica que perrea hasta el piso, qué mejor combinación que hacerlo con estas botas que te tiran al piso. Cuidado al caminar, es muy fácil irse de hociboca al suelo","https://images.unsplash.com/photo-1618006248091-7ff5da1f8a65?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=358&q=80"))
            add(ProductoTienda("Negras como la vida misma", 828323, "Ni se te ocurra, ya son mías. Saca ese dedo de agregar al carrito, rapidito","https://images.unsplash.com/photo-1582896911329-35927907b8f3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=482&q=80"))
            add(ProductoTienda("Sin miedo al éxito", 394883, "Ideales si quieres tu preciado momento de outfit perrón de oficina","https://images.unsplash.com/photo-1644424235193-870d477ef7a3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"))
            add(ProductoTienda("Sin botas(ni fotos) no hay trekking", 30518, "Porque si no subiste foto en realidad no estás haciendo ejercicio, así que cuida tu outfit de semderosta. Sí, las zapatillas también cuentan ","https://images.unsplash.com/photo-1630381503692-ac79cbac1b56?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=725&q=80"))
            add(ProductoTienda("Stormy Kardashian", 3416264, "Ser una kardashian es carísimo, igual que estas botas de la Stormy Tormenta Kardashian, ideales para presumirte como una viaipi de la escena estadounidense", "https://images.unsplash.com/photo-1580662124358-a27775604219?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=871&q=80"))
            add(ProductoTienda("Sand Shoes", 18236, "No necesitas unos zapatos tan caros, porque todos terminan cubiertos de arena. Solo color de la foto disponible, talla 35", "https://images.unsplash.com/photo-1576760994270-85335a1c613c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"))
            add(ProductoTienda("Macetines", 356125 , "Siempre puedes encontrar una nueva utilidad para aquellos botines que deseas comprar, pero que no combinan con tu existencia, pero si con tu consumismo. Tallas disponibles 35, 37, 39; en el color que se observa en la imagen.", "https://images.unsplash.com/photo-1620827252031-146d52644aac?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=774&q=80"))
            add(ProductoTienda("Decopato", 689384 , "Únete a la tendencia de los zapatos voladores no identificados. Si tienes suerte podrás decorar tu casa por el módico precio que se observa más abajo", "https://images.unsplash.com/photo-1520521179602-a47780b493dd?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80"))
            add(ProductoTienda("Campotín", 82732, "Botines color ocre, ideales para desconectar de la ciudad y de todas las responsabilidades del día a día. Si no lo recuerdas, no pasó", "https://images.unsplash.com/uploads/141172692104151d94dd4/4f900e54?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=904&q=80"))
            add(ProductoTienda("Kesesooo", 62371, "No juzgo las decisiones de nadie, pero lleveselo antes de que me de un soponcio", "https://images.unsplash.com/photo-1522142319000-96e822a31065?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80"))
            add(ProductoTienda("All we(don't) need is love", 71218 , "Si aún cree en el amorshhh, estas zapatillas son perfectas para mostrar que todavía tiene un corazoncito por ahí. Color de zapatillas solo en blanco, y los corazones solo en rojo porque así lo dice la ciencia", "https://images.unsplash.com/photo-1668706976931-52bac93e9d1b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80"))
            add(ProductoTienda("Todo tiempo al lado de la playa fue mejor",283277 , "Son unas sandalias horrendas, pero no pagarías lo que fuera por sentirte otra vez de vacaciones?", "https://images.unsplash.com/photo-1515965230482-0b9b46fbee14?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=917&q=80"))
            add(ProductoTienda("Sandalias viajeras",91282 , "Si utilizas tres veces esta sandalías, te llevas una vida de viajero forever", "https://images.unsplash.com/photo-1509134072290-fffe152264c0?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=873&q=80"))
            add(ProductoTienda("Chalatines", 292932 , "Todos hemos ocupado las chalas con los calcetines. Nada de glamour but, a quién le importa, los gustos culposos son para seguir disfrutándolos. Por la compra de estas sandalias se lleva un pack de calcetines", "https://images.unsplash.com/photo-1504659913281-61817e6e2e9b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=774&q=80"))
            add(ProductoTienda("Zapa y perrea",882832 , "No sabes bailar? o solo no llevas las zapatillas correctas?, por la compra de este producto te llevas a uno de los bailarines de Rojo para que aprendas a perrear hasta el piso", "https://images.unsplash.com/photo-1528312197634-81237efce1f2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=464&q=80"))
            add(ProductoTienda("WTF", 0 , "Si es valiente para ocupar algo tan feo, usted no me debe pagar nada, yo le debo a usted", "https://images.unsplash.com/photo-1542674684-9d4e400a09fb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"))
            add(ProductoTienda("Bendishower", 29382 , "Ideales para hacerle un obsequio al papá de la bendi, viene con el soponcio del aludido incluido", "https://images.unsplash.com/photo-1497319892902-e0a47680bb6b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=871&q=80"))
            add(ProductoTienda("Mi tesoro", 19282, "Las favoritas del 99% de los chilensis", "https://images.unsplash.com/photo-1543420629-5350879dd4cd?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=388&q=80"))
            add(ProductoTienda("Cleopatra",109291 , "Si no son las sandalias que usaba miss Cleo, entonces estuvieron muy cerca de serlo. Siente la comodidad de andar caminando con una piedra amarrada a los pies, con el diseño más hermoso de la vida", "https://images.unsplash.com/photo-1603487742131-4160ec999306?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"))
            add(ProductoTienda("Tigresa del oriente mood", 192881, "Una verdadera tigresa no deja de pasar esta oportunidad. Color: difícil de definir entre tanta fealdad.", "https://images.unsplash.com/photo-1606846851283-6394c2840b87?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=736&q=80"))
            add(ProductoTienda("24 horas", 27732 , "Puedes ocuparla incluso al dormir, son lo más cómodo que verás jamás", "https://images.unsplash.com/photo-1598343168334-00b3b1791280?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80"))
            add(ProductoTienda("Pintamos toda la casa", 192929 , "Azúcar, juguetes y muchos colores. De seguro no serás una Chica Superpoderosa al usarlas, pero te sentirás el arcoiris que viene después de la tormenta", "https://images.unsplash.com/photo-1535038872957-c20dea0c6f26?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80"))
            add(ProductoTienda("Multiuso", 57848, "Ideales para actividades que requieran de mucho movimiento. Incluso son geniales para hacer ejercicio. Color por defecto: negro como la vida misma", "https://images.unsplash.com/photo-1505765875074-b5e4ab9b44aa?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80"))
            add(ProductoTienda("Channel", 70038483, "Solo por ser channel, deja que ese don consumista te lleve por el camino del bien", "https://images.unsplash.com/photo-1604001307862-2d953b875079?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=379&q=80"))
            add(ProductoTienda("Stilettos instagrameables", 126513, "No son hermosos?, la ropa necesaria para poder combinar este hermoso zapato no viene incluido", "https://images.unsplash.com/photo-1459712105412-be146fae746d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=874&q=80"))
            add(ProductoTienda("Barbierina", 28732, "Las ballerinas que toda generación Barbie necesita", "https://images.unsplash.com/photo-1582738412120-7f6baeff4da9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"))
            add(ProductoTienda("Amor a primera visa", 823721, "No disponibles, porque no se puede decir quien yo, se gastó todos los fondos de la visa para estos preciosos stilettos", "https://images.unsplash.com/photo-1566041254940-fe7a3b50257e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1374&q=80"))
            add(ProductoTienda("Botas de aguairis", 81821 , "Sé el arcoiris en medio de la tormenta que los demás necesitan en sus vidas. Ve por ellas, ya quedan pocas unidades", "https://images.unsplash.com/photo-1571508914084-b52234530ceb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"))
            add(ProductoTienda("Tacotillas", 727366, "Sabes que debes correr para llegar a la hora, pero con glamour. Con esta opción no tendrás que debatirte nunca más entre la puntualidad y la presentación personal porque puedes tener ambas", "https://images.unsplash.com/photo-1563662931846-29b0af7443ff?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"))
            add(ProductoTienda("80s styles", 92991 , "Los 80s nunca se han ido, se sappbe y tu playlist de spotify también.", "https://images.unsplash.com/photo-1645295461833-856fadd907f4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"))
            add(ProductoTienda("Blanca y radiante", 283882 , "Y de seguro no podrás fugarte corriendo de la boda, pero que más da, es importante hacerlo viendose guapa", "https://plus.unsplash.com/premium_photo-1672192497598-ca9a3a2370d6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=435&q=80"))
            add(ProductoTienda("Chateau", 91281, "Par de zapatos de tacón peep-toe de cuero blanco con detalle de lazo", "https://images.unsplash.com/photo-1578263175419-3f9f8633ea5a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1374&q=80"))
            add(ProductoTienda("No son reebok ni son nike", 48439 , "Zapatillas ideales para running, color blanco y detalles en colores indescriptibles para las personas que distinguimos solo 20 colores con sus respectivos nombres", "https://images.unsplash.com/photo-1594639521732-bc3da91f8417?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=695&q=80"))
            add(ProductoTienda("Louis Vuitton", 18291291 , "Ideales para usarlas para Halloween. Color calabaza y algo que se parece al negro. También aceptamos algún órgano en forma de pago", "https://images.unsplash.com/photo-1580140485722-33ac5f654897?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=580&q=80"))
            add(ProductoTienda("Nike", 92932, "De la colección love is in the air, pero no en mi aire", "https://images.unsplash.com/photo-1588099768550-4014589e03e0?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"))
            add(ProductoTienda("Nike", 19288, "Solo en color verde militar y no se aceptan devoluciones", "https://images.unsplash.com/photo-1529810313688-44ea1c2d81d3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=641&q=80"))
            add(ProductoTienda("Nike", 81721, "Modelo Air Jordan, en tonalidad negro y gris", "https://images.unsplash.com/photo-1551726195-0c4e3e49f2a0?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80"))
            add(ProductoTienda("New Balance", 827137, "En todos los tonos pasteles que te puedas imaginar", "https://images.unsplash.com/photo-1465453869711-7e174808ace9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=876&q=80"))
            add(ProductoTienda("Nike", 83747 , "En muchos colores", "https://images.unsplash.com/photo-1584735175315-9d5df23860e6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"))
            add(ProductoTienda("Nike", 28838 , "Air force en tono blanco y azul", "https://images.unsplash.com/photo-1595950653106-6c9ebd614d3a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"))
            add(ProductoTienda("Converse all star", 48938, "Solo disponible en color rojo", "https://images.unsplash.com/photo-1607522370275-f14206abe5d3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=821&q=80"))
            add(ProductoTienda("Nadie brilla más que yo",823872 , "zapatos peep toe con brillo, porque nadie brilla más que tú", "https://images.unsplash.com/photo-1581101767113-1677fc2beaa8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=580&q=80"))

        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PrincipalFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PrincipalFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}