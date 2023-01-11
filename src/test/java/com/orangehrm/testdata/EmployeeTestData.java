package com.orangehrm.testdata;

import com.orangehrm.entity.EmployeeDetails;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class EmployeeTestData {

    private static final PodamFactoryImpl FACTORY = new PodamFactoryImpl();

    public static EmployeeDetails getRandomEmployeeDetails() {
        return FACTORY.manufacturePojo(EmployeeDetails.class);
    }
}
