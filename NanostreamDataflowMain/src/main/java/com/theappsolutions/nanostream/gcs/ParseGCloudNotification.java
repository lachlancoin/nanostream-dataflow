package com.theappsolutions.nanostream.gcs;

import com.theappsolutions.nanostream.pubsub.GCloudNotification;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.values.KV;

/**
 *
 */
public class ParseGCloudNotification extends DoFn<GCloudNotification, KV<String, String>> {

    @ProcessElement
    public void processElement(ProcessContext c) {
        GCloudNotification gCloudNotification = c.element();
        c.output(KV.of(gCloudNotification.getBucket(), gCloudNotification.getName()));
    }
}
