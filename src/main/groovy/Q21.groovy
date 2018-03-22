class Q21 {
    static void main(String[] args) {
        Map m = ['Computing' : ['Computing' : 600, 'Information Systems' : 300], 'Engineering' : ['Civil' : 200, 'Mechanical' : 100], 'Management' : ['Management' : 800] ]

        println " university has ${m.keySet().size()} departments ${m.keySet()}"
        println " ${m.Computing.keySet().size()} programs are delivered by the Computing department which  are ${m.Computing.keySet()}"
        println " students  enrolled in the Civil Engineering program are ${m.Engineering.Civil}"

    }
}
