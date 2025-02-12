// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the content filtering category, if it has been detected. */
@Immutable
public final class ContentFilterResults {

    /*
     * Describes language related to anatomical organs and genitals, romantic relationships,
     * acts portrayed in erotic or affectionate terms, physical sexual acts, including
     * those portrayed as an assault or a forced sexual violent act against one’s will,
     * prostitution, pornography, and abuse.
     */
    @Generated
    @JsonProperty(value = "sexual")
    private ContentFilterResult sexual;

    /*
     * Describes language related to physical actions intended to hurt, injure, damage, or
     * kill someone or something; describes weapons, etc.
     */
    @Generated
    @JsonProperty(value = "violence")
    private ContentFilterResult violence;

    /*
     * Describes language attacks or uses that include pejorative or discriminatory language
     * with reference to a person or identity group on the basis of certain differentiating
     * attributes of these groups including but not limited to race, ethnicity, nationality,
     * gender identity and expression, sexual orientation, religion, immigration status, ability
     * status, personal appearance, and body size.
     */
    @Generated
    @JsonProperty(value = "hate")
    private ContentFilterResult hate;

    /*
     * Describes language related to physical actions intended to purposely hurt, injure,
     * or damage one’s body, or kill oneself.
     */
    @Generated
    @JsonProperty(value = "self_harm")
    private ContentFilterResult selfHarm;

    /**
     * Get the sexual property: Describes language related to anatomical organs and genitals, romantic relationships,
     * acts portrayed in erotic or affectionate terms, physical sexual acts, including those portrayed as an assault or
     * a forced sexual violent act against one’s will, prostitution, pornography, and abuse.
     *
     * @return the sexual value.
     */
    @Generated
    public ContentFilterResult getSexual() {
        return this.sexual;
    }

    /**
     * Get the violence property: Describes language related to physical actions intended to hurt, injure, damage, or
     * kill someone or something; describes weapons, etc.
     *
     * @return the violence value.
     */
    @Generated
    public ContentFilterResult getViolence() {
        return this.violence;
    }

    /**
     * Get the hate property: Describes language attacks or uses that include pejorative or discriminatory language with
     * reference to a person or identity group on the basis of certain differentiating attributes of these groups
     * including but not limited to race, ethnicity, nationality, gender identity and expression, sexual orientation,
     * religion, immigration status, ability status, personal appearance, and body size.
     *
     * @return the hate value.
     */
    @Generated
    public ContentFilterResult getHate() {
        return this.hate;
    }

    /**
     * Get the selfHarm property: Describes language related to physical actions intended to purposely hurt, injure, or
     * damage one’s body, or kill oneself.
     *
     * @return the selfHarm value.
     */
    @Generated
    public ContentFilterResult getSelfHarm() {
        return this.selfHarm;
    }

    /** Creates an instance of ContentFilterResults class. */
    @Generated
    private ContentFilterResults() {}
}
