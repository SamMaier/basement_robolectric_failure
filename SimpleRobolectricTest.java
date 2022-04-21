package smaier;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;



@RunWith(RobolectricTestRunner.class)
@Config(manifest=Config.NONE)
public class SimpleRobolectricTest {

    @Test
    public void testApiException() {
        new ApiException(new Status(CommonStatusCodes.ERROR, ""));
        assertFalse(false);

    }
}
