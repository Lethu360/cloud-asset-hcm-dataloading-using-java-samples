/* Copyright � 2018, Oracle and/or its affiliates. All rights reserved.

The Universal Permissive License (UPL), Version 1.0
*/
package com.oracle.ateam.proxy.hcmloader;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 150302.2135.55683)

@WebServiceClient(wsdlLocation="https://xxx.yyy.com/hcmCommonDataLoader/HCMDataLoader?wsdl",
  targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/",
  name="HCMDataLoader")
public class HCMDataLoader_Service
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("com.oracle.ateam.proxy.hcmloader.HCMDataLoader_Service");
      URL baseUrl = HCMDataLoader_Service.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            HCMDataLoader_Service.class.getResource("https://xxx.yyy.com/hcmCommonDataLoader/HCMDataLoader?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "https://xxx.yyy.com/hcmCommonDataLoader/HCMDataLoader?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "https://xxx.yyy.com/hcmCommonDataLoader/HCMDataLoader?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using https://xxx.yyy.com/hcmCommonDataLoader/HCMDataLoader?wsdl",
          e);
    }
  }

  public HCMDataLoader_Service()
  {
    super(wsdlLocationURL,
          new QName("http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/",
                    "HCMDataLoader"));
  }

  public HCMDataLoader_Service(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="HCMDataLoaderSoapHttpPort")
  public com.oracle.ateam.proxy.hcmloader.HCMDataLoader getHCMDataLoaderSoapHttpPort()
  {
    return (com.oracle.ateam.proxy.hcmloader.HCMDataLoader) super.getPort(new QName("http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/",
                                                                                    "HCMDataLoaderSoapHttpPort"),
                                                                          com.oracle.ateam.proxy.hcmloader.HCMDataLoader.class);
  }

  @WebEndpoint(name="HCMDataLoaderSoapHttpPort")
  public com.oracle.ateam.proxy.hcmloader.HCMDataLoader getHCMDataLoaderSoapHttpPort(WebServiceFeature... features)
  {
    return (com.oracle.ateam.proxy.hcmloader.HCMDataLoader) super.getPort(new QName("http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/",
                                                                                    "HCMDataLoaderSoapHttpPort"),
                                                                          com.oracle.ateam.proxy.hcmloader.HCMDataLoader.class,
                                                                          features);
  }
}
