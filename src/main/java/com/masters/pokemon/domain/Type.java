package com.masters.pokemon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * <B> Type</B>
 * This class saves variables,setters and getters
 * for every pokemon type
 */
public class Type {

    private  Integer idType;

    private String TypeName;

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }
}
