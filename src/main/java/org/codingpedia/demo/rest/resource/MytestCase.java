package org.codingpedia.demo.rest.resource;

import org.codingpedia.demo.rest.errorhandling.AppException;
import org.codingpedia.demo.rest.pojo.boardXMLPOJO;
import org.codingpedia.demo.rest.pojo.testBoardPOJO;
import org.codingpedia.demo.rest.service.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

/**
 * Created by mason on 2017/6/1.
 */
@Component
@Path("/vessels")
public class MytestCase {

    @Autowired
    private PodcastService podcastService;
//http://localhost:8080/v.1.0/api/vessels/MASK/tab1/tab2/tab3/
    @GET
    @Path("/MASK/{param1}/{param2}/{param3}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<testBoardPOJO> gettests(@PathParam("param1") String param1,@PathParam("param2") String param2,@PathParam("param3") String param3)
            throws IOException, AppException {
        List<testBoardPOJO> podcasts = podcastService.getPodcasts123(
                param1, param2,param3);
        return podcasts;
    }
}
