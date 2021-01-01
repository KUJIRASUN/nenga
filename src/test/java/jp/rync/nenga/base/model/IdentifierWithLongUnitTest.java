package jp.rync.nenga.base.model;

import org.junit.jupiter.api.Test;

public interface IdentifierWithLongUnitTest<ID extends Identifier<Long>> extends IdentifierUnitTest<Long, ID> {
    @Test
    @Override
    default void getValueTest() {
        Long expected = (new Identifier<Long>(1L)).getValue();
        Long actual = generateTestInstance().getValue();
        assertEqualsWithLogger(expected, actual);
    }
}
