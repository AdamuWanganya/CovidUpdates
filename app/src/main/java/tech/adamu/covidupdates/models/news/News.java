
package tech.adamu.covidupdates.models.news;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//@Generated("jsonschema2pojo")
public class News implements Serializable {

    @SerializedName("news_id")
    @Expose
    private String newsId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("urlToImage")
    @Expose
    private String urlToImage;
    @SerializedName("imageInLocalStorage")
    @Expose
    private String imageInLocalStorage;
    @SerializedName("imageFileName")
    @Expose
    private String imageFileName;
    @SerializedName("pubDate")
    @Expose
    private String pubDate;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("reference")
    @Expose
    private String reference;

    /**
     * No args constructor for use in serialization
     * 
     */
    public News() {
    }

    /**
     * 
     * @param reference
     * @param newsId
     * @param urlToImage
     * @param imageFileName
     * @param link
     * @param title
     * @param imageInLocalStorage
     * @param pubDate
     * @param content
     */
    public News(String newsId, String title, String link, String urlToImage, String imageInLocalStorage, String imageFileName, String pubDate, String content, String reference) {
        super();
        this.newsId = newsId;
        this.title = title;
        this.link = link;
        this.urlToImage = urlToImage;
        this.imageInLocalStorage = imageInLocalStorage;
        this.imageFileName = imageFileName;
        this.pubDate = pubDate;
        this.content = content;
        this.reference = reference;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getImageInLocalStorage() {
        return imageInLocalStorage;
    }

    public void setImageInLocalStorage(String imageInLocalStorage) {
        this.imageInLocalStorage = imageInLocalStorage;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

}
