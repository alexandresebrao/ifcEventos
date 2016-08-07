package ifceventos

class WelcomeController {

    def index() {
        def eventList = Event.getAll()
        [eventList: eventList]
    }
}
