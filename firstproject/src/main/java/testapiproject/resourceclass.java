package testapiproject;


import com.codahale.metrics.annotation.Timed;
import static javax.ws.rs.core.MediaType.TEXT_HTML;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/person")
public class resourceclass {

    public resourceclass() {
    }

    @GET
    @Path("/check")
    @Produces( TEXT_HTML )
    public String getPerson() {
        String html = "<h2>Working Fine</h2><ul>";
        return html;
    }

//    @GET
//    @Timed
//    @Path("/remove")
//    @Produces(MediaType.TEXT_PLAIN)
//    public String removePerson() {
//        PersonDB.remove();
//        return "Last person remove. Total count: " + PersonDB.getCount();
//    }
//
//    @GET
//    @Timed
//    @Path("/all")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Person> getPersons() {
//        return PersonDB.getAll();
//    }
//
//    @POST
//    @Timed
//    @Path("/save")
//    @Produces(MediaType.TEXT_PLAIN)
//    @Consumes({MediaType.APPLICATION_JSON})
//    public String addPerson(Person person) {
//        return PersonDB.save(person);
//    }
}
