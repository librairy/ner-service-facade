package org.librairy.service.nlp.facade;

import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.librairy.service.ner.facade.AvroClient;
import org.librairy.service.ner.facade.AvroServer;
import org.librairy.service.ner.facade.model.Annotation;
import org.librairy.service.ner.facade.model.Class;
import org.librairy.service.ner.facade.model.Entity;
import org.librairy.service.ner.facade.model.NerService;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class CommunicationTest {

    @Test
    public void exchange() throws InterruptedException, IOException {


        NerService customService = new NerService() {
            @Override
            public List<Entity> identify(String text, List<Class> filter) throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public List<Annotation> annotate(String text, List<Class> filter) throws AvroRemoteException {
                return Collections.emptyList();
            }
        };
        AvroServer server = new AvroServer(customService);

        AvroClient client = new AvroClient();


        String host     = "localhost";
        Integer port    = 65111;

        server.open(host,port);
        client.open(host,port);

        List<String> texts = Arrays.asList(new String[]{"example 1", "example 2", "example 3"});


        texts.forEach(text -> {
            try {
                client.identify(text, Arrays.asList(new Class[]{Class.LOCATION, Class.PERSON}));
                client.annotate(text, Collections.emptyList());
            } catch (AvroRemoteException e) {
                e.printStackTrace();
            }
        });

        client.close();
        server.close();
    }

}
