package com.rsxtech.common.dto;

import java.io.Serializable;

/**
 * Data Transfer object, including Command, Query and Response,
 * <p>
 * Command and Query is CQRS concept.
 */
public abstract class DTO implements Serializable {
    public static final long serialVersionUID = 1L;
}
