package org.librairy.service.ner.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.librairy.service.ner.facade.model.Class;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Entity extends org.librairy.service.ner.facade.model.Entity {

    public Entity(org.librairy.service.ner.facade.model.Entity entity){
        try {
            BeanUtils.copyProperties(this,entity);
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
    @ApiModelProperty(value = "Word/s extracted")
    public String getText() {
        return super.getText();
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

}
