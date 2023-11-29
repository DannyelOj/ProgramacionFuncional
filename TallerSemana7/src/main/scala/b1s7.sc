//Implemente en Scala lo siguiente:

//La expresión:
(1 to 10).sum


//Defina la función:
def fun(f: Int): Double = ((1 to f).sum) * (scala.math.pow(f, f - 1))
fun(10)

//Mapee la siguiente
val map = ((n: Int) => scala.math.pow((1 to n).sum, 2) - (2*n) )
map(3)


//Implemente la función isPrime, definida así:

def isPrime(n : Int) = (2 to n-1).forall(k => n % k != 0)
isPrime(6)

/*Usted ha sido contratado en una veterinaria para realizar algunos reportes que pueden incluir información de las
 mascotas o del propietario o de ambos. La información se ha estructurado de la siguiente manera:
 */
case class Propietario(nombre : String, edad : Int, genero : String)
case class Mascota(tipo : String, nombre : String, raza : String, edad : Int, propietario: Propietario)

val datos: List[Mascota] = List (
  Mascota("Gato", "Michi", "Siames", 4, Propietario("María", 18, "F")),
  Mascota("Tortuga", "Rafael", "Terrestre", 80, Propietario("Marco", 45, "M")),
  Mascota("Perro", "Gaudí", "Huski", 5, Propietario("Miguel", 33, "M")),
  Mascota("Perro", "Toby", "Boxer", 7, Propietario("Mirta", 51, "F")),
  Mascota("Gato", "Frufru", "Siberiano", 2, Propietario("Manuel", 23, "M")),
)

def mayorEdad(mascota: List[Mascota]):Mascota = mascota.maxBy(_.edad)
print(mayorEdad(datos))

val menorEdad = (mascota: List[Mascota]) => mascota.minBy(_.edad)
print(menorEdad(datos))

def pMayorEdad(mascota: List[Mascota]):Mascota = mascota.maxBy(_.propietario.edad)
print(pMayorEdad(datos))

val pMenorEdad = (mascota: List[Mascota]) => mascota.minBy(_.propietario.edad)
print(pMenorEdad(datos))

def nombreM (mascota : List[Mascota]) = mascota.forall(_.propietario.nombre.startsWith("M"))
nombreM(datos)

val ordenarN = (mascota: List[Mascota]) => mascota.sortBy(_.nombre)
print(ordenarN(datos))

def ordenarE (mascota : List[Mascota]) = mascota.sortBy(_.edad)
ordenarE(datos)

val ordenarNM = (mascota: List[Mascota]) => mascota.sortBy(_.propietario.nombre)
print(ordenarNM(datos))

case class Jugador(Nombres : String, Posicion : String, Nacionalidad : String, Edad : Int, Alineaciones : Int,
                        Goles : Int, Club : String, Ciudad : String, AnioFundacion : Int)
