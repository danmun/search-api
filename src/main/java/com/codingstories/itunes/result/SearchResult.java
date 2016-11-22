package com.codingstories.itunes.result;

/**
 * @author Sergii.Zagriichuk
 */
public class SearchResult {
    private String artworkUrl100;
    private String artworkUrl512;
    
    private String averageUserRatingForCurrentVersion;
    private String userRatingCountForCurrentVersion;
    private String trackContentRating;
    private String version;
    private String price;
    private String formattedPrice;
    private String description;
    private String averageUserRating;
    private String userRatingCount;
    private String currentVersionReleaseDate;
    
    private String wrapperType;
    private String explicitness;
    private String kind;
    private String trackName;
    private String artistName;
    private String collectionName;
    private String censoredName;
    private String artistId;
    private String trackId;
    private String collectionId;
    private String releaseDate;

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public void setArtworkUrl512(String artworkUrl512) {
        this.artworkUrl512 = artworkUrl512;
    }

    public void setAverageUserRatingForCurrentVersion(String averageUserRatingForCurrentVersion) {
        this.averageUserRatingForCurrentVersion = averageUserRatingForCurrentVersion;
    }

    public void setUserRatingCountForCurrentVersion(String userRatingCountForCurrentVersion) {
        this.userRatingCountForCurrentVersion = userRatingCountForCurrentVersion;
    }

    public void setTrackContentRating(String trackContentRating) {
        this.trackContentRating = trackContentRating;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAverageUserRating(String averageUserRating) {
        this.averageUserRating = averageUserRating;
    }

    public void setUserRatingCount(String userRatingCount) {
        this.userRatingCount = userRatingCount;
    }

    public String getFormattedPrice() {
        return formattedPrice;
    }

    public String getCurrentVersionReleaseDate() {
        return currentVersionReleaseDate;
    }

    public void setFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
    }

    public void setCurrentVersionReleaseDate(String currentVersionReleaseDate) {
        this.currentVersionReleaseDate = currentVersionReleaseDate;
    }

    
    
    
    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public String getArtworkUrl512() {
        return artworkUrl512;
    }

    public String getAverageUserRatingForCurrentVersion() {
        return averageUserRatingForCurrentVersion;
    }

    public String getUserRatingCountForCurrentVersion() {
        return userRatingCountForCurrentVersion;
    }

    public String getTrackContentRating() {
        return trackContentRating;
    }

