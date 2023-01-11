package com.orangehrm.testdata;

import com.orangehrm.entity.LoginDetails;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class LoginTestData {
    private static final PodamFactoryImpl FACTORY = new PodamFactoryImpl();

    public static LoginDetails getValidLoginDetails() {
        return FACTORY.manufacturePojo(LoginDetails.class);
    }
}
