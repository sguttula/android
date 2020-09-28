interface Subject : Observer {
    override fun update(count: Int) {
    }

    fun registerObserver(newObserver: Observer)
    fun removeObserver(removeObserver: Observer)
    fun notifyObserver()
}