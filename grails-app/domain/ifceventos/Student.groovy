package ifceventos

class Student {

    String fname
    String lname
    String email

    static constraints = {
        email email: true, blank: false
    }
}
