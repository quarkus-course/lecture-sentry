package tech.donau;

import org.jboss.logmanager.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloResource {
    public static Logger LOGGER = Logger.getLogger(HelloResource.class.getSimpleName());

    @GET
    public String hello() {
        LOGGER.info("Executing hello method");
        LOGGER.warning("Exeuting hello with warning");
        return "hello";

    }
}
