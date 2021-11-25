package com.company.Police.facade.arrestSystem;

import java.util.logging.Logger;

public class criminalArrest {
    private static final Logger LOGGER = Logger.getLogger(criminalArrest.class.getName());

    public void arrest(){
        LOGGER.info("Criminal is arrested");
    }
}
