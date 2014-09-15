/* Copyright (c) 2001 - 2013 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.vfny.geoserver.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class SLDValidatorTest {

    @Test
    public void testValid() throws Exception {
        SLDValidator validator = new SLDValidator();
        List errors = validator.validateSLD(getClass().getResourceAsStream("valid.sld"));
        
        //showErrors(errors);
        assertTrue(errors.isEmpty());
    }
    
    @Test
    public void testInvalid() throws Exception {
        SLDValidator validator = new SLDValidator();
        List errors = validator.validateSLD(getClass().getResourceAsStream("invalid.sld"));
        
        //showErrors(errors);
        assertFalse(errors.isEmpty());
    }
    
    void showErrors(List errors) {
        for (Exception err : (List<Exception>)errors) {
            System.out.println(err.getMessage());
        }
    }
}