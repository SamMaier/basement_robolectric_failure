package smaier;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

import com.google.android.gms.common.api.ApiException;
import org.robolectric.RobolectricTestRunner;

import org.robolectric.annotation.Config;



@RunWith(RobolectricTestRunner.class)
@Config(manifest=Config.NONE)
public class SimpleRobolectricTest {

    @Test
    public void testApiException() {
        new ApiException(null);
        assertFalse(false);

    }
}
