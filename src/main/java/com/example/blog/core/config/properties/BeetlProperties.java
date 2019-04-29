package com.example.blog.core.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import java.util.Properties;

/**
 * @Auther: eros
 * @Date: 2019/4/29 16:03
 * @Description:
 */
@Configuration
@ConfigurationProperties(prefix = BeetlProperties.BEETL_CONF_PREFIX)
public class BeetlProperties {

    public static final String BEETL_CONF_PREFIX = "beetl";

    private String delimiterPlaceHolderStart;

    private String delimiterPlaceHolderEnd;

    private String delimiterStatementStart;

    private String delimiterStatementEnd;

    private String templateCharset;

    private String resourceTagroot;

    private String resourceTagsuffix;

    private String resourceAutoCheck;

    @Value("${spring.mvc.view.prefix}")
    private String prefix;

    public Properties getProperties() {
        Properties properties = new Properties();
        if (!StringUtils.isEmpty(delimiterStatementStart)) {
            if (delimiterStatementStart.startsWith("\\")) {
                delimiterStatementStart = delimiterStatementStart.substring(1);
            }
            properties.setProperty("DELIMITER_STATEMENT_START", delimiterStatementStart);
        }
        if (!StringUtils.isEmpty(delimiterStatementEnd)) {
            properties.setProperty("DELIMITER_STATEMENT_END", delimiterStatementEnd);
        } else {
            properties.setProperty("DELIMITER_STATEMENT_END", "null");
        }
        if (!StringUtils.isEmpty(resourceTagroot)) {
            properties.setProperty("RESOURCE.tagRoot", resourceTagroot);
        }
        if (!StringUtils.isEmpty(resourceTagsuffix)) {
            properties.setProperty("RESOURCE.tagSuffix", resourceTagsuffix);
        }
        if (!StringUtils.isEmpty(resourceAutoCheck)) {
            properties.setProperty("RESOURCE.autoCheck", resourceAutoCheck);
        }
        if (!StringUtils.isEmpty(resourceAutoCheck)) {
            properties.setProperty("DELIMITER_PLACEHOLDER_START", delimiterPlaceHolderStart);
        }
        if (!StringUtils.isEmpty(resourceAutoCheck)) {
            properties.setProperty("DELIMITER_PLACEHOLDER_END", delimiterPlaceHolderEnd);
        }
        if (!StringUtils.isEmpty(templateCharset)) {
            properties.setProperty("TEMPLATE_CHARSET", templateCharset);
        }
        return properties;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getDelimiterPlaceHolderStart() {
        return delimiterPlaceHolderStart;
    }

    public void setDelimiterPlaceHolderStart(String delimiterPlaceHolderStart) {
        this.delimiterPlaceHolderStart = delimiterPlaceHolderStart;
    }

    public String getDelimiterPlaceHolderEnd() {
        return delimiterPlaceHolderEnd;
    }

    public void setDelimiterPlaceHolderEnd(String delimiterPlaceHolderEnd) {
        this.delimiterPlaceHolderEnd = delimiterPlaceHolderEnd;
    }

    public String getDelimiterStatementStart() {
        return delimiterStatementStart;
    }

    public void setDelimiterStatementStart(String delimiterStatementStart) {
        this.delimiterStatementStart = delimiterStatementStart;
    }

    public String getDelimiterStatementEnd() {
        return delimiterStatementEnd;
    }

    public void setDelimiterStatementEnd(String delimiterStatementEnd) {
        this.delimiterStatementEnd = delimiterStatementEnd;
    }

    public String getTemplateCharset() {
        return templateCharset;
    }

    public void setTemplateCharset(String templateCharset) {
        this.templateCharset = templateCharset;
    }

    public String getResourceTagroot() {
        return resourceTagroot;
    }

    public void setResourceTagroot(String resourceTagroot) {
        this.resourceTagroot = resourceTagroot;
    }

    public String getResourceTagsuffix() {
        return resourceTagsuffix;
    }

    public void setResourceTagsuffix(String resourceTagsuffix) {
        this.resourceTagsuffix = resourceTagsuffix;
    }

    public String getResourceAutoCheck() {
        return resourceAutoCheck;
    }

    public void setResourceAutoCheck(String resourceAutoCheck) {
        this.resourceAutoCheck = resourceAutoCheck;
    }
}
