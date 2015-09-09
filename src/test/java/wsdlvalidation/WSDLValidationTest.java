/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package wsdlvalidation;

import com.eviware.soapui.impl.WsdlInterfaceFactory;
import com.eviware.soapui.impl.wsdl.WsdlInterface;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlProjectFactory;
import com.eviware.soapui.impl.wsdl.mock.WsdlMockService;
import com.eviware.soapui.support.SoapUIException;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.xmlbeans.XmlException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test; 

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 *
 */
public class WSDLValidationTest {
    private static WsdlProjectFactory wsdlProjectFactory;
    private static WsdlInterfaceFactory wsdlInterfaceFactory;
    
    @BeforeClass
    public static void createFactories(){
        wsdlProjectFactory = new WsdlProjectFactory();
        wsdlInterfaceFactory = new WsdlInterfaceFactory();
    }


    @Before
    public void deleteCreatedFiles() {
        new File("global-groovy.log").delete();
        new File("soapui-errors.log").delete();
        new File("soapui.log").delete();
        new File("test.xml").delete();
    }
 
    private WsdlProject project;

    @Before
    public void createProject() throws XmlException, IOException, SoapUIException {
        project = wsdlProjectFactory.createNew();
    }

    @Test
    public void testWSDLInterfaceImporting() throws SoapUIException {
        int interfaceCount = project.getInterfaceCount();
        assertThat("newly created project has no interfaces", interfaceCount, is(equalTo(0)));

        WsdlInterface[] importWsdl = wsdlInterfaceFactory.importWsdl(project, "http://192.168.9.100:8080/axis2/services/GuestManagementService?wsdl", false);

        interfaceCount = project.getInterfaceCount();
        System.out.println("interfaceCount: "+interfaceCount);
        assertThat("newly created project has 1 interface", interfaceCount, is(equalTo(2)));
    }

    @Test @Ignore
    public void testMockCreation() throws XmlException, IOException, SoapUIException {
        int mockCount = project.getMockServiceCount();
        assertThat("newly created project has no mocks", mockCount, is(equalTo(0)));
        
        
        WsdlInterface[] importWsdl = wsdlInterfaceFactory.importWsdl(project, "http://192.168.9.100:8080/axis2/services/GuestManagementService?wsdl", false);

        WsdlMockService service = project.addNewMockService("newMockService");
        service.addNewMockOperation(importWsdl[0].getOperationAt(0));

        project.saveAs("test.xml");

        mockCount = project.getMockServiceCount();
        assertThat("project has exactly one mock", mockCount, is(1));
    }
}
