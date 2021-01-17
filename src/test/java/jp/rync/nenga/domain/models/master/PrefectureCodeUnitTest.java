package jp.rync.nenga.domain.models.master;

import jp.rync.nenga.UnitTestInterface;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrefectureCodeUnitTest implements UnitTestInterface<PrefectureCode> {
    @Test
    void getValueTest() {
        Integer expected = 1;
        Integer actual = generateTestInstance().getValue();
        assertEquals(expected, actual);
    }

    @Override
    public PrefectureCode generateTestInstance() {
        return new PrefectureCode(1);
    }
}