package ie.bhaa.registration.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by pauloconnell on 27/01/17.
 */
@ConfigurationProperties
public class MembershipFileServiceBean implements MembershipFileService {

    private Logger logger = Logger.getLogger(MembershipFileServiceBean.class);

    @Value("${url}")
    private String url;

    public String getUrl(){
        return url;
    }

    public void setUrl(){
        this.url = url;
    }

//    private String DYNAMIC_FOLDER = "/dynamic";
//    private String MEMBERS_JSON = "members-list.json";
//
//    private File folder;
//    private ResourceLoader resourceLoader;

    @Override
    public String getMembershipFile() {
        logger.info(getUrl());
        return getUrl();
    }

    @Override
    public void reloadMembershipFile() {

    }

    @Override
    public void clearMembershipFile() {

    }
}
