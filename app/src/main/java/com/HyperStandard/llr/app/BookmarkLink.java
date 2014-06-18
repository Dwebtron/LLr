package com.HyperStandard.llr.app;

/**
 * Created by nonex_000 on 6/17/2014.
 */
public class BookmarkLink {
    private String bookmarkName;
    private String bookmarkTags;
    private String action;

    public String getBookmarkTags() {
        return bookmarkTags;
    }

    public String getBookmarkName() {
        return bookmarkName;
    }

    public String getAction() {
        return action;
    }

    BookmarkLink(String bookmarkName, String bookmarkTags, String action) {
        this.bookmarkTags = bookmarkTags;
        this.bookmarkName = bookmarkName;
        this.action = action;
    }
}
