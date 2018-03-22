class Q12 {

    static void main(String[] args) {

        def list='a'..'z'
        def start=list.indexOf('j')
        def end = list.indexOf(list.to)
        start.upto(end,{
            print(list.get(it)+",")
        })

    }
}
