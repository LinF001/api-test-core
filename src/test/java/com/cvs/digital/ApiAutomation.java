package com.cvs.digital;

import org.junit.Assert;

/**
 * ApiAutomation sample
 */
public class ApiAutomation {
    private String url;

    public ApiAutomation() {
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public void testUrl() {
        Assert.assertNotNull(this.url, "Invalid eempty URL!");
    }
}