    public String getVersion() {
        return version;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getAverageUserRating() {
        return averageUserRating;
    }

    public String getUserRatingCount() {
        return userRatingCount;
    }

    
    
    public String getWrapperType() {
        return wrapperType;
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public String getExplicitness() {
        return explicitness;
    }

    public void setExplicitness(String explicitness) {
        this.explicitness = explicitness;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getCensoredName() {
        return censoredName;
    }

    public void setCensoredName(String censoredName) {
        this.censoredName = censoredName;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SearchResult that = (SearchResult) o;

        if (artistId != null ? !artistId.equals(that.artistId) : that.artistId != null) return false;
        if (artistName != null ? !artistName.equals(that.artistName) : that.artistName != null) return false;
        if (censoredName != null ? !censoredName.equals(that.censoredName) : that.censoredName != null) return false;
        if (collectionId != null ? !collectionId.equals(that.collectionId) : that.collectionId != null) return false;
        if (collectionName != null ? !collectionName.equals(that.collectionName) : that.collectionName != null) return false;
        if (explicitness != null ? !explicitness.equals(that.explicitness) : that.explicitness != null) return false;
        if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
        if (releaseDate != null ? !releaseDate.equals(that.releaseDate) : that.releaseDate != null) return false;
        if (trackId != null ? !trackId.equals(that.trackId) : that.trackId != null) return false;
        if (trackName != null ? !trackName.equals(that.trackName) : that.trackName != null) return false;
        if (wrapperType != null ? !wrapperType.equals(that.wrapperType) : that.wrapperType != null) return false;
        
        if (artworkUrl100 != null ? !artworkUrl100.equals(that.artworkUrl100) : that.artworkUrl100 != null) return false;
        if (artworkUrl512 != null ? !artworkUrl512.equals(that.artworkUrl512) : that.artworkUrl512 != null) return false;
        if (averageUserRatingForCurrentVersion != null ? !averageUserRatingForCurrentVersion.equals(that.averageUserRatingForCurrentVersion) : that.averageUserRatingForCurrentVersion != null) return false;
        if (userRatingCountForCurrentVersion != null ? !userRatingCountForCurrentVersion.equals(that.userRatingCountForCurrentVersion) : that.userRatingCountForCurrentVersion != null) return false;
        if (trackContentRating != null ? !trackContentRating.equals(that.trackContentRating) : that.trackContentRating != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (averageUserRating != null ? !averageUserRating.equals(that.averageUserRating) : that.averageUserRating != null) return false;
        if (userRatingCount != null ? !userRatingCount.equals(that.userRatingCount) : that.userRatingCount != null) return false;
        if (formattedPrice != null ? !formattedPrice.equals(that.formattedPrice) : that.formattedPrice != null) return false;
        if (currentVersionReleaseDate != null ? !currentVersionReleaseDate.equals(that.currentVersionReleaseDate) : that.currentVersionReleaseDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wrapperType != null ? wrapperType.hashCode() : 0;
        result = 31 * result + (explicitness != null ? explicitness.hashCode() : 0);
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        result = 31 * result + (trackName != null ? trackName.hashCode() : 0);
        result = 31 * result + (artistName != null ? artistName.hashCode() : 0);
        result = 31 * result + (collectionName != null ? collectionName.hashCode() : 0);
        result = 31 * result + (censoredName != null ? censoredName.hashCode() : 0);
        result = 31 * result + (artistId != null ? artistId.hashCode() : 0);
        result = 31 * result + (trackId != null ? trackId.hashCode() : 0);
        result = 31 * result + (collectionId != null ? collectionId.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        
        result = 31 * result + (artworkUrl100 != null ? artworkUrl100.hashCode() : 0);
        result = 31 * result + (artworkUrl512 != null ? artworkUrl512.hashCode() : 0);
        result = 31 * result + (averageUserRatingForCurrentVersion != null ? averageUserRatingForCurrentVersion.hashCode() : 0);
        result = 31 * result + (userRatingCountForCurrentVersion != null ? userRatingCountForCurrentVersion.hashCode() : 0);
        result = 31 * result + (trackContentRating != null ? trackContentRating.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (averageUserRating != null ? averageUserRating.hashCode() : 0);
        result = 31 * result + (userRatingCount != null ? userRatingCount.hashCode() : 0);
        result = 31 * result + (currentVersionReleaseDate != null ? currentVersionReleaseDate.hashCode() : 0);
        result = 31 * result + (formattedPrice != null ? formattedPrice.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "artworkUrl100='" + artworkUrl100 + '\'' +
                ", artowrkUrl512='" + artworkUrl512 + '\'' +
                ", averageUserRatingForCurrentVersion='" + averageUserRatingForCurrentVersion + '\'' +
                ", userRatingCountForCurrentVersion='" + userRatingCountForCurrentVersion + '\'' +
                ", trackContentRating='" + trackContentRating + '\'' +
                ", version='" + version + '\'' +
                ", price='" + price + '\'' +
                ", formattedPrice='" + formattedPrice + '\'' +
                ", description='" + description + '\'' +
                ", averageUserRating='" + averageUserRating + '\'' +
                ", userRatingCount='" + userRatingCount + '\'' +
                ", wrapperType='" + wrapperType + '\'' +
                ", explicitness='" + explicitness + '\'' +
                ", kind='" + kind + '\'' +
                ", trackName='" + trackName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", collectionName='" + collectionName + '\'' +
                ", censoredName='" + censoredName + '\'' +
                ", artistId='" + artistId + '\'' +
                ", trackId='" + trackId + '\'' +
                ", collectionId='" + collectionId + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", currentVerReleaseDate='" + currentVersionReleaseDate + '\'' +
                '}';
    }
}
