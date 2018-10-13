
package org.ceertificatic;

import javax.jws.WebService;

@WebService(endpointInterface = "org.ceertificatic.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello welcome" + text;
    }
}

