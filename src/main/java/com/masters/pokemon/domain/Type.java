package com.masters.pokemon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * This class saves variables,setters and getters
 * for every pokemon type
 */
public class Type {

    private  Integer IdType;

    private String TypeName;

    public Integer getIdType() {
        return IdType;
    }

    public void setIdType(Integer idType) {
        IdType = idType;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }
}
