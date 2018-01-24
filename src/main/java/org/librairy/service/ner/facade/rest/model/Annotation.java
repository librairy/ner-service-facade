package org.librairy.service.ner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.librairy.service.ner.facade.model.Class;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Annotation extends org.librairy.service.ner.facade.model.Annotation {

    public Annotation(org.librairy.service.ner.facade.model.Annotation annotation){
        try {
            BeanUtils.copyProperties(this,annotation);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "Unique identifier")
    public String getId() {
        return super.getId();
    }

    @Override
    @ApiModelProperty(value = "Word/s extracted")
    public String getText() {
        return super.getText();
    }

    @Override
    @ApiModelProperty(value = "Starting position")
    public String getStart() {
        return super.getStart();
    }

    @Override
    @ApiModelProperty(value = "End position")
    public String getEnd() {
        return super.getEnd();
    }

    @Override
    @ApiModelProperty(value = "General Class model")
    public Class getClass$() {
        return super.getClass$();
    }

    @Override
    @ApiModelProperty(value = "More detailed entity class")
    public String getType() {
        return super.getType();
    }

    @Override
    @ApiModelProperty(value = "External info related to the entity")
    public List<String> getReferences() {
        return super.getReferences();
    }
}
