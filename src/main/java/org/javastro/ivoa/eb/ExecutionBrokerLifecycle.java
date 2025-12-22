package org.javastro.ivoa.eb;


import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import io.quarkus.logging.Log;

/*
 * Created on 22/12/2025 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@ApplicationScoped
public class ExecutionBrokerLifecycle {
   @PersistenceContext
   protected EntityManager em;  // exists for the application lifetime no need to close

   void onStart(@Observes StartupEvent ev) {
      Log.info("The ExecutionBroker is starting...");
   }

   void onStop(@Observes ShutdownEvent ev) {
      Log.info("The ExecutionBroker is closing down...");
   }
}
