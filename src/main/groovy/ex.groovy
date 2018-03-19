
    class Ex {
        static void main(String[] args) {
            ['a', 'b', 'c'].eachWithIndex { it, i -> // `it` is the current element, while `i` is the index
                println "$i: $it"
            }

            //-------------------------------------------------
            println( [1, 2, 3].findAll { it > 1 })
            //----------------------------------------------------
            println(['a', 'b', 'c', 'd', 'e'].findIndexOf {      // find index of 1st element matching criteria
                it in ['c', 'e', 'g']
            })
            //----------------------------------------------------------
            println([1, 2, 3].every { it < 5 })

        }
    }

