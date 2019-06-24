package regression;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SearchByTitleTests extends BaseTest {

    @Test
    public void testSearchByOnlyTitle() {
        String titleExpected = "titanic";
        Map<String, Object> params = new HashMap<>();
        params.put("t", titleExpected);
        String titleActual = restAssuredClient.getMovies(params).getTitle();
        Assert.assertTrue(titleActual.toLowerCase().contains(titleExpected.toLowerCase()), String.format("Actual title [%s] doesn't contain text [%s]", titleActual, titleExpected));
    }

}
