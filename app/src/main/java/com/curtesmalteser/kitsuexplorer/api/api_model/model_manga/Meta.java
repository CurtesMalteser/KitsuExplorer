
package com.curtesmalteser.kitsuexplorer.api.api_model.model_manga;

import com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("dimensions")
    @Expose
    private com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Dimensions dimensions;

    public com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(com.curtesmalteser.kitsuexplorer.api.api_model.model_anime.Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    @SerializedName("count")
    @Expose
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
