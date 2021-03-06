package com.theappsolutions.nanostream.probecalculation;

// TODO: there is no such class in the repository
//import com.theappsolutions.nanostream.debugging.AddValueDoFn;
import org.apache.beam.sdk.io.gcp.pubsub.PubsubMessage;
import org.apache.beam.sdk.testing.PAssert;
import org.apache.beam.sdk.testing.TestPipeline;
import org.apache.beam.sdk.transforms.*;
import org.apache.beam.sdk.transforms.windowing.AfterProcessingTime;
import org.apache.beam.sdk.transforms.windowing.GlobalWindows;
import org.apache.beam.sdk.transforms.windowing.Repeatedly;
import org.apache.beam.sdk.transforms.windowing.Window;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.PCollection;
import org.joda.time.Duration;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Tests filtering of {@link PubsubMessage}
 */
public class KVCalculationAccumulatorTest {


    @Rule
    public final transient TestPipeline testPipeline = TestPipeline.create().enableAbandonedNodeEnforcement(true);

    /**
     * Tests filtering of PubSub messages to leave OBJECT_FINALIZE type of messages
     */
    @Test
    public void testCalculation() {
//        int element1Quantity = 2;
//        int element2Quantity = 3;
//        int element3Quantity = 5;
//
//        String element1 = "1";
//        String element2 = "2";
//        String element3 = "3";
//
//        List<String> inputTestData = new ArrayList<>();
//        IntStream.range(0, element1Quantity).forEach(index -> inputTestData.add(element1));
//        IntStream.range(0, element2Quantity).forEach(index -> inputTestData.add(element2));
//        IntStream.range(0, element3Quantity).forEach(index -> inputTestData.add(element3));
//
//        PCollection<Map<String, SequenceCountAndTaxonomyData>> accumulatedData = testPipeline
//                .apply(Create.of(inputTestData))
//                .apply(ParDo.of(new AddValueDoFn<>()))
//                .apply(
//                        Window.<KV<String, List<String>>>into(
//                                new GlobalWindows())
//                                .triggering(Repeatedly.forever(AfterProcessingTime
//                                        .pastFirstElementInPane().plusDelayOf(Duration.standardSeconds(60))))
//                                .withAllowedLateness(Duration.ZERO)
//                                .accumulatingFiredPanes())
//                .apply(Combine.globally(new KVCalculationAccumulatorFn()))
//                .apply("Take only last pane", Window.<Map<String, SequenceCountAndTaxonomyData>>into(new GlobalWindows())
//                        .triggering(Repeatedly.forever(AfterProcessingTime
//                                .pastFirstElementInPane().plusDelayOf(Duration.ZERO)))
//                        .withAllowedLateness(Duration.ZERO)
//                        .discardingFiredPanes());
//        PAssert
//                .that(accumulatedData)
//                .satisfies((SerializableFunction<Iterable<Map<String, SequenceCountAndTaxonomyData>>, Void>) input -> {
//                    //TODO
//                    return null;
//                });

        testPipeline.run();
    }
}
