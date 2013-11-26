/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id: PCLEventProducer.java 985537 2010-08-14 17:17:00Z jeremias $ */

package org.apache.fop.render.pcl;

import org.apache.fop.events.EventBroadcaster;
import org.apache.fop.events.EventProducer;

/**
 * Event producer interface for events generated by the PCL renderer.
 */
public interface PCLEventProducer extends EventProducer {

    /** Provider class for the event producer. */
    final class Provider {

        private Provider() {
        }

        /**
         * Returns an event producer.
         * @param broadcaster the event broadcaster to use
         * @return the event producer
         */
        public static PCLEventProducer get(EventBroadcaster broadcaster) {
            return (PCLEventProducer)broadcaster.getEventProducerFor(
                    PCLEventProducer.class);
        }
    }

    /**
     * Paper type could not be determined. Falling back to another.
     * @param source the event source
     * @param pageWidth the page width (in millipoints)
     * @param pageHeight the page height (in millipoints)
     * @param fallbackPaper the paper type that will be used instead
     * @event.severity WARN
     */
    void paperTypeUnavailable(Object source, long pageWidth, long pageHeight, String fallbackPaper);

}