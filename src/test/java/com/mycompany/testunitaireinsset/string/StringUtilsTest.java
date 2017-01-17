/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;

/**
 *
 * @author user
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
    }
 
        /**
     * Test de la methode isPremier aec un nombre premier
     */
    @org.junit.Test
    public void testIsChaineValideOk() {
        //given
        String str = "coucou";
        StringUtils instance = new StringUtils();
        String expResult = "Ok";

        //when
        boolean result = instance.isChaineValide(str);

        //then
        Assert.assertTrue(expResult, result);

    }
    
           /**
     * Test de la methode isPremier aec un nombre premier
     */
    /**@org.junit.Test
    public void TestMessageExeptionIsChaineValide() {
        //given
        String str = "";
        StringUtils instance = new StringUtils();

        //when
        try{
            instance.isChaineValide(str);
        }catch{
            
        }
        boolean result = instance.isChaineValide(str);

    }**/
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testIsNotChaineValide() {
        String str = "c";
        StringUtils instance = new StringUtils();
        String expResult = "Nok";

        //when
        boolean result = instance.isChaineValide(str);

        //then
        
                
    }
    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValide() {
        String str = "coucou";
        StringUtils instance = new StringUtils();
        String expResult = "Ok";

        //when
        boolean result = instance.isChaineValide(str);

        //then
        Assert.assertTrue(expResult, result);
                
    }

    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverse() {
        String str = "coucou";
        StringUtils instance = new StringUtils();
        boolean expResult = true;

        //when
        String result = instance.inverse(str);

        //then
        Assert.assertTrue(result, expResult);
    }

    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindrome() {
        String str = "noyon";
        StringUtils instance = new StringUtils();
        String expResult = "Ok";

        //when
        boolean result = instance.isPalindrome(str);

        //then
        Assert.assertTrue(expResult, result);
    }

    
    /**
     * Test of isNotPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsNotPalindrome() {
        String str = "chien";
        StringUtils instance = new StringUtils();
        String expResult = "Nok";

        //when
        boolean result = instance.isPalindrome(str);

        //then
        Assert.assertFalse(expResult, result);
    }
    
    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurences() {
        System.out.println("compterOccurences");
        String str = "Toto";
        StringUtils instance = new StringUtils();
        Map<String, Integer> expResult = null;
        Map<String, Integer> result = instance.compterOccurences(str);
    }
    
}
