package ifceventos

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/events" {
            controller = "Event"

        }

        "/" {
            controller = "Welcome"
            action = "index"
        }


        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
