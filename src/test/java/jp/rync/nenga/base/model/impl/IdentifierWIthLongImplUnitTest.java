package jp.rync.nenga.base.model.impl;

import jp.rync.nenga.base.model.Identifier;
import jp.rync.nenga.base.model.IdentifierWithLongUnitTest;

public class IdentifierWIthLongImplUnitTest implements IdentifierWithLongUnitTest<Identifier<Long>> {
    @Override
    public Identifier<Long> generateTestInstance() {
        return new Identifier<Long>(1L);
    }
}
