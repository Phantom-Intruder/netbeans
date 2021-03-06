/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.ws.qaf.rest;

import junit.framework.Test;

/**
 * Tests for New REST service client stub wizard
 *
 * @author lukas
 */
public class JEE6RestCStubsTest extends RestCStubsTest {

    protected static Server server = Server.GLASSFISH;

    public JEE6RestCStubsTest(String name) {
        super(name, server);
    }

    @Override
    protected JavaEEVersion getJavaEEversion() {
        return JavaEEVersion.JAVAEE6;
    }

    /**
     * Creates suite from particular test cases. You can define order of testcases here.
     */
    public static Test suite() {
        return createAllModulesServerSuite(Server.GLASSFISH, JEE6RestCStubsTest.class,
                "testWizard", //NOI18N
                "testCreateSimpleStubs", //NOI18N
                "testFromWADL", //NOI18N
                "testCloseProject"); //NOI18N
    }
}