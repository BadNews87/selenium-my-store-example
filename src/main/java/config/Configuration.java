package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "classpath:general.properties"})
public interface Configuration extends Config {

    @Key("base.url")
    String baseUrl();

    @Key("timeout")
    int timeout();
}
