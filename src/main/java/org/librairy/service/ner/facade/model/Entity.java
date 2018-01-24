/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.ner.facade.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Entity extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Entity\",\"namespace\":\"org.librairy.service.ner.facade.model\",\"fields\":[{\"name\":\"text\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"class\",\"type\":{\"type\":\"enum\",\"name\":\"Class\",\"symbols\":[\"ORGANIZATION\",\"LOCATION\",\"PERSON\",\"MISC\",\"MONEY\",\"PERCENT\",\"DATE\",\"TIME\",\"DISEASE\",\"PROTEIN\",\"DRUG\",\"COMPOUND\",\"GENE\"]}},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String text;
   private org.librairy.service.ner.facade.model.Class class$;
   private java.lang.String type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Entity() {}

  /**
   * All-args constructor.
   */
  public Entity(java.lang.String text, org.librairy.service.ner.facade.model.Class class$, java.lang.String type) {
    this.text = text;
    this.class$ = class$;
    this.type = type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return text;
    case 1: return class$;
    case 2: return type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: text = (java.lang.String)value$; break;
    case 1: class$ = (org.librairy.service.ner.facade.model.Class)value$; break;
    case 2: type = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'text' field.
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Sets the value of the 'text' field.
   * @param value the value to set.
   */
  public void setText(java.lang.String value) {
    this.text = value;
  }

  /**
   * Gets the value of the 'class$' field.
   */
  public org.librairy.service.ner.facade.model.Class getClass$() {
    return class$;
  }

  /**
   * Sets the value of the 'class$' field.
   * @param value the value to set.
   */
  public void setClass$(org.librairy.service.ner.facade.model.Class value) {
    this.class$ = value;
  }

  /**
   * Gets the value of the 'type' field.
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.String value) {
    this.type = value;
  }

  /** Creates a new Entity RecordBuilder */
  public static org.librairy.service.ner.facade.model.Entity.Builder newBuilder() {
    return new org.librairy.service.ner.facade.model.Entity.Builder();
  }
  
  /** Creates a new Entity RecordBuilder by copying an existing Builder */
  public static org.librairy.service.ner.facade.model.Entity.Builder newBuilder(org.librairy.service.ner.facade.model.Entity.Builder other) {
    return new org.librairy.service.ner.facade.model.Entity.Builder(other);
  }
  
  /** Creates a new Entity RecordBuilder by copying an existing Entity instance */
  public static org.librairy.service.ner.facade.model.Entity.Builder newBuilder(org.librairy.service.ner.facade.model.Entity other) {
    return new org.librairy.service.ner.facade.model.Entity.Builder(other);
  }
  
  /**
   * RecordBuilder for Entity instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Entity>
    implements org.apache.avro.data.RecordBuilder<Entity> {

    private java.lang.String text;
    private org.librairy.service.ner.facade.model.Class class$;
    private java.lang.String type;

    /** Creates a new Builder */
    private Builder() {
      super(org.librairy.service.ner.facade.model.Entity.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.librairy.service.ner.facade.model.Entity.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.text)) {
        this.text = data().deepCopy(fields()[0].schema(), other.text);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.class$)) {
        this.class$ = data().deepCopy(fields()[1].schema(), other.class$);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Entity instance */
    private Builder(org.librairy.service.ner.facade.model.Entity other) {
            super(org.librairy.service.ner.facade.model.Entity.SCHEMA$);
      if (isValidValue(fields()[0], other.text)) {
        this.text = data().deepCopy(fields()[0].schema(), other.text);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.class$)) {
        this.class$ = data().deepCopy(fields()[1].schema(), other.class$);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'text' field */
    public java.lang.String getText() {
      return text;
    }
    
    /** Sets the value of the 'text' field */
    public org.librairy.service.ner.facade.model.Entity.Builder setText(java.lang.String value) {
      validate(fields()[0], value);
      this.text = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'text' field has been set */
    public boolean hasText() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'text' field */
    public org.librairy.service.ner.facade.model.Entity.Builder clearText() {
      text = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'class$' field */
    public org.librairy.service.ner.facade.model.Class getClass$() {
      return class$;
    }
    
    /** Sets the value of the 'class$' field */
    public org.librairy.service.ner.facade.model.Entity.Builder setClass$(org.librairy.service.ner.facade.model.Class value) {
      validate(fields()[1], value);
      this.class$ = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'class$' field has been set */
    public boolean hasClass$() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'class$' field */
    public org.librairy.service.ner.facade.model.Entity.Builder clearClass$() {
      class$ = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public java.lang.String getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public org.librairy.service.ner.facade.model.Entity.Builder setType(java.lang.String value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'type' field */
    public org.librairy.service.ner.facade.model.Entity.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Entity build() {
      try {
        Entity record = new Entity();
        record.text = fieldSetFlags()[0] ? this.text : (java.lang.String) defaultValue(fields()[0]);
        record.class$ = fieldSetFlags()[1] ? this.class$ : (org.librairy.service.ner.facade.model.Class) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
