def greetGuests(guests: List[String],f:String => String){
      guests.foreach(guest=>println(f(guest)))
    }
    val f = (guest: String) => s"Hello, $guest!"

val numList = List("john","hello");
greetGuests(numList,f )
