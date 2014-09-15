/* Copyright (c) 2001 - 2013 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.catalog;

/**
 * A metadata link.
 * 
 * @author Justin Deoliveira, The Open Planning Project
 * 
 */
public interface MetadataLinkInfo extends Info {

    /**
     * Identifier.
     */
    String getId();

    /**
     * @uml.property name="about"
     */
    String getAbout();

    /**
     * @uml.property name="about"
     */
    void setAbout(String about);

    /**
     * @uml.property name="metadataType"
     */
    String getMetadataType();

    /**
     * @uml.property name="metadataType"
     */
    void setMetadataType(String metadataType);

    /**
     * @uml.property name="type"
     */
    String getType();

    /**
     * @uml.property name="type"
     */
    void setType(String type);

    /**
     * @uml.property name="content"
     */
    String getContent();

    /**
     * @uml.property name="content"
     */
    void setContent(String content);
}