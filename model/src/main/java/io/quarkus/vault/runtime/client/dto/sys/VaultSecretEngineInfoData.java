package io.quarkus.vault.runtime.client.dto.sys;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VaultSecretEngineInfoData {

    public String description;

    @JsonProperty("external_entropy_access")
    public Boolean externalEntropyAccess;

    public Boolean local;

    @JsonProperty("seal_wrap")
    public Boolean sealWrap;

    public String type;

    public Map<String, Object> options;
}
