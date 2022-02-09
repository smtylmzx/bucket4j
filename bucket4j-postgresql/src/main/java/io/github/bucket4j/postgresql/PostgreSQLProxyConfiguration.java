package io.github.bucket4j.postgresql;

import io.github.bucket4j.distributed.jdbc.BucketTableSettings;
import io.github.bucket4j.distributed.proxy.ClientSideConfig;

import javax.sql.DataSource;

public class PostgreSQLProxyConfiguration {

    private final DataSource dataSource;
    private final ClientSideConfig clientSideConfig;
    private final BucketTableSettings tableSettings;

    public PostgreSQLProxyConfiguration(DataSource dataSource) {
        this(dataSource, ClientSideConfig.getDefault(), BucketTableSettings.getDefault());
    }

    public PostgreSQLProxyConfiguration(DataSource dataSource, ClientSideConfig clientSideConfig, BucketTableSettings tableSettings) {
        this.dataSource = dataSource;
        this.clientSideConfig = clientSideConfig;
        this.tableSettings = tableSettings;
    }

    public String getIdName() {
        return tableSettings.getIdName();
    }

    public String getStateName() {
        return tableSettings.getStateName();
    }

    public String getTableName() {
        return tableSettings.getTableName();
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public ClientSideConfig getClientSideConfig() {
        return clientSideConfig;
    }
}