
package tech.adamu.covidupdates.models.news;

import java.io.Serializable;
import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class VaccineSearchResponse implements Serializable {

    @SerializedName("news")
    @Expose
    private List<News> news = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VaccineSearchResponse() {
    }

    /**
     * 
     * @param news
     */
    public VaccineSearchResponse(List<News> news) {
        super();
        this.news = news;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

}
