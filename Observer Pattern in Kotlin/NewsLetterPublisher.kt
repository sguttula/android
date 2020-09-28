object NewsLetterPublisher: Subject {

    var list = mutableListOf<Observer>()
    var x:Int = 1
    fun setCount(par: Int) {
        x = par
    }
    fun setList(lis: ArrayList<Observer>) {

    }
    override fun registerObserver(newObserver: Observer) {
        //list.add(newObserver)
    }

    override fun removeObserver(removeObserver: Observer) {
       // var index:Int = list.indexOf(removeObserver)
        //list.removeAt(index)
    }

    override fun notifyObserver() {
        list.forEach{
            it.update(x.inc())
        }
    }

    fun getState(): Int {
    return x
    }

    fun setState(newCount: Int) {
    this.x = newCount.inc()
        notifyObserver()
    }
}