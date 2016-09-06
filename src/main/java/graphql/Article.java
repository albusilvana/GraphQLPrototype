package graphql;

import java.util.List;

/**
 * Created by silvana.albert on 9/6/16.
 */
public class Article {
    private String sequenceId;

    private String id;

    private String language;

    private String languageCode;

    private String title;

    private String subTitle;

    private String content;

    private String contentWithMarkup;

    private String extract;

    private List<String> tags;

    private String publishedDate;

    private String harvestDate;

    private String estimatedPublishedDate;

    private String embargoDate;

    private String licenseEndDate;

    private String contentLicenseEndDate;

    private String url;

    private String originalUrl;

    private String commentsUrl;

    private List<String> outboundUrls;

    private String wordCount;

    private String dataFormat;

    private String copyright;

    private String loginStatus;

    private String duplicateGroupId;

    private String contentGroupIds;

//    private Harvest harvest;
//
//    private Media media;
//
//    private ArticlePublishingPlatform publishingPlatform;

    private String adultLanguage;

//    private List<Topic> topics;
//
//    private List<IndexTerm> indexTerms;
//
//    private List<Company> companies;
//
//    private List<ArticleLocation> locations;
//
//    private Semantics semantics;
//
//    private Sentiment sentiment;
//
//    private Print print;
//
//    private Broadcast broadcast;
//
//    private Author author;
//
//    private List<License> licenses;
//
//    private List<LinkedArticle> linkedArticles;
//
//    private AdvertisingValueEquivalency advertisingValueEquivalency;
//
//    private Source source;

    private List<String> matchingFilters;


    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentWithMarkup() {
        return contentWithMarkup;
    }

    public void setContentWithMarkup(String contentWithMarkup) {
        this.contentWithMarkup = contentWithMarkup;
    }

    public String getExtract() {
        return extract;
    }

    public void setExtract(String extract) {
        this.extract = extract;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getHarvestDate() {
        return harvestDate;
    }

    public void setHarvestDate(String harvestDate) {
        this.harvestDate = harvestDate;
    }

    public String getEstimatedPublishedDate() {
        return estimatedPublishedDate;
    }

    public void setEstimatedPublishedDate(String estimatedPublishedDate) {
        this.estimatedPublishedDate = estimatedPublishedDate;
    }

    public String getEmbargoDate() {
        return embargoDate;
    }

    public void setEmbargoDate(String embargoDate) {
        this.embargoDate = embargoDate;
    }

    public String getLicenseEndDate() {
        return licenseEndDate;
    }

    public void setLicenseEndDate(String licenseEndDate) {
        this.licenseEndDate = licenseEndDate;
    }

    public String getContentLicenseEndDate() {
        return contentLicenseEndDate;
    }

    public void setContentLicenseEndDate(String contentLicenseEndDate) {
        this.contentLicenseEndDate = contentLicenseEndDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public List<String> getOutboundUrls() {
        return outboundUrls;
    }

    public void setOutboundUrls(List<String> outboundUrls) {
        this.outboundUrls = outboundUrls;
    }

    public String getWordCount() {
        return wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }

    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getDuplicateGroupId() {
        return duplicateGroupId;
    }

    public void setDuplicateGroupId(String duplicateGroupId) {
        this.duplicateGroupId = duplicateGroupId;
    }

    public String getContentGroupIds() {
        return contentGroupIds;
    }

    public void setContentGroupIds(String contentGroupIds) {
        this.contentGroupIds = contentGroupIds;
    }

    public String getAdultLanguage() {
        return adultLanguage;
    }

    public void setAdultLanguage(String adultLanguage) {
        this.adultLanguage = adultLanguage;
    }

    public List<String> getMatchingFilters() {
        return matchingFilters;
    }

    public void setMatchingFilters(List<String> matchingFilters) {
        this.matchingFilters = matchingFilters;
    }
}
