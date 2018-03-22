class Q17 {
    static void main(String[] args) {

        Map m1=[name:"ajay" ,id:2817]
        Map m2=[*:m1,competency:"jvm"]
        m2.each {
            println(it)
        }
    }
}
