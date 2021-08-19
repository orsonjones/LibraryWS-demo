package net.afriskito.demo.libraryws;

import jakarta.ws.rs.core.Feature;
import jakarta.ws.rs.core.FeatureContext;
import jakarta.ws.rs.ext.Provider;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

@Provider
public class InjectionFeature implements Feature
{
    @Override
    public boolean configure(FeatureContext context) {
        context.register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(new BookService()).to(BookService.class);
            }
        });
        return true;
    }
}
