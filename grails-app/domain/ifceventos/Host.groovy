package ifceventos

class Host {
    String fname
    String lname
    static hasMany = [events: Event]
    String email

    static constraints = {
    }
}
