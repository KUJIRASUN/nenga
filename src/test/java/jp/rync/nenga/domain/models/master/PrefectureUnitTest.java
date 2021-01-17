package jp.rync.nenga.domain.models.master;

import jp.rync.nenga.UnitTestInterface;
import org.junit.jupiter.api.Test;

class PrefectureUnitTest implements UnitTestInterface<Prefecture> {
    @Test
    void getCodeTest() {
        Integer expected = 1;
        Integer actual = generateTestInstance().getCode().getValue();
        assertEqualsWithLogger(expected, actual);
    }

    @Test
    void getNameTest() {
        String expected = "北海道";
        String actual = generateTestInstance().getName();
        assertEqualsWithLogger(expected, actual);
    }

    @Override
    public Prefecture generateTestInstance() {
        return new Prefecture(new PrefectureCode(1), "北海道");
    }
}