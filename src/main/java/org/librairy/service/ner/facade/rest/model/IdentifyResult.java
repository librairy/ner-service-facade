package org.librairy.service.ner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class IdentifyResult {

    private final List<Entity> entities;

    public IdentifyResult(List<Entity> entities) {
        this.entities = entities;
    }

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "Entities discovered by the service", required = true)
    public List<Entity> getEntities() {
        return entities;
    }
}
