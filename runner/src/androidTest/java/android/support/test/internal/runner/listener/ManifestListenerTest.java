/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.support.test.internal.runner.listener;

import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Simple test to check that specifying a
 * <a href="http://junit.org/javadoc/latest/org/junit/runner/notification/RunListener.html">
 * <code>RunListener</code></a> via a meta-data tag in manifest works.
 */
@SmallTest
public class ManifestListenerTest {

    @Test
    public void testListenerInvoked() {
        assertTrue(ManifestListener.isRunStarted());
    }
}
