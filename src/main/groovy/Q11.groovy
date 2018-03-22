class Q11 {
    static void main(String[] args) {
        Closure table={
            n->11.times {if (it==0){}else println(it*n)}
        }
        table(7)

    }
}
