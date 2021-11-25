package com.company.Police.facade.arrestSystem;

import java.util.logging.Logger;

public class criminalTransportation {
    private static final Logger LOGGER = Logger.getLogger(criminalTransportation.class.getName());

    public void transport(){
        LOGGER.info("The criminal was transported to our Police Department. Good job, operation is over.");
    }
}
