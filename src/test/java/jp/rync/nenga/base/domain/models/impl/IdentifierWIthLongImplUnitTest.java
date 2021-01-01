package jp.rync.nenga.base.domain.models.impl;

import jp.rync.nenga.base.domain.models.Identifier;
import jp.rync.nenga.base.domain.models.IdentifierWithLongUnitTest;

public class IdentifierWIthLongImplUnitTest implements IdentifierWithLongUnitTest<Identifier<Long>> {
    @Override
    public Identifier<Long> generateTestInstance() {
        return new Identifier<Long>(1L);
    }
}
