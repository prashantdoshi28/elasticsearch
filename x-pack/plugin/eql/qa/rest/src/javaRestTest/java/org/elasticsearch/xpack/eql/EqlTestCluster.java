/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */

package org.elasticsearch.xpack.eql;

import org.elasticsearch.test.cluster.ElasticsearchCluster;
import org.elasticsearch.test.cluster.local.distribution.DistributionType;

public class EqlTestCluster {

    public static ElasticsearchCluster getCluster() {
        return ElasticsearchCluster.local()
            .nodes(1)
            .distribution(DistributionType.DEFAULT)
            .setting("xpack.license.self_generated.type", "basic")
            .setting("xpack.monitoring.collection.enabled", "true")
            .setting("xpack.security.enabled", "false")
            .build();
    }

}
