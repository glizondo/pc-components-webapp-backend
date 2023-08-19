package com.guillermo.pccomponents;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import com.guillermo.pccomponents.domain.Computer;

@Component
public class ExposeEntityIdRestMvcConfiguration implements RepositoryRestConfigurer {
	
	@Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Computer.class);
    }
}
