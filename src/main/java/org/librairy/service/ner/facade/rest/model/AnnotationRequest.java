package org.librairy.service.ner.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;
import org.librairy.service.ner.facade.model.Class;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class AnnotationRequest {

    @ApiModelProperty(notes="Unstructured text")
    private String text;

    @ApiModelProperty(notes="List of entity classes to be considered. All when empty")
    private List<Class> filter;

    public AnnotationRequest(String text, List<Class> filter) {
        this.text = text;
        this.filter = filter;
    }

    public AnnotationRequest(){};

    public String getText() {
        return text;
    }

    public List<Class> getFilter() {
        return filter;
    }
}
