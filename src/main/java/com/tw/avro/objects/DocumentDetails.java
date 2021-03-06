/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.tw.avro.objects;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DocumentDetails extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1589350977642353084L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DocumentDetails\",\"namespace\":\"com.tw.avro.objects\",\"fields\":[{\"name\":\"document_id\",\"type\":\"string\"},{\"name\":\"document_type\",\"type\":\"string\"},{\"name\":\"issuer_country\",\"type\":\"string\"},{\"name\":\"issue_date\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"expiry_date\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"first_name\",\"type\":\"string\"},{\"name\":\"last_name\",\"type\":\"string\"},{\"name\":\"nationality\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence document_id;
  @Deprecated public java.lang.CharSequence document_type;
  @Deprecated public java.lang.CharSequence issuer_country;
  @Deprecated public int issue_date;
  @Deprecated public int expiry_date;
  @Deprecated public java.lang.CharSequence first_name;
  @Deprecated public java.lang.CharSequence last_name;
  @Deprecated public java.lang.CharSequence nationality;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public DocumentDetails() {}

  /**
   * All-args constructor.
   */
  public DocumentDetails(java.lang.CharSequence document_id, java.lang.CharSequence document_type, java.lang.CharSequence issuer_country, java.lang.Integer issue_date, java.lang.Integer expiry_date, java.lang.CharSequence first_name, java.lang.CharSequence last_name, java.lang.CharSequence nationality) {
    this.document_id = document_id;
    this.document_type = document_type;
    this.issuer_country = issuer_country;
    this.issue_date = issue_date;
    this.expiry_date = expiry_date;
    this.first_name = first_name;
    this.last_name = last_name;
    this.nationality = nationality;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return document_id;
    case 1: return document_type;
    case 2: return issuer_country;
    case 3: return issue_date;
    case 4: return expiry_date;
    case 5: return first_name;
    case 6: return last_name;
    case 7: return nationality;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: document_id = (java.lang.CharSequence)value$; break;
    case 1: document_type = (java.lang.CharSequence)value$; break;
    case 2: issuer_country = (java.lang.CharSequence)value$; break;
    case 3: issue_date = (java.lang.Integer)value$; break;
    case 4: expiry_date = (java.lang.Integer)value$; break;
    case 5: first_name = (java.lang.CharSequence)value$; break;
    case 6: last_name = (java.lang.CharSequence)value$; break;
    case 7: nationality = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'document_id' field.
   */
  public java.lang.CharSequence getDocumentId() {
    return document_id;
  }

  /**
   * Sets the value of the 'document_id' field.
   * @param value the value to set.
   */
  public void setDocumentId(java.lang.CharSequence value) {
    this.document_id = value;
  }

  /**
   * Gets the value of the 'document_type' field.
   */
  public java.lang.CharSequence getDocumentType() {
    return document_type;
  }

  /**
   * Sets the value of the 'document_type' field.
   * @param value the value to set.
   */
  public void setDocumentType(java.lang.CharSequence value) {
    this.document_type = value;
  }

  /**
   * Gets the value of the 'issuer_country' field.
   */
  public java.lang.CharSequence getIssuerCountry() {
    return issuer_country;
  }

  /**
   * Sets the value of the 'issuer_country' field.
   * @param value the value to set.
   */
  public void setIssuerCountry(java.lang.CharSequence value) {
    this.issuer_country = value;
  }

  /**
   * Gets the value of the 'issue_date' field.
   */
  public java.lang.Integer getIssueDate() {
    return issue_date;
  }

  /**
   * Sets the value of the 'issue_date' field.
   * @param value the value to set.
   */
  public void setIssueDate(java.lang.Integer value) {
    this.issue_date = value;
  }

  /**
   * Gets the value of the 'expiry_date' field.
   */
  public java.lang.Integer getExpiryDate() {
    return expiry_date;
  }

  /**
   * Sets the value of the 'expiry_date' field.
   * @param value the value to set.
   */
  public void setExpiryDate(java.lang.Integer value) {
    this.expiry_date = value;
  }

  /**
   * Gets the value of the 'first_name' field.
   */
  public java.lang.CharSequence getFirstName() {
    return first_name;
  }

  /**
   * Sets the value of the 'first_name' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.first_name = value;
  }

  /**
   * Gets the value of the 'last_name' field.
   */
  public java.lang.CharSequence getLastName() {
    return last_name;
  }

  /**
   * Sets the value of the 'last_name' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.last_name = value;
  }

  /**
   * Gets the value of the 'nationality' field.
   */
  public java.lang.CharSequence getNationality() {
    return nationality;
  }

  /**
   * Sets the value of the 'nationality' field.
   * @param value the value to set.
   */
  public void setNationality(java.lang.CharSequence value) {
    this.nationality = value;
  }

  /**
   * Creates a new DocumentDetails RecordBuilder.
   * @return A new DocumentDetails RecordBuilder
   */
  public static com.tw.avro.objects.DocumentDetails.Builder newBuilder() {
    return new com.tw.avro.objects.DocumentDetails.Builder();
  }
  
  /**
   * Creates a new DocumentDetails RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DocumentDetails RecordBuilder
   */
  public static com.tw.avro.objects.DocumentDetails.Builder newBuilder(com.tw.avro.objects.DocumentDetails.Builder other) {
    return new com.tw.avro.objects.DocumentDetails.Builder(other);
  }
  
  /**
   * Creates a new DocumentDetails RecordBuilder by copying an existing DocumentDetails instance.
   * @param other The existing instance to copy.
   * @return A new DocumentDetails RecordBuilder
   */
  public static com.tw.avro.objects.DocumentDetails.Builder newBuilder(com.tw.avro.objects.DocumentDetails other) {
    return new com.tw.avro.objects.DocumentDetails.Builder(other);
  }
  
  /**
   * RecordBuilder for DocumentDetails instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DocumentDetails>
    implements org.apache.avro.data.RecordBuilder<DocumentDetails> {

    private java.lang.CharSequence document_id;
    private java.lang.CharSequence document_type;
    private java.lang.CharSequence issuer_country;
    private int issue_date;
    private int expiry_date;
    private java.lang.CharSequence first_name;
    private java.lang.CharSequence last_name;
    private java.lang.CharSequence nationality;

    /** Creates a new Builder */
    private Builder() {
      super(com.tw.avro.objects.DocumentDetails.SCHEMA$);
    }
    
    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.tw.avro.objects.DocumentDetails.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.document_id)) {
        this.document_id = data().deepCopy(fields()[0].schema(), other.document_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.document_type)) {
        this.document_type = data().deepCopy(fields()[1].schema(), other.document_type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.issuer_country)) {
        this.issuer_country = data().deepCopy(fields()[2].schema(), other.issuer_country);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.issue_date)) {
        this.issue_date = data().deepCopy(fields()[3].schema(), other.issue_date);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.expiry_date)) {
        this.expiry_date = data().deepCopy(fields()[4].schema(), other.expiry_date);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.first_name)) {
        this.first_name = data().deepCopy(fields()[5].schema(), other.first_name);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.last_name)) {
        this.last_name = data().deepCopy(fields()[6].schema(), other.last_name);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.nationality)) {
        this.nationality = data().deepCopy(fields()[7].schema(), other.nationality);
        fieldSetFlags()[7] = true;
      }
    }
    
    /**
     * Creates a Builder by copying an existing DocumentDetails instance
     * @param other The existing instance to copy.
     */
    private Builder(com.tw.avro.objects.DocumentDetails other) {
            super(com.tw.avro.objects.DocumentDetails.SCHEMA$);
      if (isValidValue(fields()[0], other.document_id)) {
        this.document_id = data().deepCopy(fields()[0].schema(), other.document_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.document_type)) {
        this.document_type = data().deepCopy(fields()[1].schema(), other.document_type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.issuer_country)) {
        this.issuer_country = data().deepCopy(fields()[2].schema(), other.issuer_country);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.issue_date)) {
        this.issue_date = data().deepCopy(fields()[3].schema(), other.issue_date);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.expiry_date)) {
        this.expiry_date = data().deepCopy(fields()[4].schema(), other.expiry_date);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.first_name)) {
        this.first_name = data().deepCopy(fields()[5].schema(), other.first_name);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.last_name)) {
        this.last_name = data().deepCopy(fields()[6].schema(), other.last_name);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.nationality)) {
        this.nationality = data().deepCopy(fields()[7].schema(), other.nationality);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'document_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getDocumentId() {
      return document_id;
    }

    /**
      * Sets the value of the 'document_id' field.
      * @param value The value of 'document_id'.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder setDocumentId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.document_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'document_id' field has been set.
      * @return True if the 'document_id' field has been set, false otherwise.
      */
    public boolean hasDocumentId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'document_id' field.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder clearDocumentId() {
      document_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'document_type' field.
      * @return The value.
      */
    public java.lang.CharSequence getDocumentType() {
      return document_type;
    }

    /**
      * Sets the value of the 'document_type' field.
      * @param value The value of 'document_type'.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder setDocumentType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.document_type = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'document_type' field has been set.
      * @return True if the 'document_type' field has been set, false otherwise.
      */
    public boolean hasDocumentType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'document_type' field.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder clearDocumentType() {
      document_type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'issuer_country' field.
      * @return The value.
      */
    public java.lang.CharSequence getIssuerCountry() {
      return issuer_country;
    }

    /**
      * Sets the value of the 'issuer_country' field.
      * @param value The value of 'issuer_country'.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder setIssuerCountry(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.issuer_country = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'issuer_country' field has been set.
      * @return True if the 'issuer_country' field has been set, false otherwise.
      */
    public boolean hasIssuerCountry() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'issuer_country' field.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder clearIssuerCountry() {
      issuer_country = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'issue_date' field.
      * @return The value.
      */
    public java.lang.Integer getIssueDate() {
      return issue_date;
    }

    /**
      * Sets the value of the 'issue_date' field.
      * @param value The value of 'issue_date'.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder setIssueDate(int value) {
      validate(fields()[3], value);
      this.issue_date = value;
      fieldSetFlags()[3] = true;
      return this; 
    }

    /**
      * Checks whether the 'issue_date' field has been set.
      * @return True if the 'issue_date' field has been set, false otherwise.
      */
    public boolean hasIssueDate() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'issue_date' field.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder clearIssueDate() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'expiry_date' field.
      * @return The value.
      */
    public java.lang.Integer getExpiryDate() {
      return expiry_date;
    }

    /**
      * Sets the value of the 'expiry_date' field.
      * @param value The value of 'expiry_date'.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder setExpiryDate(int value) {
      validate(fields()[4], value);
      this.expiry_date = value;
      fieldSetFlags()[4] = true;
      return this; 
    }

    /**
      * Checks whether the 'expiry_date' field has been set.
      * @return True if the 'expiry_date' field has been set, false otherwise.
      */
    public boolean hasExpiryDate() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'expiry_date' field.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder clearExpiryDate() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'first_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return first_name;
    }

    /**
      * Sets the value of the 'first_name' field.
      * @param value The value of 'first_name'.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.first_name = value;
      fieldSetFlags()[5] = true;
      return this; 
    }

    /**
      * Checks whether the 'first_name' field has been set.
      * @return True if the 'first_name' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'first_name' field.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder clearFirstName() {
      first_name = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'last_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return last_name;
    }

    /**
      * Sets the value of the 'last_name' field.
      * @param value The value of 'last_name'.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.last_name = value;
      fieldSetFlags()[6] = true;
      return this; 
    }

    /**
      * Checks whether the 'last_name' field has been set.
      * @return True if the 'last_name' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'last_name' field.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder clearLastName() {
      last_name = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'nationality' field.
      * @return The value.
      */
    public java.lang.CharSequence getNationality() {
      return nationality;
    }

    /**
      * Sets the value of the 'nationality' field.
      * @param value The value of 'nationality'.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder setNationality(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.nationality = value;
      fieldSetFlags()[7] = true;
      return this; 
    }

    /**
      * Checks whether the 'nationality' field has been set.
      * @return True if the 'nationality' field has been set, false otherwise.
      */
    public boolean hasNationality() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'nationality' field.
      * @return This builder.
      */
    public com.tw.avro.objects.DocumentDetails.Builder clearNationality() {
      nationality = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public DocumentDetails build() {
      try {
        DocumentDetails record = new DocumentDetails();
        record.document_id = fieldSetFlags()[0] ? this.document_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.document_type = fieldSetFlags()[1] ? this.document_type : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.issuer_country = fieldSetFlags()[2] ? this.issuer_country : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.issue_date = fieldSetFlags()[3] ? this.issue_date : (java.lang.Integer) defaultValue(fields()[3]);
        record.expiry_date = fieldSetFlags()[4] ? this.expiry_date : (java.lang.Integer) defaultValue(fields()[4]);
        record.first_name = fieldSetFlags()[5] ? this.first_name : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.last_name = fieldSetFlags()[6] ? this.last_name : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.nationality = fieldSetFlags()[7] ? this.nationality : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);  

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, org.apache.avro.specific.SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);  

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, org.apache.avro.specific.SpecificData.getDecoder(in));
  }

}
