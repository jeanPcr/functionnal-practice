def greetWithCustomGreeting(name:String,f: String=> String){
    f(name)
}

val f = (name: String) => {
    s"Hello, $name!"
}
greetWithCustomGreeting("Jean", f)