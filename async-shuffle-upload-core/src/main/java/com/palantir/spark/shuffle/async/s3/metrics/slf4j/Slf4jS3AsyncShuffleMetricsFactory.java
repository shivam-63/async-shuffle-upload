/*
 * (c) Copyright 2019 Palantir Technologies Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palantir.spark.shuffle.async.s3.metrics.slf4j;

import com.palantir.spark.shuffle.async.s3.metrics.S3AsyncShuffleMetrics;
import com.palantir.spark.shuffle.async.s3.metrics.S3AsyncShuffleMetricsFactory;
import org.apache.spark.SparkConf;

public final class Slf4jS3AsyncShuffleMetricsFactory implements S3AsyncShuffleMetricsFactory {

    @Override
    public S3AsyncShuffleMetrics create(SparkConf _sparkConf, String sparkAppName) {
        return new Slf4jS3AsyncShuffleMetrics(sparkAppName);
    }
}
