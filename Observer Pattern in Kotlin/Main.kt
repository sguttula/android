    fun main(args: Array<String>) {

        val publisher = NewsLetterPublisher
        val mike = Subscriber("Mike")
        val kevin = Subscriber("Kevin")
        val esmerelda = Subscriber("Esmerelda")
        val hector = Subscriber("Hector")
        val letty = Subscriber("Letty")

        mike.subscribe(publisher)
        kevin.subscribe(publisher)
        esmerelda.subscribe(publisher)
        hector.subscribe(publisher)
        letty.subscribe(publisher)

        var count: Int = 0
        for (i in 1 until 21) {
            count++
            publisher.setCount(count)
            val newsletter = "Exciting news! We have raised ${publisher.x} million dollars!"
            if (publisher.x == 3) {
                mike.unsubscribe(publisher)
                esmerelda.unsubscribe(publisher)
            } else if (publisher.x == 10) {
                kevin.unsubscribe(publisher)
                hector.unsubscribe(publisher)
            }
            println(newsletter)
        }
    }


