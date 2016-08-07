package ifceventos

class Event {

    String Name
    Date startdate
    Date enddate
    static hasOne = [host:Host]
    static hasMany = [students: Student]

    static constraints = {
        host unique:true
    }
}
