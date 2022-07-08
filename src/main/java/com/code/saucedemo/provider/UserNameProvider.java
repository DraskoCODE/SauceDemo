package com.code.saucedemo.provider;

import org.testng.annotations.DataProvider;

public class UserNameProvider {

    @DataProvider(name = "UserNameProvider")
    public static Object[][] getDataFromDataprovider(){
        return new Object[][] {
                { "standard_user"}
                //{ "problem_user" }
                //{ "performance_glitch_user" }
        };
    }

   /* @DataProvider(name = "NonValidUserNameProvider")
    public static Object[][] getNonValidUserNameDataprovider(){
        return new Object[][] {
                { "stefan"},
                { "andrijana" }

        };
    }*/

}
