package org.javastro.ivoa.eb;


/*
 * Created on 22/12/2025 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.ivoa.dm.executionbroker.OfferSetRequest;
import org.ivoa.dm.executionbroker.OfferSetResponse;
import org.ivoa.dm.executionbroker.ScheduledExecutionSession;
import org.ivoa.dm.executionbroker.SimpleExecutionSession;

@Tag(name="ExecutionBroker", description = "the standard Execution Broker endpoints")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Path("/eb/")
public class ExecutionBrokerResource {
    @PersistenceContext
    protected EntityManager em;  // exists for the application lifetime no need to close

    @POST
    @Path("offersets")
    @Operation(summary = "get a list of offers for the given request")
    public OfferSetResponse createOfferSet(OfferSetRequest request){
        //FIXME actually do something
        return new OfferSetResponse();
    }
    @GET
    @Path("offersets/{uuid}")
    @Operation(summary = "get a the offset by UUID that has already been made")
    public OfferSetResponse getOfferSet(@PathParam("uuid") String uuid) {
        //FIXME actually do something
        return new OfferSetResponse();
    }

    @POST
    @Path("sessions/{uuid}")
    @Operation(summary = "create a session")
    @Schema(oneOf = {SimpleExecutionSession.class, ScheduledExecutionSession.class})
    public SimpleExecutionSession createSession(@PathParam("uuid") String uuid){
        //FIXME actually do something
        return new SimpleExecutionSession();
    }

    @GET
    @Path("sessions/{uuid}")
    @Operation(summary = "get a the session by UUID that has already been created")
    @Schema(oneOf = {SimpleExecutionSession.class, ScheduledExecutionSession.class})
    public SimpleExecutionSession getSession(@PathParam("uuid") String uuid) {
        //FIXME actually do something
        return new SimpleExecutionSession();
    }


}
