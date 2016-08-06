package ifceventos

class Student {

    String fname
    String lname
    static hasMany = [events: Event]
    String email

    static constraints = {
    }
}
