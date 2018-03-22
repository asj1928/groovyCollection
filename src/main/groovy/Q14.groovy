class Q14 {
    static void main(String[] args) {
        1.upto(100,{
           if (it%3==0&&it%5==0){
               println("fizzbuzz")
           }else if(it%3==0){
               println("fizz")
           }else if (it%5==0){
               println("buzz")
           }else {
               println(it)
           }
        })

    }
}
