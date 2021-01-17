package jp.rync.nenga.domain.models.family;

import jp.rync.nenga.base.domain.models.EntityWithLongUnitTest;
import org.junit.jupiter.api.Test;

interface FamilyUnitTest extends EntityWithLongUnitTest<FamilyId, Family> {
    @Test
    default void getPostalCodeTest() {
        String expected = "123-4567";
        String actual = generateTestInstance().getPostalCode();
        assertEqualsWithLogger(expected, actual);
    }

    @Test
    default void getPrefectureTest() {
        String expected = "東京都";
        String actual = generateTestInstance().getPrefecture().getName();
        assertEqualsWithLogger(expected, actual);
    }

    @Test
    default void getCityTest() {
        String expected = "杉並区";
        String actual = generateTestInstance().getCity();
        assertEqualsWithLogger(expected, actual);
    }

    @Test
    default void getAddressTest() {
        String expected = "堀之内1丁目";
        String actual = generateTestInstance().getAddress();
        assertEqualsWithLogger(expected, actual);
    }

    @Test
    default void getBuildingTest() {
        String expected = "テストビル";
        String actual = generateTestInstance().getBuilding();
        assertEqualsWithLogger(expected, actual);
    }

    @Test
    default void getFamilyNameTest() {
        String expected = "家族";
        String actual = generateTestInstance().getFamilyName();
        assertEqualsWithLogger(expected, actual);
    }
}