val datos: List[Jugador] = List(
  Jugador("Damián Díaz","Mediocentro ofensivo"," Ecuador/Argentina",37,15,9,"Barcelona SC Guayaquil","Guayaquil",1925),
  Jugador("Janner Corozo","Extremo izquierdo","Ecuador",27,13,3,"Barcelona SC Guayaquil","Guayaquil",1925),
  Jugador("Ronie Carrillo","Delantero centro","Ecuador",26,15,9,"CD El Nacional","Quito",1960),
  Jugador("Byron Palacios","Delantero centro","Ecuador",28,14,6,"CD El Nacional","Quito",1960),
  Jugador("Maicon Solís","Extremo derecho","Ecuador",29,14,4,"CD El Nacional","Quito",1960),
  Jugador("Jorge Ordóñez","Extremo derecho","Ecuador",27,11,4,"CD El Nacional","Quito",1960),
  Jugador("Mauro Díaz","Mediocentro ofensivo","Argentina",32,13,6,"CD Universidad Católica","Quito",1963),
  Jugador("Aron Rodríguez","Extremo izquierdo","Ecuador",23,13,4,"CD Universidad Católica","Quito",1963),
  Jugador("Miler Bolaños","Mediocentro ofensivo","Ecuador",33,10,7,"CS Emelec","Guayaquil",1929),
  Jugador("Alejandro Cabeza","Delantero centro","Ecuador",26,15,3,"CS Emelec","Guayaquil",1929),
  Jugador("Brian Oyola","Extremo izquierdo","Argentina",27,15,3,"Delfín SC","Manta",1981),
  Jugador("Raúl Becerra","Delantero centro"," Argentina/Chile",35,15,8,"Deportivo Cuenca","Cuenca",1971),
  Jugador("Joaquín Vergés", "Mediocentro ofensivo","Uruguay",31,15,4,"Gualaceo SC","Gualaceo",2000),
  Jugador("Miguel Parrales","Delantero centro","Ecuador",27,14,13,"Guayaquil City FC","Guayaquil",2007),
  Jugador("Michael Hoyos","Extremo derecho"," Argentina/Ecuador",31,13,10,"Independiente del Valle","Sangolquí",1958),
  Jugador("Alexander Alvarado","Extremo izquierdo","Ecuador",24,15,9,"LDU Quito", "Quito",1918),
  Jugador("José Angulo","Delantero centro","Ecuador",28,12,3,"LDU Quito","Quito",1918),
  Jugador("Roberto Garcés","Pivote","Ecuador",30,15,5,"Libertad FC","Loja",2017),
  Jugador("Renny Simisterra","Delantero centro","Ecuador",25,13,4,"Libertad FC","Loja",2017),
  Jugador("Anderson Naula","Delantero centro","Ecuador",24,15,3,"Libertad FC","Loja",2017),
  Jugador("Cristhian Solano","Extremo izquierdo","Ecuador",24,15,3,"Orense SC","Machala",2009),
  Jugador("Jhon Cifuente","Delantero centro","Ecuador",30,14,7,"SD Aucas","Quito",1945),
  Jugador("Jean Carlos Blanco","Delantero centro","Colombia",31,8,7,"Técnico Universitario","Ambato",1971),
  Jugador("Alexander Bolaños","Delantero centro","Ecuador",23,13,4,"Técnico Universitario","Ambato",1971),
  Jugador("Luis Estupiñán","Extremo derecho","Ecuador",24,12,3,"Técnico Universitario","Ambato",1971),
  )
//1.
val promedio = (jugadores:List[Jugador]) => jugadores.map(_.Goles).sum/jugadores.length.toDouble
promedio(datos)
val goleadores = (jugadores:List[Jugador]) => jugadores.map(_.Edad)
goleadores(datos)
val partidosJugados = (jugadores:List[Jugador]) => jugadores.map(_.Alineaciones).sum
partidosJugados(datos)
val fundacion = (jugadores:List[Jugador]) => jugadores.map(_.AnioFundacion)
fundacion(datos)
//2
val nacionalidad = (jugadores:List[Jugador]) => jugadores.map(_.Nacionalidad)
nacionalidad(datos)
//3
def nacionalidadMixta (jugadores : List[Jugador]) = jugadores.map(_.Nacionalidad.contains("/")match{
  case true => 1 case false => 0}).sum
nacionalidadMixta(datos)
//4
val posicion = (jugadores:List[Jugador]) => jugadores.map(_.Posicion)
posicion(datos)
//5
val maxGoles = (jugadores:List[Jugador]) => datos.filter(_.Nacionalidad.contains("Ecuador")).maxBy(_.Goles)
maxGoles(datos)
//6
val minGoles = (jugadores:List[Jugador]) => datos.filter(_.Nacionalidad.contains("Ecuador")).minBy(_.Goles)
minGoles(datos)
//7
val minEdad = (jugadores:List[Jugador]) => jugadores.minBy(_.Edad)
minEdad(datos)
//8
val maxEdad = (jugadores:List[Jugador]) => jugadores.maxBy(_.Edad)
maxEdad(datos)
//9
val menPartidos = (jugadores:List[Jugador]) => jugadores.minBy(_.Alineaciones) match
  case j => (j.Nacionalidad, j.Posicion, j.Nombres)
menPartidos(datos)
//10
val equipo = (jugadores:List[Jugador]) => jugadores.map(_.Club)
equipo(datos)
//11
val relacion = datos.map(jugador=>jugador.Goles.toDouble/jugador.Alineaciones)
//12
val efectividad = relacion.sum/datos.length.toDouble
//13
val masAnios = (jugadores:List[Jugador]) => jugadores.minBy(_.AnioFundacion).Club
masAnios(datos)
//14//
val maxAnio = (jugadores:List[Jugador]) => jugadores.maxBy(_.AnioFundacion).Club
maxAnio(datos)
//15
val ciudad = (jugadores:List[Jugador]) => jugadores.map(_.Ciudad)
ciudad(datos)