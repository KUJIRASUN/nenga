package jp.rync.nenga.base.domain.models;

import jp.rync.nenga.UnitTestInterface;
import org.junit.jupiter.api.Test;

public interface IdentifierUnitTest<T, ID extends Identifier<T>> extends UnitTestInterface<ID> {
    @Test
    void getValueTest();
}