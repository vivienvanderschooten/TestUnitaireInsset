/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombrePremier;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;

/**
 *
 * @author user
 */
@RunWith(JUnitParamsRunner.class)
public class NombrePremierParameterTest {

    public NombrePremierParameterTest() {
    }

    private Object[] parametersForTestIsPremier() {
        return new Object[][]{
            {1, false},
            {11, true},
            {10, false}
        };
    }

    /**
     * Test de la methode isPremier aec un nombre premier
     */
    @org.junit.Test
    @Parameters
    public void testIsPremier(int n, boolean expResult) {
        //given
        NombrePremier instance = new NombrePremier();

        //when
        boolean result = instance.isPremier(n);

        //then
        assertEquals(expResult, result);

    }
}
