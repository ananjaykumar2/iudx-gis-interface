package iudx.gis.server.apiserver;

import io.vertx.junit5.VertxExtension;
import io.vertx.junit5.VertxTestContext;
import iudx.gis.server.apiserver.util.RequestType;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(VertxExtension.class)
public class RequestTypeTest {
    @ParameterizedTest
    @EnumSource
    public void test(RequestType requestType, VertxTestContext testContext){
        assertNotNull(requestType);
        testContext.completeNow();
    }
}
