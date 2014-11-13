/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class Vector3DTest {
    
    public Vector3DTest() {
    }
    
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
     * Test of length method, of class Vector3D.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vector3D instance = new Vector3D(1,2,3);
        double expResult = 3.74;
        double result = instance.length();
        assertEquals(expResult, result, 0.2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Vector3D.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D anotherVector = new Vector3D(1,2,3);
        Vector3D instance = new Vector3D(1,2,3);
        Vector3D expResult = new Vector3D(2,4,6);
        Vector3D result = instance.add(anotherVector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplyByScalar method, of class Vector3D.
     */
    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 2.0;
        Vector3D instance = new Vector3D(1,2,3);
        Vector3D expResult = new Vector3D(2,4,6);
        Vector3D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dotProduct method, of class Vector3D.
     */
    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3D anotherVector = new Vector3D(1,2,3);
        Vector3D instance = new Vector3D(1,2,3);
        double expResult = 14;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of crossProduct method, of class Vector3D.
     */
    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3D anotherVector = new Vector3D(2,3,4);
        Vector3D instance = new Vector3D(1,2,3);
       
        
        Vector3D expResult = new Vector3D(-1,2,-1);
        
        
        Vector3D result = instance.crossProduct(anotherVector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vector3D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D(1,1,1);
        String expResult = "[1.0, 1.0, 1.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Vector3D.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector3D(1,1,1);
        Vector3D instance = new Vector3D(1,1,1);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
