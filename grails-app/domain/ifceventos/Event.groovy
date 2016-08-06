package ifceventos

class Event {

    String Name
    Date startdate
    Date enddate
    static hasOne = [host:Host]

    static constraints = {
        host unique:true
    }
}
