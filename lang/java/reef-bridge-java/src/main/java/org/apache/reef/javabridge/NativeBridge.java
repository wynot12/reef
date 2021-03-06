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
package org.apache.reef.javabridge;

import org.apache.reef.annotations.audience.Private;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Abstract bridge class.
 */
@Private
public abstract class NativeBridge implements AutoCloseable {

  private static final Logger LOG = Logger.getLogger(NativeBridge.class.getName());

  public void onError(final String errorMessage) {
    LOG.log(Level.SEVERE, "Bridge received error from CLR: " + errorMessage);
    throw new RuntimeException("Bridge received error from CLR: " + errorMessage);
  }
}
