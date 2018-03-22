import javax.swing.ListSelectionModel

class Q5 {
    static void main(String[] args) {


        List l =[1,2,3,3,5,4,5,6,7,8,9,10]

        Closure remove={List l1->
            List p=[]
            l1.size().times {
                if (it%2==0){
                    p<<l1.get(it)
                }else {
                    p<<null
                }
            }
            p=p-[null]
        }

        println(l)
        l=remove(l)
        println(l)
    }
}
