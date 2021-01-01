package jp.rync.nenga.base.model.impl;

import jp.rync.nenga.base.model.Entity;
import jp.rync.nenga.base.model.EntityWithLongUnitTest;
import jp.rync.nenga.base.model.Identifier;

import java.util.Optional;

public class EntityWithLongImplUnitTest implements EntityWithLongUnitTest<Identifier<Long>, Entity<Identifier<Long>>> {
    @Override
    public Entity<Identifier<Long>> generateTestInstance() {
        return new Entity<Identifier<Long>>(Optional.of(new Identifier<Long>(1L)));
    }

    @Override
    public Entity<Identifier<Long>> generateTestInstanceForIdNotFound() {
        return new Entity<Identifier<Long>>(Optional.empty());
    }
}
