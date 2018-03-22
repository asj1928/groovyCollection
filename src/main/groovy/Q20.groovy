class Q20 {
    static void main(String[] args) {
        Map m = ['1' : 2, '2' : 3, '3' : 4]
        def key='2'
        println(" map contains key ="+key+" : "+(key in m.keySet()))

    }
}
