package org.librairy.service.ner.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;
import org.librairy.service.ner.facade.model.Class;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class IdentifyRequest {

    @ApiModelProperty(notes="Unstructured text")
    private String text;

    @ApiModelProperty(notes="List of entity classes to be considered. All when empty")
    private List<Class> filter;

    public IdentifyRequest(String text, List<Class> filter) {
        this.text = text;
        this.filter = filter;
    }

    public IdentifyRequest(){};

    public String getText() {
        return text;
    }

    public List<Class> getFilter() {
        return filter;
    }
}
