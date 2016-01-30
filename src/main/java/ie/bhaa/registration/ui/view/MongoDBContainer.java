package ie.bhaa.registration.ui.view;

import ie.bhaa.registration.domain.Runner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vaadin.data.util.BeanContainer;

@Component
@Scope("prototype")
public class MongoDBContainer extends BeanContainer<String, Runner> {

    private static final long serialVersionUID = 3090067422968423191L;

    public static final String BEAN_ID = "id";

    public static final Object[] PROPERTIES = {BEAN_ID, "firstName", "lastName"};

    public static final String[] HEADERS = {"ID", "First Name", "Last Name"};

    public MongoDBContainer() {
        super(Runner.class);
        setBeanIdProperty(BEAN_ID);
    }
}
