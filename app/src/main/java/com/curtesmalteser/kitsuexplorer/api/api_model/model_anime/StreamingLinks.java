
package com.curtesmalteser.kitsuexplorer.api.api_model.model_anime;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StreamingLinks {

    @SerializedName("links")
    @Expose
    private Links links;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
