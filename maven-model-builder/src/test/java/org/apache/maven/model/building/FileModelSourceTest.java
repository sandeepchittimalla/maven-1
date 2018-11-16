package org.apache.maven.model.building;

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

import java.io.File;
import junit.framework.TestCase;

/**
 *
 * @author fabiano
 */
public class FileModelSourceTest 
    extends TestCase 
{
    
    public FileModelSourceTest() {
    }

    /**
     * Test of equals method, of class FileModelSource.
     */
    public void testEquals() 
            throws Exception 
    {
        File tempFile = File.createTempFile("pomTest-", ".xml");
        tempFile.deleteOnExit();
        FileModelSource instance = new FileModelSource( tempFile );

        assertFalse( instance.equals( null ) );
        assertFalse( instance.equals( new Object() ) );
        assertTrue( instance.equals( instance ) );
        assertTrue( instance.equals( new FileModelSource( tempFile ) ) );
    }

}
