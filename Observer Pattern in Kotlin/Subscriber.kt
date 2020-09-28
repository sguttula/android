import NewsLetterPublisher.setState
import NewsLetterPublisher.list

class Subscriber constructor(name: String): Observer {

    override fun update(count: Int) {
        setState(count)
        printNewsletter(newsletter = count.toString())
    }

    fun subscribe(newSubscription: Subject) {
        list.add(newSubscription)
    }

    fun unsubscribe(removeSubscription: Subject) {
        var index:Int = list.indexOf(removeSubscription)
        list.removeAt(index)
    }
    fun printNewsletter(newsletter: String) {
        val news =  "${update(count = 1)}"
        print(news)
    }
}
