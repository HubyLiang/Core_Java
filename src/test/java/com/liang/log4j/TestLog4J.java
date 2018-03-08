package com.liang.log4j;

import org.apache.log4j.Logger;

public class TestLog4J {

    private static Logger logger  =Logger.getLogger(TestLog4J.class);

    public static void main(String[] args) {
        logger.debug("----------debug---------");
        logger.info("----------info---------");
        logger.warn("----------warn---------");
        logger.error("----------error---------");
    }

}
