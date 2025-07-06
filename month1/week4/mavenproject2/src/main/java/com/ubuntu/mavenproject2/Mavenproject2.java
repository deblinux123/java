/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubuntu.mavenproject2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author toor
 */
public class Mavenproject2 {


    private static final Logger logger = LoggerFactory.getLogger(Mavenproject2.class);
    public static void main(String[] args)
    {
        logger.info("Starting...");
        
        int x = 10;
        int y = 0;
        
        try
        {
            int result = x / y;
        } catch (ArithmeticException e)
        {
            logger.error("Zero division error, " + e);
        }
        
        logger.debug("Ending.");
    }

}
