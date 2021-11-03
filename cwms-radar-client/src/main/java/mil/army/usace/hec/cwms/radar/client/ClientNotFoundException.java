/*
 * Copyright (c) 2021
 * United States Army Corps of Engineers - Hydrologic Engineering Center (USACE/HEC)
 * All Rights Reserved.  USACE PROPRIETARY/CONFIDENTIAL.
 * Source may not be released without written approval from HEC
 */

package mil.army.usace.hec.cwms.radar.client;

import java.io.IOException;

public class ClientNotFoundException extends IOException {

    public ClientNotFoundException(String message) {
        super(message);
    }

    public ClientNotFoundException(Throwable throwable) {
        super(throwable);
    }

    public ClientNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
