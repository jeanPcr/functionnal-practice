
  // Paste `greetWithCustomGreeting` from Exercise 5 here ===>
  def greetWithCustomGreeting(name:String,f: String=> String){
    f(name)
  }
  val f = (guest: String) => s"Hello, $guest!"
  // <=== Paste `greetWithCustomGreeting` from Exercise 5 here


  // Put your `readLinesFromPath` method (and eventual imports for it) here ===>
  def readLinesFromPath(filepath: String):List[String]{
    
  }
  // <=== Put your `readLinesFromPath` method here


  // Put your `greetGuestsAlternating` method here ===>
  def greetGuestsAlternating(guests: List[String], greetingFun1: String=>String,greetingFun2: String=>String){
    var indexOfGuestToGreet = 0;
    while(indexOfGuestToGreet < guests){
      if(indexOfGuestToGreet%1 ==0){
        greetingFun1(guests[indexOfGuestToGreet])
      }else{
        greetingFun2(guests[indexOfGuestToGreet])
      }
      indexOfGuestToGreet += 1;
    }
  }

  
  // <=== Put your `greetGuestsAlternating` method here


  // Put your `greetGuestsAlternatingFromPath` method here ===>
  def greetGuestsAlternatingFromPath(filepath: String,greetingFun1: String=>String,greetingFun2: String=>String){
    
  }
